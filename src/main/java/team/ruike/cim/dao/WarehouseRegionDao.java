package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Warehouse;
import team.ruike.cim.pojo.WarehouseRegion;

import java.util.List;

/**
 * 仓库区域表数据接口
 * @author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public interface WarehouseRegionDao {
    /**
     * @param warehouseRegion 合同订单实体类对象
     * @return warehouseRegion
     */
    int add(WarehouseRegion warehouseRegion);

    /**
     * 修改合同订单
     *
     * @param warehouseRegion 仓库区域表实体类对象
     * @return 受影响的行数
     */
    int update(WarehouseRegion warehouseRegion);

    /**
     * 查询订单列表
     *
     * @param warehouseRegion 仓库区域表(作为查询条件)
     * @param pageNo          要查询的页码
     * @param pageSize        页面数据大小
     * @return 订单对象集合
     */
    List<WarehouseRegion> select(@Param("warehouseRegion") WarehouseRegion warehouseRegion, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param warehouseRegion 仓库区域表对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(WarehouseRegion warehouseRegion);

    /**
     * 根据ID查询单个仓库区域表
     *
     * @param warehouseRegionId 仓库区域表id
     * @return 仓库区域表
     */
    WarehouseRegion selectById(Integer warehouseRegionId);

    /**
     * 根据warehouseId查询所属仓库
     * @param warehouseId 仓库的id
     * @return  仓库区域集合
     */
    List<WarehouseRegion> selectBywarehouseId(Integer warehouseId);
}
