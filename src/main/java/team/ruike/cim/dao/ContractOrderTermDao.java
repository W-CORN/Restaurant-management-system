package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ContractOrderTerm;

import java.util.List;

/**
 * 合同订单项表数据访问接口
 *
 * @author 甄立
 * @author 华中昊
 * @version 1.0
 * @see #add(ContractOrderTerm)
 * @see #select(ContractOrderTerm, int, int)
 * @see #update(ContractOrderTerm)
 * @see #selectCount(ContractOrderTerm)
 * @see #selectById(Integer)
 */
public interface ContractOrderTermDao {


    /**
     * 新增合同订单项
     *
     * @param contractOrderTerm 合同订单项实体类对象
     * @return 受影响的行数
     */
    int add(ContractOrderTerm contractOrderTerm);


    /**
     * 修改合同订单项
     *
     * @param contractOrderTerm 合同订单项实体类对象
     * @return 受影响的行数
     */
    int update(ContractOrderTerm contractOrderTerm);


    /**
     * 查询合同订单项
     *
     * @param contractOrderTerm 合同订单项对象(作为查询条件)
     * @param pageNo            要查询的页码
     * @param pageSize          页面数据大小
     * @return 合同订单项对象集合
     */
    List<ContractOrderTerm> select(@Param("contractOrderTerm") ContractOrderTerm contractOrderTerm, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param contractOrderTerm 合同订单项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ContractOrderTerm contractOrderTerm);

    /**
     * 根据ID查询单个合同订单项数据
     *
     * @param contractOrderTermId 合同订单项id
     * @return 合同订单项对象
     */
    ContractOrderTerm selectById(Integer contractOrderTermId);

    /**
     * 根据合同订单id 查询合同订单项对象集合
     * @param contractOrderId 合同订单id
     * @return 合同订单对象集合
     */
    List<ContractOrderTerm> selectBYContractOrderId(Integer contractOrderId);
}
