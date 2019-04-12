package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.PurchaseItem;

import java.util.List;

/**
 * 采购项表数据访问接口
 *
 * @author 华中昊
 * @author 王傲祥
 * @version 1.0
 * @see #add(PurchaseItem)
 * @see #update(PurchaseItem)
 * @see #select(PurchaseItem, int, int)
 * @see #selectCount(PurchaseItem)
 * @see #selectById(Integer)
 */
public interface PurchaseItemDao {
    /**
     * 新增采购项
     *
     * @param purchaseItem 采购项实体类对象
     * @return 受影响的行数
     */
    int add(PurchaseItem purchaseItem);

    /**
     * 修改采购项
     *
     * @param purchaseItem 采购项实体类对象
     * @return 受影响的行数
     */
    int update(PurchaseItem purchaseItem);

    /**
     * 查询采购项列表
     *
     * @param purchaseItem 采购项对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<PurchaseItem> select(@Param("purchaseItem") PurchaseItem purchaseItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param purchaseItem 采购项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(PurchaseItem purchaseItem);

    /**
     * 根据ID查询单个采购项数据
     * @param purchaseItemId 采购项id
     * @return 采购项对象
     */
    PurchaseItem selectById(Integer purchaseItemId);

    /**
     *根据采购id 查询采购项数据
     * @param purchaseId 采购id
     * @return 采购项集合
     */
    List<PurchaseItem> selectByPurchaseId(Integer purchaseId);
}
