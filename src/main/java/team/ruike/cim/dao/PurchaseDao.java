package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Purchase;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * 采购表数据访问接口
 *
 * @author 华中昊
 * @author 王傲祥
 * @version 1.0
 * @see #add(Purchase)
 * @see #update(Purchase)
 * @see #select(Purchase, int, int)
 * @see #selectCount(Purchase)
 * @see #selectById(Integer)
 */
public interface PurchaseDao {
    /**
     * 新增采购
     *
     * @param purchase 采购实体类对象
     * @return 受影响的行数
     */
    int add(Purchase purchase);

    /**
     * 修改采购
     *
     * @param purchase 采购实体类对象
     * @return 受影响的行数
     */
    int update(Purchase purchase);

    /**
     * 查询采购列表
     *
     * @param purchase 采购对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<Purchase> select(@Param("purchase") Purchase purchase, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param purchase 采购对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Purchase purchase);

    /**
     * 根据ID查询单个采购数据
     * @param purchaseId 采购id
     * @return 采购对象
     */
    Purchase selectById(Integer purchaseId);

    /**
     * 根据日期获取主键值
     * @return 编号
     */
    int getpurchaseNo(Date dates);
}
