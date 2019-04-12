package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.PurchaseStandardRecord;

import java.util.List;

/**
 * 采购品控评估记表数据访问接口
 *
 * @author 华中昊
 * @author 华中昊
 * @version 1.0
 * @see #add(PurchaseStandardRecord)
 * @see #update(PurchaseStandardRecord)
 * @see #select(PurchaseStandardRecord, int, int)
 * @see #selectCount(PurchaseStandardRecord)
 * @see #selectById(Integer)
 */
public interface PurchaseStandardRecordDao {
    /**
     * 新增采购品控评估记
     *
     * @param purchaseStandardRecord 采购品控评估记实体类对象
     * @return 受影响的行数
     */
    int add(PurchaseStandardRecord purchaseStandardRecord);

    /**
     * 修改采购品控评估记
     *
     * @param purchaseStandardRecord 采购品控评估记实体类对象
     * @return 受影响的行数
     */
    int update(PurchaseStandardRecord purchaseStandardRecord);

    /**
     * 查询采购品控评估记列表
     *
     * @param purchaseStandardRecord 采购品控评估记对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<PurchaseStandardRecord> select(@Param("purchaseStandardRecord") PurchaseStandardRecord purchaseStandardRecord, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param purchaseStandardRecord 采购品控评估记对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(PurchaseStandardRecord purchaseStandardRecord);

    /**
     * 根据ID查询单个采购品控评估记数据
     * @param purchaseStandardRecordId 采购品控评估记id
     * @return 采购品控评估记对象
     */
    PurchaseStandardRecord selectById(Integer purchaseStandardRecordId);
}
