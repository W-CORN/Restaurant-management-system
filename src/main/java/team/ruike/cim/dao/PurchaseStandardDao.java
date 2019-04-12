package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.PurchaseStandard;

import java.util.List;

/**
 * 采购品控标准表数据访问接口
 *
 * @author 华中昊
 * @version 1.0
 * @see #add(PurchaseStandard)
 * @see #update(PurchaseStandard)
 * @see #select(PurchaseStandard, int, int)
 * @see #selectCount(PurchaseStandard)
 * @see #selectById(Integer)
 */
public interface PurchaseStandardDao {
    /**
     * 新增采购品控标准
     *
     * @param purchaseStandard 采购品控标准实体类对象
     * @return 受影响的行数
     */
    int add(PurchaseStandard purchaseStandard);

    /**
     * 修改采购品控标准
     *
     * @param purchaseStandard 采购品控标准实体类对象
     * @return 受影响的行数
     */
    int update(PurchaseStandard purchaseStandard);

    /**
     * 查询采购品控标准列表
     *
     * @param purchaseStandard 采购品控标准对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<PurchaseStandard> select(@Param("purchaseStandard") PurchaseStandard purchaseStandard, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param purchaseStandard 采购品控标准对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(@Param("purchaseStandard")PurchaseStandard purchaseStandard);

    /**
     * 根据ID查询单个采购品控标准数据
     * @param purchaseStandardId 采购品控标准id
     * @return 采购品控标准对象
     */
    PurchaseStandard selectById(Integer purchaseStandardId);
}
