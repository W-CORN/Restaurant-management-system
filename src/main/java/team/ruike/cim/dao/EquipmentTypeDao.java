package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.EquipmentType;

import java.util.List;

/**
 * 设备状态接口
 *
 * @author 甄立
 * @version 1.0
 * @see #selectById(Integer)
 * @see #select(EquipmentType, int, int)
 * @see #selectCount(EquipmentType)
 * @see #add(EquipmentType)
 * @see #update(EquipmentType)
 */
public interface EquipmentTypeDao {


    /**
     * 新增设备状态
     *
     * @param equipmentType 设备状态实体类对象
     * @return 受影响的行数
     */
    int add(EquipmentType equipmentType);


    /**
     * 修改设备状态
     *
     * @param equipmentType 设备状态实体类对象
     * @return 受影响的行数
     */
    int update(EquipmentType equipmentType);


    /**
     * 查询设备状态
     *
     * @param equipmentType 设备状态对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 设备状态对象集合
     */
    List<EquipmentType> select(@Param("equipmentType") EquipmentType equipmentType, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);


    /**
     * 查询数据总条数
     *
     * @param equipmentType 设备状态对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(EquipmentType equipmentType);


    /**
     * 根据ID查询单个设备状态
     *
     * @param equipmentTypeId 设备状态id
     * @return 设备状态对象
     */
    EquipmentType selectById(Integer equipmentTypeId);
}
