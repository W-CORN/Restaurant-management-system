package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductWarehouseOutRegister;

import java.util.List;

/**
 * 成品库出库登记表数据访问接口
 *
 * @author 华中昊
 * @author 华中昊
 * @version 1.0
 * @see #add(ProductWarehouseOutRegister)
 * @see #update(ProductWarehouseOutRegister)
 * @see #select(ProductWarehouseOutRegister, int, int)
 * @see #selectCount(ProductWarehouseOutRegister)
 * @see #selectById(Integer)
 */
public interface ProductWarehouseOutRegisterDao {
    /**
     * 新增成品库出库登记
     *
     * @param productWarehouseOutRegister 成品库出库登记实体类对象
     * @return 受影响的行数
     */
    int add(ProductWarehouseOutRegister productWarehouseOutRegister);

    /**
     * 修改成品库出库登记
     *
     * @param productWarehouseOutRegister 成品库出库登记实体类对象
     * @return 受影响的行数
     */
    int update(ProductWarehouseOutRegister productWarehouseOutRegister);

    /**
     * 查询成品库出库登记列表
     *
     * @param productWarehouseOutRegister 成品库出库登记对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductWarehouseOutRegister> select(@Param("productWarehouseOutRegister") ProductWarehouseOutRegister productWarehouseOutRegister, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productWarehouseOutRegister 成品库出库登记对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ProductWarehouseOutRegister productWarehouseOutRegister);

    /**
     * 根据ID查询单个成品库出库登记数据
     * @param productWarehouseOutRegisterId 成品库出库登记id
     * @return 成品库出库登记对象
     */
    ProductWarehouseOutRegister selectById(Integer productWarehouseOutRegisterId);
}
