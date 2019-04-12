package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ContractProductionPlanItem;

import java.util.List;

/**
 * 合同订单生产计划订单项表数据访问接口
 *
 * @author 甄立
 * @author 华中昊
 * @version 1.0
 * @see #select(team.ruike.cim.pojo.ContractProductionPlanItem, int, int)
 * @see #selectById(Integer)
 * @see #selectCount(team.ruike.cim.pojo.ContractProductionPlanItem)
 * @see #update(ContractProductionPlanItem)
 * @see #add(ContractProductionPlanItem)
 */
public interface ContractProductionPlanItemDao {


    /**
     * 新增合同订单生产计划订单项
     *
     * @param contractProductionPlanItem 合同订单生产计划订单项实体类对象
     * @return 受影响的行数
     */
    int add(ContractProductionPlanItem contractProductionPlanItem);


    /**
     * 修改合同订单生产计划订单项
     *
     * @param productionPlanItem 合同订单生产计划订单项实体类对象
     * @return 受影响的行数
     */
    int update(ContractProductionPlanItem productionPlanItem);


    /**
     * 查询合同订单生产计划订单项列表
     *
     * @param contractProductionPlanItem 合同订单生产计划订单项对象(作为查询条件)
     * @param pageNo                     要查询的页码
     * @param pageSize                   页面数据大小
     * @return 合同订单生产计划订单项对象集合
     */
    List<ContractProductionPlanItem> select(@Param("contractProductionPlanItem") ContractProductionPlanItem contractProductionPlanItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);


    /**
     * 查询数据总条数
     *
     * @param contractProductionPlanItem 合同订单生产计划订单项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ContractProductionPlanItem contractProductionPlanItem);


    /**
     * 根据ID查询单个合同订单生产计划订单项数据
     *
     * @param contractProductionPlanItemId 合同订单生产计划订单项id
     * @return 合同订单生产计划订单项对象
     */
    ContractProductionPlanItem selectById(Integer contractProductionPlanItemId);

    /**
     * 根据合同订单生产计划id 查询 合同订单生产计划订单项
     * @param contractProductionPlanId 合同订单生产计划id
     * @return 合同订单生产计划订单项对象集合
     */
    List<ContractProductionPlanItem> selectBYContractProductionPlanId(Integer contractProductionPlanId);
}
