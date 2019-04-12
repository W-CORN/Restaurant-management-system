package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Warehouse;

import java.util.List;

/**
 * 仓库表表数据访问接口
 *
 * @author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public interface WarehouseDao {
    /**
     * 新增仓库表
     *
     * @param warehouse 仓库表实体类对象
     * @return 受影响的行数
     */
    int add(Warehouse warehouse);

    /**
     * 修改合同订单
     *
     * @param warehouse 仓库表实体类对象
     * @return 受影响的行数
     */
    int update(Warehouse warehouse);

    /**
     * 查询订单列表
     *
     * @param warehouse 仓库表对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 仓库表对象集合
     */
    List<Warehouse> select(@Param("warehouse") Warehouse warehouse, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param warehouse 仓库表对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Warehouse warehouse);

    /**
     * 根据ID查询单仓库表数据
     * @param warehouseId 仓库表id
     * @return 仓库表订单对象
     */
    Warehouse selectById(Integer warehouseId);
}
