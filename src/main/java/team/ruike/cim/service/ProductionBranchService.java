package team.ruike.cim.service;

import team.ruike.cim.pojo.ContractProductionDistribution;
import team.ruike.cim.pojo.TemporaryProductionDistribution;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 生产service层接口
 */
public interface ProductionBranchService {

    /**
     * 根据条件查询所有合同订单任务分配
     * @param contractProductionDistribution 合同订单任务分配类
     * @param pager 分页辅助类
     */
    void selectContractProductionDistribution(ContractProductionDistribution contractProductionDistribution, Pager<ContractProductionDistribution> pager);

    /**
     * 根据条件查询所有相符的临时订单任务分配
     * @param temporaryProductionDistribution 临时订单任务分配类
     * @param pager 分页辅助类
     */
    void selectTemporaryProductionDistribution(TemporaryProductionDistribution temporaryProductionDistribution,Pager<TemporaryProductionDistribution> pager);

}
