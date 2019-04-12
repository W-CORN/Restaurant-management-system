package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Supplier;

import java.util.List;

/**
 * 供应商表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface SupplierDao {
    /**
     * 新增供应商
     *
     * @param supplier 供应商实体类对象
     * @return 受影响的行数
     */
    int add(Supplier supplier);

    /**
     * 修改供应商
     *
     * @param supplier 供应商实体类对象
     * @return 受影响的行数
     */
    int update(Supplier supplier);

    /**
     * 查询供应商
     *
     * @param supplier 供应商(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 供应商对象集合
     */
    List<Supplier> select(@Param("supplier") Supplier supplier, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param supplier 供应商对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Supplier supplier);

    /**
     * 根据ID查询单个供应商数据
     * @param supplierId 供应商id
     * @return 供应商对象
     */
    Supplier selectById(Integer supplierId);
}
