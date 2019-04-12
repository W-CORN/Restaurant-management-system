package team.ruike.cim.service.impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ContractOrderDao;
import team.ruike.cim.dao.ContractProductionPlanDao;
import team.ruike.cim.dao.ContractProductionPlanItemDao;
import team.ruike.cim.pojo.ContractOrder;
import team.ruike.cim.pojo.ContractOrderTerm;
import team.ruike.cim.pojo.ContractProductionPlan;
import team.ruike.cim.pojo.ContractProductionPlanItem;
import team.ruike.cim.service.ProductionService;
import team.ruike.cim.util.DateUtil;
import team.ruike.cim.util.GenerateNumber;

import javax.annotation.Resource;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 生产业务实现类
 * @author 张振国
 * @version 1.0
 */
@Service("productionService")
public class ProductionServiceImpl implements ProductionService {
    @Resource
    private ContractOrderDao contractOrderDao;
    @Resource
    private ContractProductionPlanDao contractProductionPlanDao;
    @Resource
    private ContractProductionPlanItemDao contractProductionPlanItemDao;
    /**
     * 今日合同生产计划生成
     */
    @Override
//    @Scheduled(cron = "0 03 14 ? * *")
    public void generateContractProductionPlan() throws ParseException {
        //实例化生产计划对象
        ContractProductionPlan contractProductionPlan=new ContractProductionPlan();
        contractProductionPlan.setContractProductionPlanItems(new ArrayList<ContractProductionPlanItem>());
        //1.查询未完成的合同订单
        ContractOrder contractOrder=new ContractOrder();
        contractOrder.setContractOrderState(0);
        List<ContractOrder> contractOrders = contractOrderDao.select(contractOrder, 0, 9999);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(DateUtil.getNextDate());
        for (ContractOrder order : contractOrders) {
            //1.为生产计划对象赋值
            contractProductionPlan.setContractOrder(order);
            contractProductionPlan.setProductionBatch(GenerateNumber.getGenerateNumber().getRandomFileName());
            contractProductionPlan.setStatus(0);
            contractProductionPlan.setDate(sdf.parse(format));
            //2.调用数据层方法进行新增计划操作
            contractProductionPlanDao.add(contractProductionPlan);
            //3.循环读取订单项数据进行新增计划项操作
            for (ContractOrderTerm contractOrderTerm : order.getContractOrderTerms()) {
                if (contractOrderTerm.getContractOrderTermState()==0){
                    ContractProductionPlanItem contractProductionPlanItem=new ContractProductionPlanItem();
                    contractProductionPlanItem.setContractProductionPlanId(contractProductionPlan.getContractProductionPlanId());
                    contractProductionPlanItem.setMenu(contractOrderTerm.getMenu());
                    //如果交付日期在当前日期之后就进行平均分配否则直接生成
                    if (order.getContractOrderEndDate().after(sdf.parse(format))){
                        //计算从今日到订单交付时间还有多少天
                        int i = DateUtil.differentDays(order.getContractOrderStartDate(),order.getContractOrderEndDate());
                        System.out.println(i);
                        int i1 = contractOrderTerm.getMenuNumber() / i;//计算每日要生产的量
                        //赋值到contractProductionPlanItem
                        contractProductionPlanItem.setMenuNumber(i1);
                        if (i1<=15){
                            contractProductionPlanItem.setMenuNumber(contractOrderTerm.getMenuNumber()-contractOrderTerm.getCompleteNumber());
                        }
                    }else {
                        contractProductionPlanItem.setMenuNumber(contractOrderTerm.getMenuNumber()-contractOrderTerm.getCompleteNumber());
                    }
                    contractProductionPlanItem.setContractOrderTerm(contractOrderTerm);
                    contractProductionPlanItem.setStatus(0);
                    contractProductionPlanItemDao.add(contractProductionPlanItem);
                    contractProductionPlan.getContractProductionPlanItems().add(contractProductionPlanItem);
                }
            }
        }
    }

    @Override
//    @Scheduled(cron = "0 54 21 ? * *")
    public void test() throws IOException {
//        for (WebSocket webSocket : WebSocketFactory.webSocketMap.values()) {
//            System.out.println(1);
//            webSocket.getSession().getBasicRemote().sendText("生产");
//        }
    }
}
