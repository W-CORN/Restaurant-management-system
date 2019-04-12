package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.TemporaryOrderState;

import java.util.List;

/**
 * 临时订单状态表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface TemporaryOrderStateDao {
    /**
     * 新增合同订单
     *
     * @param temporaryOrderState 临时订单状态表实体类对象
     * @return 受影响的行数
     */
    int add(TemporaryOrderState temporaryOrderState);

    /**
     * 修改合同订单
     *
     * @param temporaryOrderState 临时订单状态表实体类对象
     * @return 受影响的行数
     */
    int update(TemporaryOrderState temporaryOrderState);

    /**
     * 查询临时订单状态表
     *
     * @param temporaryOrderState 临时订单状态表(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 临时订单状态表对象集合
     */
    List<TemporaryOrderState> select(@Param("temporaryOrderState") TemporaryOrderState temporaryOrderState, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param temporaryOrderState 临时订单状态表对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(TemporaryOrderState temporaryOrderState);

    /**
     * 根据ID查询单个临时订单状态表
     * @param temporaryOrderStateId 合同订单id
     * @return 合同订单对象
     */
    TemporaryOrderState selectById(Integer temporaryOrderStateId);


    /**
     * 查询所有临时订单状态
     * @return 临时订单状态集合
     */
    List<TemporaryOrderState> selectAll();
}
