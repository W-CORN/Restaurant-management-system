package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductWarehouseOutRegisterItem;

import java.util.List;

/**
 * 成品库出库登记表项表数据访问接口
 *
 * @author 张振国
 * @author 华中昊
 * @version 1.0
 * @see #add(ProductWarehouseOutRegisterItem)
 * @see #update(ProductWarehouseOutRegisterItem)
 * @see #select(ProductWarehouseOutRegisterItem, int, int)
 * @see #selectCount(ProductWarehouseOutRegisterItem)
 * @see #selectById(Integer)
 */
public interface ProductWarehouseOutRegisterItemDao {
    /**
     * 新增成品库出库登记表项
     *
     * @param productWarehouseOutRegisterItem 成品库出库登记表项实体类对象
     * @return 受影响的行数
     */
    int add(ProductWarehouseOutRegisterItem productWarehouseOutRegisterItem);

    /**
     * 修改成品库出库登记表项
     *
     * @param productWarehouseOutRegisterItem 成品库出库登记表项实体类对象
     * @return 受影响的行数
     */
    int update(ProductWarehouseOutRegisterItem productWarehouseOutRegisterItem);

    /**
     * 查询成品库出库登记表项列表
     *
     * @param productWarehouseOutRegisterItem 成品库出库登记表项对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductWarehouseOutRegisterItem> select(@Param("productWarehouseOutRegisterItem") ProductWarehouseOutRegisterItem productWarehouseOutRegisterItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productWarehouseOutRegisterItem 成品库出库登记表项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(@Param("productWarehouseOutRegisterItem") ProductWarehouseOutRegisterItem productWarehouseOutRegisterItem);

    /**
     * 根据ID查询单个成品库出库登记表项数据
     * @param productWarehouseOutRegisterItemId 成品库出库登记表项id
     * @return 成品库出库登记表项对象
     */
    ProductWarehouseOutRegisterItem selectById(Integer productWarehouseOutRegisterItemId);

    /**
     * 根据成品库出库id 查询 成品库出库登记表项
     * @param productWarehouseOutRegisterId 成品库出库id
     * @return 成品库出库登记表项对象集合
     */
    List<ProductWarehouseOutRegisterItem> selectBYProductWarehouseOutRegisterId(Integer productWarehouseOutRegisterId);

    /**
     * 根据id查询所有成品出库记录
     * @param productWarehouseOutRegisterItem
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<ProductWarehouseOutRegisterItem> selectByWarehouseId(@Param("productWarehouseOutRegisterItem") ProductWarehouseOutRegisterItem productWarehouseOutRegisterItem, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

}
