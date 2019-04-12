package team.ruike.cim.service.impl;

/**
 * Created by Administrator on 2017/12/19.
 */

import org.springframework.stereotype.Service;
import team.ruike.cim.controller.SupplierController;
import team.ruike.cim.dao.MaterielTypeLevelBDao;
import team.ruike.cim.dao.SupplierContractDao;
import team.ruike.cim.dao.SupplierDao;
import team.ruike.cim.pojo.MaterielTypeLevelB;
import team.ruike.cim.pojo.Supplier;
import team.ruike.cim.pojo.SupplierContract;
import team.ruike.cim.service.SupplierService;
import team.ruike.cim.util.ArchivesLog;
import team.ruike.cim.util.GenerateNumber;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * 供应商管理实现类
 * @author 王傲祥
 * @version 1.0
 */
@Service("supplierService")
public class SupplierServiceImpl implements SupplierService{
    @Resource
    private SupplierDao supplierDao;
    @Resource
    private MaterielTypeLevelBDao materielTypeLevelBDao;
    @Resource
    private SupplierContractDao supplierContractDao;
    /**
     * 查询所有供应商信息
     * @param supplier 供应商
     * @param pager 分页辅助类
     */
    @Override
    public void getSupplier(Supplier supplier, Pager<Supplier> pager) {
        pager.setTotalRecord(supplierDao.selectCount(supplier));
        List<Supplier> supplierList=supplierDao.select(supplier,(pager.getCurrentPage()- 1) * pager.getPageSize(), pager.getPageSize());
        pager.setList(supplierList);
    }
    /**
     * 删除供应商
     * @param supplierId 供应商id
     * @return
     */
    @Override
    @ArchivesLog(operationType="删除操作",operationName="删除供应商信息")
    public int delectSupplier(int supplierId) {
        Supplier supplier=new Supplier();
        supplier.setSupplierId(supplierId);
        List<Supplier> supplierList=supplierDao.select(supplier,0,99);
        supplier=supplierList.get(0);
        supplier.setStatus(1);
        return supplierDao.update(supplier);
    }
    /**
     * 查询所有二级类型
     * @param materielTypeLevelB 二级类型
     * @return 二级类型集合
     */
    @Override
    public List<MaterielTypeLevelB> getMaterielTypeLevelB(MaterielTypeLevelB materielTypeLevelB) {
        return materielTypeLevelBDao.select(materielTypeLevelB,0,99);
    }
    /**
     * 添加供应商
     * @param supplier 供应商
     * @return
     */
    @Override
    @ArchivesLog(operationType="添加操作",operationName="添加供应商信息")
    public Supplier addSupplier(Supplier supplier) {
        supplier.setStatus(0);
        String supplierNo= GenerateNumber.getGenerateNumber().getRandomFileName();
        supplier.setSupplierNo(supplierNo);
        supplierDao.add(supplier);
        return supplier;
    }
    /**
     * 修改供应商
     * @param supplier 供应商
     * @return
     */
    @Override
    @ArchivesLog(operationType="修改操作",operationName="修改供应商信息")
    public int updateSupplier(Supplier supplier) {
        Supplier supplierById = getSupplierById(supplier.getSupplierId());
        //删除伪列
        supplier.setStatus(0);
        //时间
        supplier.setCooperationStartDate(supplierById.getCooperationStartDate());
        //特许经营许可路径
        supplier.setSupplierCharterImage(supplierById.getSupplierCharterImage());
        //营业执照路径
        supplier.setSupplierImage(supplierById.getSupplierImage());
        //合同编号
        supplier.setSupplierNo(supplierById.getSupplierNo());
        //状态
        supplier.setSupplierState(supplierById.getSupplierState());
        return supplierDao.update(supplier);
    }
    /**
     * 根据id查询信息
     * @param id 供应商id
     * @return
     */
    @Override
    public Supplier getSupplierById(int id) {
        return supplierDao.selectById(id);
    }
    /**
     * 查询所有合同信息
     * @param supplierContract 合同
     * @param pager 分页辅助类
     */
    @Override
    public void getSupplierContract(SupplierContract supplierContract, Pager<SupplierContract> pager) {
        pager.setTotalRecord(supplierContractDao.selectCount(supplierContract));
        List<SupplierContract>supplierContractList=supplierContractDao.select(supplierContract,(pager.getCurrentPage()- 1) * pager.getPageSize(), pager.getPageSize());
        pager.setList(supplierContractList);
    }
    /**
     * 添加合同
     * @param supplierContract 合同对象
     * @return
     */
    @Override
    @ArchivesLog(operationType="添加操作",operationName="添加合同信息")
    public SupplierContract addSupplierContract(SupplierContract supplierContract) {
        String supplierContractNo= GenerateNumber.getGenerateNumber().getRandomFileName();
        supplierContract.getSupplier().setSupplierNo(supplierContractNo);
        supplierContractDao.add(supplierContract);
        return supplierContract;
    }
    /**
     * 获取所有供应商信息，放到合同
     * @param supplier 供应商
     * @return
     */
    @Override
    public List<Supplier> getSupplierList(Supplier supplier) {
        return supplierDao.select(supplier,0,99);
    }
    /**
     * 根据ID查询所有
     * @param id 合同ID
     * @return
     */
    @Override
    public SupplierContract getSupplierContractById(int id) {
        SupplierContract supplierContract= supplierContractDao.selectById(id);
        return supplierContract;
    }
}
