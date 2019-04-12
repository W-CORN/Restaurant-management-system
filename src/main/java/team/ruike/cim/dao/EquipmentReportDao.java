package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.EquipmentReport;

import java.util.List;

/**
 * 设备异常报告接口
 *
 * @author 甄立
 * @version 1.0
 * @see #select(team.ruike.cim.pojo.EquipmentReport, int, int)
 * @see #selectById(Integer)
 * @see #selectCount(team.ruike.cim.pojo.EquipmentReport)
 * @see #add(team.ruike.cim.pojo.EquipmentReport)
 * @see #update(team.ruike.cim.pojo.EquipmentReport)
 */
public interface EquipmentReportDao {

    /**
     * 新增设备异常报告
     *
     * @param equipmentReport 设备异常报告实体类对象
     * @return 受影响的行数
     */
    int add(EquipmentReport equipmentReport);

    /**
     * 修改设备异常报告
     *
     * @param equipmentReport 设备异常报告实体类对象
     * @return 受影响的行数
     */
    int update(EquipmentReport equipmentReport);

    /**
     * 查询设备异常报告
     *
     * @param equipmentReport 设备异常报告对象(作为查询条件)
     * @param pageNo          要查询的页码
     * @param pageSize        页面数据大小
     * @return 设备异常报告集合
     */
    List<EquipmentReport> select(@Param("equipmentReport") EquipmentReport equipmentReport, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);


    /**
     * 查询数据总条数
     *
     * @param equipmentReport 设备异常报告对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(EquipmentReport equipmentReport);


    /**
     * 根据ID查询单个设备异常报告
     *
     * @param equipmentReportId 设备异常报告id
     * @return 设备异常报告对象
     */
    EquipmentReport selectById(Integer equipmentReportId);

}
