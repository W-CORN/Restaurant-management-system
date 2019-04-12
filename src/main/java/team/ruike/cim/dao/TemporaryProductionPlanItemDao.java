package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.TemporaryProductionPlanItem;

import java.util.List;

/**
 * 临时订单生产计划订单项表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface TemporaryProductionPlanItemDao {
    /**
     * 新增临时订单生产计划
     *
     * @param temporaryProductionPlanItem 临时订单生产计划订单项实体类对象
     * @return 受影响的行数
     */
    int add(TemporaryProductionPlanItem temporaryProductionPlanItem);

    /**
     * 修改临时订单生产计划订单项
     *
     * @param temporaryProductionPlanItem 临时订单生产计划订单项实体类对象
     * @return 受影响的行数
     */
    int update(TemporaryProductionPlanItem temporaryProductionPlanItem);

    /**
     * 查询临时订单生产计划
     *
     * @param temporaryProductionPlanItem 临时订单生产计划(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 临时订单生产计划对象集合
     */
    List<TemporaryProductionPlanItem> select(@Param("temporaryProductionPlanItem") TemporaryProductionPlanItem temporaryProductionPlanItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param temporaryProductionPlanItem 临时订单生产计划订单项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(TemporaryProductionPlanItem temporaryProductionPlanItem);

    /**
     * 根据ID查询单个临时订单生产计划订单项数据
     * @param temporaryProductionPlanItemId 临时订单生产计划订单项id
     * @return 临时订单生产计划订单项对象
     */
    TemporaryProductionPlanItem selectById(Integer temporaryProductionPlanItemId);
}
