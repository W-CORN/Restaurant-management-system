package team.ruike.cim.service;

import team.ruike.cim.pojo.*;
import team.ruike.cim.util.Pager;

import java.util.Date;
import java.util.List;

/**
 * 质量管理系统业务接口
 * @author 华中昊
 * @version 1.0
 */
public interface QualityService {
    /**
     * 品控记录页面跳转  传采购品控评估记录值
     * @param purchaseStandardRecord 采购品控记录对象
     * @param pager 分页辅助类
     */
    void getRecordList(PurchaseStandardRecord purchaseStandardRecord, Pager<PurchaseStandardRecord> pager);

    /**
     * 品控记录页面跳转  传生产品控评估记录值
     * @param productionStandardRecord  生产品控对象
     * @param pager 分页辅助类
     */
    void getRecordProductionList(ProductionStandardRecord productionStandardRecord,Pager<ProductionStandardRecord> pager);

    /**
     * 品控标准页面跳转  传生产品控标准
     * @param productionStandard  生产品控标准
     * @param pager     分页辅助类
     */
    void getProductionStandard(ProductionStandard productionStandard,Pager<ProductionStandard> pager);

    /**
     * 品控标准页面跳转  传采购品控标准
     * @param purchaseStandard  采购品控标准
     * @param pager     分页辅助类
     */
    void getPurchaseStandard(PurchaseStandard purchaseStandard,Pager<PurchaseStandard> pager);

    /**
     * 查询所有A级菜单
     * @return A级菜单列表
     */
    List<MaterielTypeLevelA> getMaterielTypeLevelA();

    /**
     * 根据MaterielTypeLevelAID查询MaterielTypeLevelB列表
     * @param materielTypeLevelB    MaterielTypeLevelB对象
     * @return
     */
    List<MaterielTypeLevelB> getMaterielTypeLevelB(MaterielTypeLevelB materielTypeLevelB);

    /**
     * 根据MaterielTypeLevelBID查询Materiel列表
     * @param materiel 物料表集合
     * @return  物料表集合
     */
    List<Materiel> getMateriel(Materiel materiel);


    /**
     * 查询当前日期所有A级菜单
     * @return
     */
    List<MaterielTypeLevelA> getMaterielTypeLevelAByDate(Date date);

    /**
     * 根据MaterielTypeLevelAID 和当前日期 查询MaterielTypeLevelB列表
     * @param materielTypeLevelAId  物料一级Id
     * @return
     */
    List<MaterielTypeLevelB> getMaterielTypeLevelBByDate(Integer materielTypeLevelAId,Date date);



    /**
     * 获取当前日期的物料集合
     * @return
     */
    List<Materiel> getMaterielByDate(Integer materielTypeLevelBId,Date date);

    /**
     * 获取今日采购批次
     * @return
     */
    String getNumberByDate(Date date);

    /**
     * 获取物料标准
     * @param materielId 物料Id
     * @return
     */
    PurchaseStandard getpurchaseStandard(Integer materielId);

    /**
     * 新增采购标准记录
     * @param purchaseStandardRecord 采购标准记录
     * @return
     */
    Integer addPurchaseStandardRecord(PurchaseStandardRecord purchaseStandardRecord,Date dates);

    /**
     * 根据条件查询方法
     * @param sid
     * @param purchaseStandardRecord
     * @param pager
     * @return
     */
    void selectBySomething(String sid,PurchaseStandardRecord purchaseStandardRecord, Pager<PurchaseStandardRecord> pager);

    /**
     * 查询所有标准
     * @param purchaseStandard
     * @param pager
     */
    void selectStandard(PurchaseStandard purchaseStandard,Pager<PurchaseStandard> pager);

    /**
     * 新增采购标准
     * @param purchaseStandard 标准对象
     * @return
     */
    int addStandard(PurchaseStandard purchaseStandard);

    /**
     * 删除采购标准
     * @param purchaseStandard
     * @return
     */
    int deleteStand(PurchaseStandard purchaseStandard);

    /**
     * 修改采购标准
     * @param purchaseStandard
     * @return
     */
    int updateStand(PurchaseStandard purchaseStandard);

}
