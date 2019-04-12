package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductWarehouse;

import java.util.List;

/**
 * 成品仓库表数据访问接口
 *
 * @author 华中昊
 * @author 华中昊
 * @version 1.0
 * @see #add(ProductWarehouse)
 * @see #update(ProductWarehouse)
 * @see #select(ProductWarehouse, int, int)
 * @see #selectCount(ProductWarehouse)
 * @see #selectById(Integer)
 */
public interface ProductWarehouseDao {
    /**
     * 新增成品仓库
     *
     * @param productWarehouse 成品仓库实体类对象
     * @return 受影响的行数
     */
    int add(ProductWarehouse productWarehouse);

    /**
     * 修改成品仓库
     *
     * @param productWarehouse 成品仓库实体类对象
     * @return 受影响的行数
     */
    int update(ProductWarehouse productWarehouse);

    /**
     * 查询成品仓库列表
     *
     * @param productWarehouse 成品仓库对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductWarehouse> select(@Param("productWarehouse") ProductWarehouse productWarehouse, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productWarehouse 成品仓库对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ProductWarehouse productWarehouse);

    /**
     * 根据ID查询单个成品仓库数据
     * @param productWarehouseId 成品仓库id
     * @return 成品仓库对象
     */
    ProductWarehouse selectById(Integer productWarehouseId);
}
