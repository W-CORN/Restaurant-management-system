package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ruike.cim.dao.*;
import team.ruike.cim.pojo.*;
import team.ruike.cim.service.QualityService;
import team.ruike.cim.util.ArchivesLog;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *质量管理系统业务实现类
 * @author 华中昊
 * @version 1.0
 */
@Service("qualityService")
public class QualityServiceImpl implements QualityService {

    @Resource
    private PurchaseStandardRecordDao purchaseStandardRecordDao;

    @Resource
    private ProductionStandardRecordDao productionStandardRecordDao;

    @Resource
    private ProductionStandardDao productionStandardDao;

    @Resource
    private PurchaseStandardDao purchaseStandardDao;

    @Resource
    private MaterielTypeLevelADao materielTypeLevelADao;

    @Resource
    private MaterielTypeLevelBDao materielTypeLevelBDao;

    @Resource
    private MaterielDao materielDao;

    @Resource
    private EverydayPurchasingPlanDao everydayPurchasingPlanDao;

    @Resource
    private PurchaseDao purchaseDao;

    /**
     *分页查询所有数据
     * @param purchaseStandardRecord
     * @param pager
     */
    public void getRecordList(PurchaseStandardRecord purchaseStandardRecord, Pager<PurchaseStandardRecord> pager) {
        int number=purchaseStandardRecordDao.selectCount(purchaseStandardRecord);
        pager.setTotalRecord(number);
        List<PurchaseStandardRecord> purchaseStandardRecordlist=purchaseStandardRecordDao.select(purchaseStandardRecord,(pager.getCurrentPage() - 1)*pager.getPageSize(), pager.getPageSize());
        pager.setList(purchaseStandardRecordlist);
    }

    /**
     * 品控记录页面跳转  传生产品控评估记录值
     * @param productionStandardRecord
     * @param pager
     */
    public void getRecordProductionList(ProductionStandardRecord productionStandardRecord, Pager<ProductionStandardRecord> pager) {
        int number =productionStandardRecordDao.selectCount(productionStandardRecord);
        pager.setTotalRecord(number);
        List<ProductionStandardRecord> productionStandardRecords=productionStandardRecordDao.select(productionStandardRecord,(pager.getCurrentPage()-1)*pager.getPageSize(),pager.getPageSize());
        pager.setList(productionStandardRecords);
    }

    /**
     * 查询所有采购标准
     * @param purchaseStandard
     * @param pager
     */
    public void selectStandard(PurchaseStandard purchaseStandard, Pager<PurchaseStandard> pager) {
        int number=purchaseStandardDao.selectCount(purchaseStandard);
        pager.setTotalRecord(number);
        List<PurchaseStandard> purchaseStandardList=purchaseStandardDao.select(purchaseStandard,(pager.getCurrentPage()-1)*pager.getPageSize(),pager.getPageSize());
        pager.setList(purchaseStandardList);
    }

    /**
     * 新增标准
     * @param purchaseStandard 标准对象
     * @return
     */
    @ArchivesLog(operationType="新增操作",operationName="新增采购标准")
    public int addStandard(PurchaseStandard purchaseStandard) {
        int number =purchaseStandardDao.add(purchaseStandard);
        return number;
    }

    /**
     * 删除标准
     * @param purchaseStandard
     * @return
     */
    @ArchivesLog(operationType="删除操作",operationName="删除采购标准")
    public int deleteStand(PurchaseStandard purchaseStandard) {
        PurchaseStandard purchaseStandard1=new PurchaseStandard();
        purchaseStandard1=purchaseStandardDao.selectById(purchaseStandard.getPurchaseStandardId());
        purchaseStandard1.setStatus(1);
        return purchaseStandardDao.update(purchaseStandard1);
    }

    /**
     * 修改采购标准
     * @param purchaseStandard
     * @return
     */
    @ArchivesLog(operationType=" 修改操作",operationName="修改采购标准")
    public int updateStand(PurchaseStandard purchaseStandard) {
        int a=purchaseStandardDao.update(purchaseStandard);
        return a;
    }


    /**
     * 品控标准页面跳转  传生产品控标准
     * @param productionStandard  生产品控标准
     * @param pager     分页辅助类
     */
    public void getProductionStandard(ProductionStandard productionStandard, Pager<ProductionStandard> pager) {
        int number =productionStandardDao.selectCount(productionStandard);
        pager.setTotalRecord(number);
        List<ProductionStandard> productionStandards=productionStandardDao.select(productionStandard,(pager.getCurrentPage() - 1)*pager.getPageSize(), pager.getPageSize());
        pager.setList(productionStandards);
    }

    /**
     * 品控标准页面跳转  传采购品控标准
     * @param purchaseStandard  采购品控标准
     * @param pager     分页辅助类
     */
    public void getPurchaseStandard(PurchaseStandard purchaseStandard, Pager<PurchaseStandard> pager) {
        int number = purchaseStandardDao.selectCount(purchaseStandard);
        pager.setTotalRecord(number);
        List<PurchaseStandard> purchaseStandards=purchaseStandardDao.select(purchaseStandard,(pager.getCurrentPage() - 1)*pager.getPageSize(), pager.getPageSize());
        pager.setList(purchaseStandards);
    }

