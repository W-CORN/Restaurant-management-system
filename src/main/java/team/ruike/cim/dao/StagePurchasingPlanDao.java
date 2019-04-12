package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.StagePurchasingPlan;

import java.util.List;

/**
 * 阶段采购计划表数据访问接口
 *
 * @author 孙天奇
 * @author 华中昊
 * @version 1.0
 */
public interface StagePurchasingPlanDao {
    /**
     * 新增阶段采购计划
     *
     * @param stagePurchasingPlan 阶段采购计划实体类对象
     * @return 受影响的行数
     */
    int add(StagePurchasingPlan stagePurchasingPlan);

    /**
     * 修改阶段采购计划
     *
     * @param stagePurchasingPlan 阶段采购计划实体类对象
     * @return 受影响的行数
     */
    int update(StagePurchasingPlan stagePurchasingPlan);

    /**
     * 查询阶段采购计划
     *
     * @param stagePurchasingPlan 阶段采购计划(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 阶段采购计划对象集合
     */
    List<StagePurchasingPlan> select(@Param("stagePurchasingPlan") StagePurchasingPlan stagePurchasingPlan, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param stagePurchasingPlan 阶段采购计划对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(StagePurchasingPlan stagePurchasingPlan);

    /**
     * 根据ID查询单个阶段采购计划数据
     * @param stagePurchasingPlanId 阶段采购计划id
     * @return 阶段采购计划对象
     */
    StagePurchasingPlan selectById(Integer stagePurchasingPlanId);

}
