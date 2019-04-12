package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.EverydayPurchasingPlanTerm;

import java.util.List;

/**
 * 每日采购计划项接口
 *
 * @author 甄立
 * @author 王傲祥
 * @version 1.0
 * @see #select(EverydayPurchasingPlanTerm, int, int)
 * @see #selectById(Integer)
 * @see #selectCount(EverydayPurchasingPlanTerm)
 * @see #add(EverydayPurchasingPlanTerm)
 * @see #update(EverydayPurchasingPlanTerm)
 */
public interface EverydayPurchasingPlanTermDao {

    /**
     * 新增每日采购计划项
     *
     * @param everydayPurchasingPlanTerm 每日采购计划项实体类对象
     * @return 受影响的行数
     */
    int add(EverydayPurchasingPlanTerm everydayPurchasingPlanTerm);

    /**
     * 修改每日采购计划项
     *
     * @param everydayPurchasingPlanTerm 每日采购计划项实体类对象
     * @return 受影响的行数
     */
    int update(EverydayPurchasingPlanTerm everydayPurchasingPlanTerm);

    /**
     * 查询每日采购计划项
     *
     * @param everydayPurchasingPlanTerm 每日采购计划项对象(作为查询条件)
     * @param pageNo                     要查询的页码
     * @param pageSize                   页面数据大小
     * @return 每日采购计划项对象集合
     */
    List<EverydayPurchasingPlanTerm> select(@Param("everydayPurchasingPlanTerm") EverydayPurchasingPlanTerm everydayPurchasingPlanTerm, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param everydayPurchasingPlanTerm 每日采购计划项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(EverydayPurchasingPlanTerm everydayPurchasingPlanTerm);

    /**
     * 根据ID查询单个每日采购计划项
     *
     * @param everydayPurchasingPlanTermId 每日采购计划项id
     * @return 每日采购计划项对象
     */
    EverydayPurchasingPlanTerm selectById(Integer everydayPurchasingPlanTermId);

    /**
     * 根据每日采购计划ID查询每日采购计划项
     * @param everydayPurchasingPlanId 每日采购计划ID
     * @return 每日采购计划项对象集合
     */
    List<EverydayPurchasingPlanTerm> selectByeverydayPurchasingPlanId(Integer everydayPurchasingPlanId);
}
