package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.EverydayPurchasingPlan;

import java.util.Date;
import java.util.List;

/**
 * 每日采购计划接口
 *
 * @author 甄立
 * @version 1.0
 * @see #select(EverydayPurchasingPlan, int, int)
 * @see #selectById(Integer)
 * @see #selectCount(EverydayPurchasingPlan)
 * @see #update(EverydayPurchasingPlan)
 * @see #add(EverydayPurchasingPlan)
 */
public interface EverydayPurchasingPlanDao {


    /**
     * 新增每日采购计划
     *
     * @param everydayPurchasingPlan 每日采购计划实体类对象
     * @return 受影响的行数
     */
    int add(EverydayPurchasingPlan everydayPurchasingPlan);

    /**
     * 修改每日采购计划
     *
     * @param everydayPurchasingPlan 每日采购计划实体类对象
     * @return 受影响的行数
     */
    int update(EverydayPurchasingPlan everydayPurchasingPlan);


    /**
     * 查询每日采购计划
     *
     * @param everydayPurchasingPlan 每日采购计划对象(作为查询条件)
     * @param pageNo                 要查询的页码
     * @param pageSize               页面数据大小
     * @return 每日采购计划对象集合
     */
    List<EverydayPurchasingPlan> select(@Param("everydayPurchasingPlan") EverydayPurchasingPlan everydayPurchasingPlan, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param everydayPurchasingPlan 每日采购计划对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(EverydayPurchasingPlan everydayPurchasingPlan);


    /**
     * 根据ID查询单个每日采购计划
     *
     * @param everydayPurchasingPlanId 每日采购计划id
     * @return 每日采购计划对象
     */
    EverydayPurchasingPlan selectById(Integer everydayPurchasingPlanId);

    /**
     * 根据日期查寻当前记录批次
     * @return
     */
    EverydayPurchasingPlan getNumberByDate(Date date);
}
