package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.StagePurchasingPlanTerm;

import java.util.List;

/**
 * 阶段采购计划项表数据访问接口
 *
 * @author 孙天奇
 * @author 华中昊
 * @version 1.0
 */
public interface StagePurchasingPlanTermDao {
    /**
     * 新增阶段采购计划项
     *
     * @param stagePurchasingPlanTerm 阶段采购计划项实体类对象
     * @return 受影响的行数
     */
    int add(StagePurchasingPlanTerm stagePurchasingPlanTerm);

    /**
     * 修改阶段采购计划项
     *
     * @param stagePurchasingPlanTerm 阶段采购计划项实体类对象
     * @return 受影响的行数
     */
    int update(StagePurchasingPlanTerm stagePurchasingPlanTerm);

    /**
     * 查询阶段采购计划项
     *
     * @param stagePurchasingPlanTerm 阶段采购计划项(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 阶段采购计划项对象集合
     */
    List<StagePurchasingPlanTerm> select(@Param("stagePurchasingPlanTerm") StagePurchasingPlanTerm stagePurchasingPlanTerm, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param stagePurchasingPlanTerm 阶段采购计划项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(StagePurchasingPlanTerm stagePurchasingPlanTerm);

    /**
     * 根据ID查询单个阶段采购计划项数据
     * @param stagePurchasingPlanTermId 阶段采购计划项id
     * @return 阶段采购计划项对象
     */
    StagePurchasingPlanTerm selectById(Integer stagePurchasingPlanTermId);

    /**
     * 根据阶段采购计划表ID查询阶段采购计划项数据
     * @param stagePurchasingPlanId  阶段采购计划表ID
     * @return 阶段采购计划项对象集合
     */
    List<StagePurchasingPlanTerm> selectBystagePurchasingPlanId(Integer stagePurchasingPlanId);

    int delStagePurchasingPlanTermBysId(Integer stagePurchasingPlanId);
}
