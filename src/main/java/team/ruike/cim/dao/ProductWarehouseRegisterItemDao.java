package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductWarehouseRegisterItem;

import java.util.List;

/**
 * 成品库入库登记记录项表数据访问接口
 *
 * @author 华中昊
 * @author 王傲祥
 * @version 1.0
 * @see #add(ProductWarehouseRegisterItem)
 * @see #update(ProductWarehouseRegisterItem)
 * @see #select(ProductWarehouseRegisterItem, int, int)
 * @see #selectCount(ProductWarehouseRegisterItem)
 * @see #selectById(Integer)
 */
public interface ProductWarehouseRegisterItemDao {
    /**
     * 新增成品库入库登记记录项
     *
     * @param productWarehouseRegisterItem 成品库入库登记记录项实体类对象
     * @return 受影响的行数
     */
    int add(ProductWarehouseRegisterItem productWarehouseRegisterItem);

    /**
     * 修改成品库入库登记记录项
     *
     * @param productWarehouseRegisterItem 成品库入库登记记录项实体类对象
     * @return 受影响的行数
     */
    int update(ProductWarehouseRegisterItem productWarehouseRegisterItem);

    /**
     * 查询成品库入库登记记录项列表
     *
     * @param productWarehouseRegisterItem 成品库入库登记记录项对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductWarehouseRegisterItem> select(@Param("productWarehouseRegisterItem") ProductWarehouseRegisterItem productWarehouseRegisterItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productWarehouseRegisterItem 成品库入库登记记录项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ProductWarehouseRegisterItem productWarehouseRegisterItem);

    /**
     * 根据ID查询单个成品库入库登记记录项数据
     * @param productWarehouseRegisterItemId 成品库入库登记记录项id
     * @return 成品库入库登记记录项对象
     */
    ProductWarehouseRegisterItem selectById(Integer productWarehouseRegisterItemId);

    /**
     * 根据成品库入库登记ID查询单个成品库入库登记记录项数据
     * @param productWarehouseRegisterId 成品库入库登记ID
     * @return 成品库入库登记记录项集合
     */
    List<ProductWarehouseRegisterItem> selectByProductWarehouseRegisterId(Integer productWarehouseRegisterId);

    /**
     * 根据仓库id查询成品入库记录集合
     * @param productWarehouseRegisterItem
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<ProductWarehouseRegisterItem> selectByWarehouseId(@Param("productWarehouseRegisterItem") ProductWarehouseRegisterItem productWarehouseRegisterItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

}
