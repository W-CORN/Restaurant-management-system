package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ContractOrder;
import team.ruike.cim.pojo.User;

import java.util.List;

/**
 * 合同订单表数据访问接口
 *
 * @author 张振国
 * @author 华中昊
 * @version 1.0
 * @see #add(ContractOrder)
 * @see #update(ContractOrder)
 * @see #select(ContractOrder, int, int)
 * @see #selectCount(ContractOrder)
 * @see #selectById(Integer)
 */
public interface ContractOrderDao {
    /**
     * 新增合同订单
     *
     * @param contractOrder 合同订单实体类对象
     * @return 受影响的行数
     */
    int add(ContractOrder contractOrder);

    /**
     * 修改合同订单
     *
     * @param contractOrder 合同订单实体类对象
     * @return 受影响的行数
     */
    int update(ContractOrder contractOrder);

    /**
     * 查询订单列表
     *
     * @param contractOrder 订单对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ContractOrder> select(@Param("contractOrder") ContractOrder contractOrder, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param contractOrder 合同订单对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ContractOrder contractOrder);

    /**
     * 根据ID查询单个合同订单数据
     *
     * @param contractOrderId 合同订单id
     * @return 合同订单对象
     */
    ContractOrder selectById(Integer contractOrderId);


    /**
     * 根据合同id 查询订单
     * @param contractId 合同id
     * @return 订单对象
     */
    ContractOrder  selectContractOrderByContractId(Integer contractId);

}
