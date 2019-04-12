package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Equipment;

import java.util.List;

/**
 * 设备接口
 *
 * @author 甄立
 * @version 1.0
 * @see #select(Equipment, int, int)
 * @see #selectById(Integer)
 * @see #selectCount(Equipment)
 * @see #update(Equipment)
 * @see #add(Equipment)
 */
public interface EquipmentDao {


    /**
     * 新增设备
     *
     * @param equipment 设备实体类对象
     * @return 受影响的行数
     */
    int add(Equipment equipment);


    /**
     * 修改设备
     *
     * @param equipment 设备实体类对象
     * @return 受影响的行数
     */
    int update(Equipment equipment);


    /**
     * 查询设备
     *
     * @param equipment 设备对象(作为查询条件)
     * @param pageNo    要查询的页码
     * @param pageSize  页面数据大小
     * @return 设备对象集合
     */
    List<Equipment> select(@Param("equipment") Equipment equipment, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);


    /**
     * 查询数据总条数
     *
     * @param equipment 设备对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Equipment equipment);


    /**
     * 根据ID查询单个设备
     *
     * @param equipmentId 设备id
     * @return 设备对象
     */
    Equipment selectById(Integer equipmentId);

}
