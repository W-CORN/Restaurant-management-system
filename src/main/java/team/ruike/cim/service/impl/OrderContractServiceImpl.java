package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.OrderContractDao;
import team.ruike.cim.pojo.OrderContract;
import team.ruike.cim.service.OrderContractService;
import team.ruike.cim.util.ArchivesLog;
import team.ruike.cim.util.GenerateNumber;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单合同业务类
 *
 * @author 甄立
 * @version 1.0
 */
@Service("orderContractService")
public class OrderContractServiceImpl implements OrderContractService {
    @Resource
    private OrderContractDao orderContractDao;


    public void queryOrderContract(OrderContract orderContract, Pager<OrderContract> pager) {
        Integer count = orderContractDao.selectCount(orderContract);
        pager.setTotalRecord(count);
        List<OrderContract> orderContractList = orderContractDao.select(orderContract, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize());
        pager.setList(orderContractList);
    }

    public OrderContract queryOrderContractById(Integer orderContractId) {
        OrderContract orderContract = null;
        if (orderContractId != null && orderContractId > 0) {
            orderContract = orderContractDao.selectById(orderContractId);
        }
        return orderContract;
    }

    @ArchivesLog(operationType = "添加操作", operationName = "添加订单合同")
    public OrderContract addOrderContract(OrderContract orderContract) {
        if (orderContract != null && orderContract.getStore() != null && orderContract.getStore().getStoreId() != null && orderContract.getStore().getStoreId() > 0) {
            orderContract.setOrderContractNo(GenerateNumber.getGenerateNumber().getRandomFileName());
            orderContractDao.add(orderContract);
        } else {
            throw new NullPointerException("orderContract is null");
        }
        return orderContract;

    }

    @ArchivesLog(operationType = "修改操作", operationName = "修改订单合同")
    public void updateOrderContractById(OrderContract orderContract) {
        if (orderContract != null && orderContract.getOrderContractId() != null && orderContract.getOrderContractId() > 0) {
            orderContractDao.update(orderContract);
        } else {
            throw new NullPointerException("orderContract is null");
        }

    }

    @Override
    public List<OrderContract> selectAllNoOrderInfoContract() {
        return orderContractDao.selectAllNoOrderInfoContract();
    }
}
