package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.TemporaryOrderTerm;

import java.util.List;

/**
 * 临时订单项表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface TemporaryOrderTermDao {
    /**
     * 新增临时订单项
     *
     * @param temporaryOrderTerm 临时订单项实体类对象
     * @return 受影响的行数
     */
    int add(TemporaryOrderTerm temporaryOrderTerm);

    /**
     * 修改临时订单项
     *
     * @param temporaryOrderTerm 临时订单项实体类对象
     * @return 受影响的行数
     */
    int update(TemporaryOrderTerm temporaryOrderTerm);

    /**
     * 查询订单列表
     *
     * @param temporaryOrderTerm 临时订单项对象(作为查询条件)
     * @param pageNo             要查询的页码
     * @param pageSize           页面数据大小
     * @return 临时订单项对象集合
     */
    List<TemporaryOrderTerm> select(@Param("temporaryOrderTerm") TemporaryOrderTerm temporaryOrderTerm, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param temporaryOrderTerm 临时订单项对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(TemporaryOrderTerm temporaryOrderTerm);

    /**
     * 根据ID查询单个临时订单项
     *
     * @param temporaryOrderTermId 临时订单项id
     * @return 临时订单项对象
     */
    TemporaryOrderTerm selectById(Integer temporaryOrderTermId);


    /**
     * 根据临时订单Id查询临时订单项
     *
     * @param temporaryOrderId 临时订单Id
     * @return 临时订单项集合
     */
    List<TemporaryOrderTerm> selectByTemporaryOrderId(Integer temporaryOrderId);
}
