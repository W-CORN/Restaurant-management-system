package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.OrderContract;

import java.util.List;

/**
 * 订单合同表数据访问接口
 *
 * @author 华中昊
 * @version 1.0
 * @see #add(OrderContract)
 * @see #update(OrderContract)
 * @see #select(OrderContract, int, int)
 * @see #selectCount(OrderContract)
 * @see #selectById(Integer)
 */
public interface OrderContractDao {
    /**
     * 新增订单合同
     *
     * @param orderContract 订单合同实体类对象
     * @return 受影响的行数
     */
    int add(OrderContract orderContract);

    /**
     * 修改订单合同
     *
     * @param orderContract 订单合同实体类对象
     * @return 受影响的行数
     */
    int update(OrderContract orderContract);

    /**
     * 查询订单合同列表
     *
     * @param orderContract 订单合同对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<OrderContract> select(@Param("orderContract") OrderContract orderContract, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param orderContract 订单合同对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(@Param("orderContract")OrderContract orderContract);

    /**
     * 根据ID查询单个订单合同数据
     * @param orderContractId 订单合同id
     * @return 订单合同对象
     */
    OrderContract selectById(Integer orderContractId);


    List<OrderContract> selectAllNoOrderInfoContract();
}
