package team.ruike.cim.service;

import team.ruike.cim.pojo.ContractProductionDistribution;
import team.ruike.cim.pojo.ContractProductionPlan;
import team.ruike.cim.pojo.ContractProductionPlanItem;

import java.text.ParseException;
import java.util.List;

/**
 * 生产系统业务接口
 */
public interface ContractProductionPlanService {
    /**
     * 获取今日生产计划
     * @return 今日生产计划集合
     */
    List<ContractProductionPlan> getDayContractProductionPlans() throws ParseException;

    /**
     * 根据合同生产计划项Id获取合同订单计划集合
     * @param contractProductionPlanItemId 生产计划项Id
     * @return 合同订单计划集合
     */
    List<ContractProductionDistribution> getContractProductionDistributions(Integer contractProductionPlanItemId);

    /**
     * 根据id查询合同生产计划项
     * @param contractProductionPlanItemId 合同生产计划项id
     * @return 合同生产计划项
     */
    ContractProductionPlanItem getContractProductionPlanItem(Integer contractProductionPlanItemId);
}
