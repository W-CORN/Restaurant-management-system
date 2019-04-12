package team.ruike.cim.service.impl;
import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ContractProductionDistributionDao;
import team.ruike.cim.dao.ContractProductionPlanDao;
import team.ruike.cim.dao.ContractProductionPlanItemDao;
import team.ruike.cim.pojo.ContractProductionDistribution;
import team.ruike.cim.pojo.ContractProductionPlan;
import team.ruike.cim.pojo.ContractProductionPlanItem;
import team.ruike.cim.service.ContractProductionPlanService;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 生产系统业务实现类
 * @author 张振国
 * @version 1.0
 */
@Service("contractProductionPlanService")
public class ContractProductionPlanServiceImpl implements ContractProductionPlanService {

    @Resource
    private ContractProductionPlanDao contractProductionPlanDao;
    @Resource
    private ContractProductionDistributionDao contractProductionDistributionDao;
    @Resource
    private ContractProductionPlanItemDao contractProductionPlanItemDao;
    /**
     * 获取今日生产计划
     * @return 今日生产计划集合
     */
    @Override
    public List<ContractProductionPlan> getDayContractProductionPlans() throws ParseException {
        ContractProductionPlan contractProductionPlan=new ContractProductionPlan();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        contractProductionPlan.setDate(simpleDateFormat.parse(new Date().toLocaleString()));
        return contractProductionPlanDao.select(contractProductionPlan,0,99);
    }

    /**
     * 根据合同生产计划项Id获取合同订单计划集合
     * @param contractProductionPlanItemId 生产计划项Id
     * @return 合同订单计划集合
     */
    @Override
    public List<ContractProductionDistribution> getContractProductionDistributions(Integer contractProductionPlanItemId) {
        //实例化并赋值订单项对象（作为查询参数）
        ContractProductionDistribution contractProductionDistribution=new ContractProductionDistribution();
        ContractProductionPlanItem contractProductionPlanItem=new ContractProductionPlanItem();
        contractProductionPlanItem.setContractProductionPlanItemId(contractProductionPlanItemId);
        contractProductionDistribution.setContractProductionPlanItem(contractProductionPlanItem);
        //调用Dao查询方法
        return contractProductionDistributionDao.select(contractProductionDistribution, 0, 99);
    }

    @Override
    public ContractProductionPlanItem getContractProductionPlanItem(Integer contractProductionPlanItemId) {
        return contractProductionPlanItemDao.selectById(contractProductionPlanItemId);
    }


}
