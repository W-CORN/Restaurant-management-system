package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.*;
import team.ruike.cim.pojo.*;
import team.ruike.cim.service.EquipementService;
import team.ruike.cim.util.ArchivesLog;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/5.
 */
/**
 * 设备管理业务实现类
 * @author 王傲祥
 * @version 1.0
 */
@Service("equipementService")
public class EquipementServiceImpl implements EquipementService {
    @Resource
    private EquipmentDao equipmentDao;
    @Resource
    private EquipmentReportDao equipmentReportDao;
    @Resource
    private EquipmentTypeDao equipmentTypeDao;
    @Resource
    private WorkingDao workingDao;
    @Resource
    private ProductionLineDao productionLineDao;
    @Resource
    private UserDao userDao;
    /**
     * 获取所有设备信息
     * @param equipment 设备表
     * @param pager 分页辅助类
     */

    public void getEquipment(Equipment equipment, Pager<Equipment> pager) {
        pager.setTotalRecord(equipmentDao.selectCount(equipment));
        List<Equipment> equipmentList=equipmentDao.select(equipment,(pager.getCurrentPage()- 1) * pager.getPageSize(), pager.getPageSize());
        pager.setList(equipmentList);
    }

    /**
     * 获取所有异常信息
     * @param equipmentReport 异常表
     * @param pager 分页辅助类
     */

    public void getEquipmentReport(EquipmentReport equipmentReport, Pager<EquipmentReport> pager) {
        pager.setTotalRecord(equipmentReportDao.selectCount(equipmentReport));
        List<EquipmentReport> equipmentReportList=equipmentReportDao.select(equipmentReport,(pager.getCurrentPage()- 1) * pager.getPageSize(), pager.getPageSize());
        pager.setList(equipmentReportList);
    }

    /**
     * 获取单个设备信息
     * @param equipment 设备对象
     * @return 单个设备信息
     */

    public Equipment getEquipmentReportByID(Integer equipment) {
        return equipmentDao.selectById(equipment);
    }

    /**
     * 获取所有状态信息
     * @param equipmentType 状态表
     */

    public List<EquipmentType> getEquipmentType(EquipmentType equipmentType) {
       return equipmentTypeDao.select(equipmentType,0,99);
    }

    /**
     * 获取所有工序信息
     * @param working 工序表
     * @return 工序集合
     */

    public List<Working> getWorking(Working working) {
        return workingDao.select(working,0,99);
    }

    /**
     * 获取所有生产线啊
     * @param productionLine 生产线
     * @return 生产线集合
     */

    public List<ProductionLine> getProductionLine(ProductionLine productionLine) {
        return productionLineDao.select(productionLine,0,99);
    }

    /**
     * 获取所有用户
     * @param user 用户表
     * @return 用户集合
     */

    public List<User> getUser(User user) {
        return userDao.select(user,0,99);
    }

    /**
     * 修改设备信息
     * @param equipment 设备对象
     * @return 是否成功
     */

    @ArchivesLog(operationType="修改操作",operationName="修改设备信息")
    public int updateEquipment(Equipment equipment) {
        equipment.setStatus(0);
        if (equipment!=null && equipment.getEquipmentId()>0
                &&equipment.getEquipmentName()!=""
                && equipment.getEquipmentType().getEquipmentTypeId()>0
                && equipment.getInspectionCycle()>0
                &&equipment.getMaintenanceCycle()>0
                &&equipment.getProductionLine().getProductionLineId()>0
                &&equipment.getUser().getUserId()>0
                && equipment.getWorking().getWorkingId()>0){
            return equipmentDao.update(equipment);
        }
        return 0;
    }

    /**
     * 删除设备
     * @param equipmentId 设备id
     * @return 是否成功
     */
    @ArchivesLog(operationType="删除操作",operationName="删除设备信息")
    public int deleteEquipment(int equipmentId) {
        Equipment equipment=new Equipment();
        equipment.setEquipmentId(equipmentId);
        List<Equipment>equipmentList= equipmentDao.select(equipment,0,99);
        equipment=equipmentList.get(0);
        equipment.setStatus(1);
        return equipmentDao.update(equipment);
    }

    /**
     * 新增设备信息
     * @param equipment 设备信息
     * @return 是否成功
     */
    @ArchivesLog(operationType="新增操作",operationName="新增设备信息")
    @Override
    public int addEquipment(Equipment equipment) {
        equipment.setStatus(0);
       if (equipment.getEquipmentName()!="" && equipment.getInspectionCycle()>0 &&equipment.getMaintenanceCycle()>0
                &&equipment.getProductionLine().getProductionLineId()>0 &&equipment.getUser().getUserId()>0 && equipment.getWorking().getWorkingId()>0){
            return equipmentDao.add(equipment);
        }
        return 0;
    }

    /**
     * 新增异常报告
     * @param equipmentReport 异常类
     * @return 是否成功
     */
    @ArchivesLog(operationType="新增操作",operationName="新增设备异常信息")
    @Override
    public int addEquipmentReport(EquipmentReport equipmentReport) {
        equipmentReport.setStatus(0);
        if (equipmentReport!=null && equipmentReport.getEquipment().getEquipmentId()>0
                &&equipmentReport.getEndDate()!=null && equipmentReport.getEquipmentReportReason()!=null
                &&equipmentReport.getEquipmentReportReason()!="" && equipmentReport.getMaintenancePlan()!=null
                &&equipmentReport.getMaintenancePlan()!="" && equipmentReport.getUser().getUserId()>0){
            return equipmentReportDao.add(equipmentReport);
        }
        return 0;
    }

    /**
     * 设备查询异常所有外键
     * @param equipment
     * @return
     */

    @Override
    public Equipment redalAddEP(Equipment equipment) {
        //补全用户
        if(equipment.getUser()!=null && equipment.getUser().getUserId()>0){
            User user=userDao.selectById(equipment.getUser().getUserId());
            equipment.setUser(user);
        }
        if (equipment.getWorking()!=null && equipment.getWorking().getWorkingId()>0){
            Working working=workingDao.selectById(equipment.getWorking().getWorkingId());
            equipment.setWorking(working);
        }
        if (equipment.getEquipmentType()!=null && equipment.getEquipmentType().getEquipmentTypeId()>0){
            EquipmentType equipmentType=equipmentTypeDao.selectById(equipment.getEquipmentType().getEquipmentTypeId());
            equipment.setEquipmentType(equipmentType);
        }
        if (equipment.getProductionLine()!=null && equipment.getProductionLine().getProductionLineId()>0){
            ProductionLine productionLine=productionLineDao.selectById(equipment.getProductionLine().getProductionLineId());
            equipment.setProductionLine(productionLine);
        }
        return equipment;
    }
}
