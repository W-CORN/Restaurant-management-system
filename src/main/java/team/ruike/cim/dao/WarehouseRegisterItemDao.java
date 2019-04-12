package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.WarehouseRegisterItem;

import java.util.List;

/**
 * 入库登记记录项数据接口
 *@author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public interface WarehouseRegisterItemDao {
    /**
     * @param warehouseRegisterItem 入库登记记录项实体类对象
     * @return 受影响的行数
     */
    int add(WarehouseRegisterItem warehouseRegisterItem);

    /**
     * 修改入库登记记录项
     *
     * @param warehouseRegisterItem 入库登记记录项实体类对象
     * @return 受影响的行数
     */
    int update(WarehouseRegisterItem warehouseRegisterItem);

    /**
     * 查询订单列表
     *
     * @param warehouseRegisterItem 入库登记记录项对象(作为查询条件)
     * @param pageNo                要查询的页码
     * @param pageSize              页面数据大小
     * @return 订单对象集合
     */
    List<WarehouseRegisterItem> select(@Param("WarehouseRegisterItem") WarehouseRegisterItem warehouseRegisterItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param warehouseRegisterItem 入库登记记录项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(WarehouseRegisterItem warehouseRegisterItem);

    /**
     * 根据ID查询单个入库登记记录项
     *
     * @param warehouseRegisterItemId 合同订单id
     * @return 合同订单对象
     */
    WarehouseRegisterItem selectById(Integer warehouseRegisterItemId);

    /**
     * 根据仓库id查询所有入库信息
     * @param warehouseRegisterItem
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<WarehouseRegisterItem> selectWarehouseId(@Param("WarehouseRegisterItem") WarehouseRegisterItem warehouseRegisterItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
}
