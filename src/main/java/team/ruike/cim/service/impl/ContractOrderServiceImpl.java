package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ContractOrderDao;
import team.ruike.cim.dao.ContractOrderTermDao;
import team.ruike.cim.pojo.ContractOrder;
import team.ruike.cim.pojo.ContractOrderTerm;
import team.ruike.cim.pojo.OrderContract;
import team.ruike.cim.service.ContractOrderService;
import team.ruike.cim.util.ArchivesLog;
import team.ruike.cim.util.GenerateNumber;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * 合同订单业务类
 *
 * @author 甄立
 * @version 1.0
 */
@Service("contractOrderService")
public class ContractOrderServiceImpl implements ContractOrderService {

    @Resource
    private ContractOrderDao contractOrderDao;

    @Resource
    private ContractOrderTermDao contractOrderTermDao;


    public void queryContractOrder(ContractOrder contractOrder, Pager<ContractOrder> pager) {
        Integer count = contractOrderDao.selectCount(contractOrder);
        pager.setTotalRecord(count);
        List<ContractOrder> contractOrderList = contractOrderDao.select(contractOrder, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize());
        pager.setList(contractOrderList);
    }


    public ContractOrder queryContractOrderById(Integer contractOrderId) {
        ContractOrder contractOrder = null;
        if (contractOrderId != null && contractOrderId > 0) {
            contractOrder = contractOrderDao.selectById(contractOrderId);
        }
        return contractOrder;
    }


    @ArchivesLog(operationType = "添加操作", operationName = "添加合同订单")
    public void addContractOrder(OrderContract orderContract, ContractOrder contractOrder, List<ContractOrderTerm> contractOrderTerms) {
        //添加合同订单
        if (orderContract != null && contractOrder != null && contractOrderTerms != null && contractOrderTerms.size() > 0) {
            //合同
            contractOrder.setOrderContract(orderContract);

            //订单号
            contractOrder.setContractOrderNo(GenerateNumber.getGenerateNumber().getRandomFileName());

            contractOrderDao.add(contractOrder);
            final Integer orderId = contractOrder.getContractOrderId();

            //添加合同订单项
            for (ContractOrderTerm contractOrderTerm : contractOrderTerms) {
                //合同订单ID
                contractOrderTerm.setContractOrderId(orderId);
                //生产批次编号
                contractOrderTerm.setProductBatch(GenerateNumber.getGenerateNumber().getRandomFileName());

                contractOrderTermDao.add(contractOrderTerm);
            }
        } else {
            throw new NullPointerException("添加合同订单失败 数据错误");
        }

    }

    @Override
    public ContractOrder queryContractOrderByContractId(Integer orderContractId) {
        ContractOrder contractOrder = null;
        if (orderContractId != null && orderContractId > 0) {
            contractOrder = contractOrderDao.selectContractOrderByContractId(orderContractId);
        }
        return contractOrder;
    }
}
