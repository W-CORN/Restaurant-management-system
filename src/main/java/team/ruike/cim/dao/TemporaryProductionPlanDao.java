package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.TemporaryProductionPlan;

import java.util.List;

/**
 * 临时订单生产计划表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface TemporaryProductionPlanDao {
    /**
     * 新增临时订单生产计划表
     *
     * @param temporaryProductionPlan 临时订单生产计划表实体类对象
     * @return 受影响的行数
     */
    int add(TemporaryProductionPlan temporaryProductionPlan);

    /**
     * 修改合同订单
     *
     * @param temporaryProductionPlan 临时订单生产计划表实体类对象
     * @return 受影响的行数
     */
    int update(TemporaryProductionPlan temporaryProductionPlan);

    /**
     * 查询临时订单生产计划表
     *
     * @param temporaryProductionPlan 临时订单生产计划表(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 临时订单生产计划表对象集合
     */
    List<TemporaryProductionPlan> select(@Param("temporaryProductionPlan") TemporaryProductionPlan temporaryProductionPlan, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param temporaryProductionPlan 临时订单生产计划表对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(TemporaryProductionPlan temporaryProductionPlan);

    /**
     * 根据ID查询单个临时订单生产计划表
     * @param temporaryProductionPlanId 合同订单id
     * @return 临时订单生产计划表对象
     */
    TemporaryProductionPlan selectById(Integer temporaryProductionPlanId);
}
