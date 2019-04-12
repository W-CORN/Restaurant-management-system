package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductWarehouseRegister;

import java.util.List;

/**
 * 成品库入库登记表数据访问接口
 *@author 张振国
 * @author 华中昊
 * @version 1.0
 * @see #add(ProductWarehouseRegister)
 * @see #update(ProductWarehouseRegister)
 * @see #select(ProductWarehouseRegister, int, int)
 * @see #selectCount(ProductWarehouseRegister)
 * @see #selectById(Integer)
 */
public interface ProductWarehouseRegisterDao {
    /**
     * 新增成品库入库登记
     *
     * @param productWarehouseRegister 成品库入库登记实体类对象
     * @return 受影响的行数
     */
    int add(ProductWarehouseRegister productWarehouseRegister);

    /**
     * 修改成品库入库登记
     *
     * @param productWarehouseRegister 成品库入库登记实体类对象
     * @return 受影响的行数
     */
    int update(ProductWarehouseRegister productWarehouseRegister);

    /**
     * 查询成品库入库登记列表
     *
     * @param productWarehouseRegister 成品库入库登记对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductWarehouseRegister> select(@Param("productWarehouseRegister") ProductWarehouseRegister productWarehouseRegister, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productWarehouseRegister 成品库入库登记对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(@Param("productWarehouseRegister")ProductWarehouseRegister productWarehouseRegister);

    /**
     * 根据ID查询单个成品库入库登记数据
     * @param productWarehouseRegisterId 成品库入库登记id
     * @return 成品库入库登记对象
     */
    ProductWarehouseRegister selectById(Integer productWarehouseRegisterId);
}