    /**
     * 查询所有A级菜单
     * @return
     */
    public List<MaterielTypeLevelA> getMaterielTypeLevelA() {
        return materielTypeLevelADao.select(new MaterielTypeLevelA(),0,99);
    }

    /**
     * 根据MaterielTypeLevelAID查询MaterielTypeLevelB列表
     * @param materielTypeLevelB    MaterielTypeLevelB对象
     * @return
     */
    public List<MaterielTypeLevelB> getMaterielTypeLevelB(MaterielTypeLevelB materielTypeLevelB) {
        return materielTypeLevelBDao.select(materielTypeLevelB,0,99);
    }

    /**
     * 根据MaterielTypeLevelBID查询Materiel列表
     * @param materiel 物料表集合
     * @return
     */
    public List<Materiel> getMateriel(Materiel materiel) {
        return materielDao.select(materiel,0,99);
    }


    /**
     * 查询当前日期所有A级菜单
     * @return
     */
    public List<MaterielTypeLevelA> getMaterielTypeLevelAByDate(Date date) {
        return materielTypeLevelADao.getMaterielTypeLevelAByDate(date);
    }

    /**
     * 根据MaterielTypeLevelAID 和当前日期 查询MaterielTypeLevelB列表
     * @param materielTypeLevelAId  物料一级Id
     * @return
     */
    public List<MaterielTypeLevelB> getMaterielTypeLevelBByDate(Integer materielTypeLevelAId,Date date) {
        return materielTypeLevelBDao.getMaterielTypeLevelBByDate(materielTypeLevelAId,date);
    }


    /**
     * 获取当前日期的物料
     * @param materielTypeLevelBId  物料二级菜单Id
     * @return
     */
    public List<Materiel> getMaterielByDate(Integer materielTypeLevelBId,Date date) {
        return materielDao.getMaterielByDate(materielTypeLevelBId,date);
    }

    /**
     * 根据日期获取采购批次 采购表Id
     * @return
     */
    public String getNumberByDate(Date date) {
        EverydayPurchasingPlan everydayPurchasingPlan=everydayPurchasingPlanDao.getNumberByDate(date);
        String result=null;
       if(everydayPurchasingPlan!=null && everydayPurchasingPlan.getEverydayPurchasingPlanNo()!=null){
           result=everydayPurchasingPlan.getEverydayPurchasingPlanNo();
       }
        return result;
    }

    /**
     * 根据物料获取标准
     * @param materielId 物料Id
     * @return
     */
    public PurchaseStandard getpurchaseStandard(Integer materielId) {
        PurchaseStandard purchaseStandard=new PurchaseStandard();
        Materiel materiel=new Materiel();
        materiel.setMaterielId(materielId);
        purchaseStandard.setMateriel(materiel);
        List<PurchaseStandard> purchaseStandardList = purchaseStandardDao.select(purchaseStandard,0,99);
        purchaseStandard=null;
        if(purchaseStandardList!=null && purchaseStandardList.size()>0){
            purchaseStandard=purchaseStandardList.get(0);
        }
        return purchaseStandard;
    }


    /**
     * 新增物料标准记录
     * @param purchaseStandardRecord 采购标准记录
     * @return
     */
    public Integer addPurchaseStandardRecord(PurchaseStandardRecord purchaseStandardRecord,Date dates) {
        Purchase purchase=new Purchase();
        purchase.setPurchaseId(purchaseDao.getpurchaseNo(dates));
        purchaseStandardRecord.setPurchase(purchase);
        int a=0;
        a=purchaseStandardRecordDao.add(purchaseStandardRecord);
        return a;
    }

    /**
     * 根据批次查询
     * @param sid
     * @param purchaseStandardRecord
     * @param pager
     */
    public void selectBySomething(String sid, PurchaseStandardRecord purchaseStandardRecord, Pager<PurchaseStandardRecord> pager) {
            EverydayPurchasingPlan everydayPurchasingPlan=new EverydayPurchasingPlan();
            everydayPurchasingPlan.setEverydayPurchasingPlanNo(sid);
            List<EverydayPurchasingPlan> everydayPurchasingPlans= everydayPurchasingPlanDao.select(everydayPurchasingPlan,0,99);
            Purchase purchase=new Purchase();
            if (everydayPurchasingPlans!=null && everydayPurchasingPlans.size()>0){
                purchase.setEverydayPurchasingPlan(everydayPurchasingPlans.get(0));
                List<Purchase> purchases = purchaseDao.select(purchase,0,99);
                if (purchases!=null && purchases.size()>0){
                    purchaseStandardRecord.setPurchase(purchase);
                    int number=purchaseStandardRecordDao.selectCount(purchaseStandardRecord);
                    pager.setTotalRecord(number);
                    List<PurchaseStandardRecord> purchaseStandardRecordlist=purchaseStandardRecordDao.select(purchaseStandardRecord,(pager.getCurrentPage() - 1)*pager.getPageSize(), pager.getPageSize());
                    pager.setList(purchaseStandardRecordlist);
                }
            }
    }
}
