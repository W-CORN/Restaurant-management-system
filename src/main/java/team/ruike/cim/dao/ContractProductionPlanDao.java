package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ContractProductionPlan;

import java.util.List;

/**
 * 合同订单生产计划数据访问接口
 *
 * @author 甄立
 * @author 华中昊
 * @version 1.0
 * @see #select(ContractProductionPlan, int, int)
 * @see #selectById(Integer)
 * @see #selectCount(ContractProductionPlan)
 * @see #add(ContractProductionPlan)
 * @see #update(ContractProductionPlan)
 */
public interface ContractProductionPlanDao {

    /**
     * 新增合同订单生产计划
     *
     * @param contractProductionPlan 合同订单生产计划实体类对象
     * @return 受影响的行数
     */
    int add(ContractProductionPlan contractProductionPlan);


    /**
     * 修改合同订单生产计划
     *
     * @param contractProductionPlan 合同订单生产计划实体类对象
     * @return 受影响的行数
     */
    int update(ContractProductionPlan contractProductionPlan);


    /**
     * 查询合同订单生产计划列表
     *
     * @param contractProductionPlan 合同订单生产计划对象(作为查询条件)
     * @param pageNo                 要查询的页码
     * @param pageSize               页面数据大小
     * @return 合同订单生产计划对象集合
     */
    List<ContractProductionPlan> select(@Param("contractProductionPlan") ContractProductionPlan contractProductionPlan, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);


    /**
     * 查询数据总条数
     *
     * @param contractProductionPlan 合同订单生产计划对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ContractProductionPlan contractProductionPlan);


    /**
     * 根据ID查询单个合同订单生产计划数据
     *
     * @param contractProductionPlanId 合同订单生产计划id
     * @return 合同订单生产计划对象
     */
    ContractProductionPlan selectById(Integer contractProductionPlanId);

}
