package team.ruike.cim.service;
import team.ruike.cim.pojo.*;
import team.ruike.cim.util.Pager;
import java.util.List;
/**
 * Created by Administrator on 2017/12/5.
 */
/**
 * 设备管理业务接口
 * @author 王傲祥
 * @version 1.0
 */
public interface EquipementService {
    /**
     * 获取所有设备信息
     * @param equipment 设备
     * @param pager 分页辅助类
     */

    void getEquipment(Equipment equipment, Pager<Equipment> pager);
    /**
     * 获取所有异常报告
     * @param equipmentReport 异常表
     * @param pager 分页辅助类
     */

    void getEquipmentReport(EquipmentReport equipmentReport,Pager<EquipmentReport> pager);
    /**
     * 根据ID查询设备信息
     * @param equipment 设备对象
     * @return 设备ID
     */

    Equipment getEquipmentReportByID(Integer equipment);

    /**
     * 获取所有状态
     * @param equipmentType 状态表
     * @return 状态集合
     */
    List<EquipmentType> getEquipmentType(EquipmentType equipmentType);
    /**
     * 获取所有工序
     * @param working 工序表
     * @return 工序集合
     */

    List<Working> getWorking(Working working);
    /**
     * 获取所有生产线啊
     * @param productionLine 生产线
     * @return 生产线集合
     */
    List<ProductionLine>getProductionLine(ProductionLine productionLine);
    /**
     * 获取所有用户
     * @param user 用户表
     * @return 用户集合
     */

    List<User>getUser(User user);
    /**
     * 修改设备信息
     * @param equipment 设备对象
     * @return 是否成功
     */

    int updateEquipment(Equipment equipment);

    /**
     * 添加设备信息
     * @param equipment 设备信息
     * @return 是否成功
     */

    int addEquipment(Equipment equipment);
    /**
     * 删除设备
     * @param equipmentId 设备id
     * @return 是否成功
     */

   int deleteEquipment(int equipmentId);

    /**
     * 添加异常报告
     * @param equipmentReport 异常类
     * @return 是否成功
     */
   int addEquipmentReport(EquipmentReport equipmentReport);

    /**
     * 补全设备
     * @param equipment
     * @return
     */
   Equipment redalAddEP(Equipment equipment);
}
