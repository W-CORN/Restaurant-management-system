package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.TemporaryProductionDistribution;

import java.util.List;

/**
 * 临时订单生产任务分配表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface TemporaryProductionDistributionDao {
    /**
     * 新增合同订单
     *
     * @param temporaryProductionDistribution 临时订单生产任务分配实体类对象
     * @return 受影响的行数
     */
    int add(TemporaryProductionDistribution temporaryProductionDistribution);

    /**
     * 修改临时订单生产任务分配
     *
     * @param temporaryProductionDistribution 临时订单生产任务分配实体类对象
     * @return 受影响的行数
     */
    int update(TemporaryProductionDistribution temporaryProductionDistribution);

    /**
     * 查询订单列表
     *
     * @param temporaryProductionDistribution 临时订单生产任务分配对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 临时订单生产任务分配对象集合
     */
    List<TemporaryProductionDistribution> select(@Param("temporaryProductionDistribution") TemporaryProductionDistribution temporaryProductionDistribution, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param temporaryProductionDistribution 临时订单生产任务分配对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(TemporaryProductionDistribution temporaryProductionDistribution);

    /**
     * 根据ID查询单个临时订单生产任务分配数据
     * @param temporaryProductionDistributionId 合同订单id
     * @return 临时订单生产任务分配对象
     */
    TemporaryProductionDistribution selectById(Integer temporaryProductionDistributionId);
}
