package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.WarehouseOutRegister;

import java.util.List;

/**
 * 出库登记表数据接口
 *
 * @author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public interface WarehouseOutRegisterDao {
    /**
     * @param warehouseOutRegister 出库登记表实体类对象
     * @return 受影响的行数
     */
    int add(WarehouseOutRegister warehouseOutRegister);

    /**
     * 修改合同订单
     *
     * @param warehouseOutRegister 出库登记表实体类对象
     * @return 受影响的行数
     */
    int update(WarehouseOutRegister warehouseOutRegister);

    /**
     * 查询订单列表
     *
     * @param warehouseOutRegister 出库登记表(作为查询条件)
     * @param pageNo               要查询的页码
     * @param pageSize             页面数据大小
     * @return 出库登记表对象集合
     */
    List<WarehouseOutRegister> select(@Param("warehouseOutRegister") WarehouseOutRegister warehouseOutRegister, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param warehouseOutRegister 出库登记表对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(WarehouseOutRegister warehouseOutRegister);

    /**
     * 根据ID查询单个出库登记表
     *
     * @param warehouseOutRegisterId 合同订单id
     * @return 出库登记表对象
     */
    WarehouseOutRegister selectById(Integer warehouseOutRegisterId);
}
