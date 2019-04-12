package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.SupplierContract;

import java.util.List;

/**
 * 供应商合同表表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface SupplierContractDao {
    /**
     * 新增供应商合同表
     *
     * @param supplierContract 供应商合同表实体类对象
     * @return 受影响的行数
     */
    int add(SupplierContract supplierContract);

    /**
     * 修改供应商合同表
     *
     * @param supplierContract 供应商合同表实体类对象
     * @return 受影响的行数
     */
    int update(SupplierContract supplierContract);

    /**
     * 查询订单列表
     *
     * @param supplierContract 供应商合同表(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 供应商合同表对象集合
     */
    List<SupplierContract> select(@Param("supplierContract") SupplierContract supplierContract, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param supplierContract 供应商合同表对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(SupplierContract supplierContract);

    /**
     * 根据ID查询单个供应商合同表数据
     * @param supplierContractId 供应商合同表id
     * @return 供应商合同表对象
     */
    SupplierContract selectById(Integer supplierContractId);
}
