package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductWarehouseRegion;

import java.util.List;

/**
 * 成品仓库区域表数据访问接口
 *@author 张振国
 * @author 华中昊
 * @version 1.0
 * @see #add(ProductWarehouseRegion)
 * @see #update(ProductWarehouseRegion)
 * @see #select(ProductWarehouseRegion, int, int)
 * @see #selectCount(ProductWarehouseRegion)
 * @see #selectById(Integer)
 */
public interface ProductWarehouseRegionDao {
    /**
     * 新增成品仓库区域
     *
     * @param productWarehouseRegion 成品仓库区域实体类对象
     * @return 受影响的行数
     */
    int add(ProductWarehouseRegion productWarehouseRegion);

    /**
     * 修改成品仓库区域
     *
     * @param productWarehouseRegion 成品仓库区域实体类对象
     * @return 受影响的行数
     */
    int update(ProductWarehouseRegion productWarehouseRegion);

    /**
     * 查询成品仓库区域列表
     *
     * @param productWarehouseRegion 成品仓库区域对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductWarehouseRegion> select(@Param("productWarehouseRegion") ProductWarehouseRegion productWarehouseRegion, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productWarehouseRegion 成品仓库区域对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(@Param("productWarehouseRegion")ProductWarehouseRegion productWarehouseRegion);

    /**
     * 根据ID查询单个成品仓库区域数据
     * @param productWarehouseRegionId 成品仓库区域id
     * @return 成品仓库区域对象
     */
    ProductWarehouseRegion selectById(Integer productWarehouseRegionId);

    /**
     * 根据productWarehouseId查询成品仓库区域数据
     * @param productWarehouseId   成品仓库id
     * @return      成品仓库区域集合
     */
    List<ProductWarehouseRegion> selectByproductWarehouseId(Integer productWarehouseId);
}
