package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.WarehouseOutRegisterItem;


import java.util.List;

/**
 * 出库登记表项数据接口
 * @author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public interface WarehouseOutRegisterItemDao {
    /**
     * @param warehouseOutRegisterItem 出库登记表项实体类对象
     * @return 受影响的行数
     */
    int add(WarehouseOutRegisterItem warehouseOutRegisterItem);

    /**
     * 修改合同订单
     *
     * @param warehouseOutRegisterItem 出库登记表项实体类对象
     * @return 受影响的行数
     */
    int update(WarehouseOutRegisterItem warehouseOutRegisterItem);

    /**
     * 查询订单列表
     *
     * @param warehouseOutRegisterItem 出库登记表项(作为查询条件)
     * @param pageNo                   要查询的页码
     * @param pageSize                 页面数据大小
     * @return 出库登记表项
     */
    List<WarehouseOutRegisterItem> select(@Param("warehouseOutRegisterItem") WarehouseOutRegisterItem warehouseOutRegisterItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param warehouseOutRegisterItem 出库登记表项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(WarehouseOutRegisterItem warehouseOutRegisterItem);

    /**
     * 根据ID查询单个出库登记表项
     *
     * @param warehouseOutRegisterItemId 合同订单id
     * @return 出库登记表项
     */
    WarehouseOutRegisterItem selectById(Integer warehouseOutRegisterItemId);

    /**
     * 根据warehouseOutRegisterId查询所属出库登记表
     * @param warehouseOutRegisterId 出库登记表id
     * @return  出库登记表项集合
     */
    List<WarehouseOutRegisterItem> selectBywarehouseOutRegisterId(Integer warehouseOutRegisterId);

    /**
     * 根据仓库id查询所有符合的出库记录
     * @param warehouseOutRegisterItem
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<WarehouseOutRegisterItem> selectByWarehouseId(@Param("warehouseOutRegisterItem") WarehouseOutRegisterItem warehouseOutRegisterItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);


}
