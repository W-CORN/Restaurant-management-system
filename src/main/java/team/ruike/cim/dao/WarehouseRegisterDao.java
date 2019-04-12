package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.WarehouseRegister;

import java.util.List;

/**
 * 入库登记表数据接口
 *
 * @author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public interface WarehouseRegisterDao {
    /**
     * 新增入库登记表
     *
     * @param warehouseRegister 入库登记表实体类对象
     * @return 受影响的行数
     */
    int add(WarehouseRegister warehouseRegister);

    /**
     * 修改入库登记表
     *
     * @param warehouseRegister 入库登记表实体类对象
     * @return 受影响的行数
     */
    int update(WarehouseRegister warehouseRegister);

    /**
     * 查询订单列表
     *
     * @param warehouseRegister 入库登记表(作为查询条件)
     * @param pageNo            要查询的页码
     * @param pageSize          页面数据大小
     * @return 订单对象集合
     */
    List<WarehouseRegister> select(@Param("warehouseRegister") WarehouseRegister warehouseRegister, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param warehouseRegister 合同入库登记表(作为查询条件)
     * @return 总条数
     */
    int selectCount(WarehouseRegister warehouseRegister);

    /**
     * 根据ID查询单个入库登记表数据
     *
     * @param warehouseRegisterId 入库登记表id
     * @return 入库登记表对象
     */
    WarehouseRegister selectById(Integer warehouseRegisterId);
}
