package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.TemporaryOrder;

import java.util.List;

/**
 * 临时订单表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface TemporaryOrderDao {
    /**
     * 新增临时订单
     *
     * @param temporaryOrder 临时订单实体类对象
     * @return 受影响的行数
     */
    int add(TemporaryOrder temporaryOrder);

    /**
     * 修改临时订单
     *
     * @param temporaryOrder 临时订单实体类对象
     * @return 受影响的行数
     */
    int update(TemporaryOrder temporaryOrder);

    /**
     * 查询临时订单
     *
     * @param temporaryOrder 临时订单对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 临时订单对象集合
     */
    List<TemporaryOrder> select(@Param("temporaryOrder") TemporaryOrder temporaryOrder, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param temporaryOrder 临时订单对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(TemporaryOrder temporaryOrder);

    /**
     * 根据ID查询单个临时订单
     * @param temporaryOrderId 临时订单id
     * @return 临时订单对象
     */
    TemporaryOrder selectById(Integer temporaryOrderId);
}
