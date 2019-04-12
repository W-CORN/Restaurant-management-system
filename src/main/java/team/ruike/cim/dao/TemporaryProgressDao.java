package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.TemporaryProgress;

import java.util.List;

/**
 * 临时订单任务进度记录表数据访问接口
 *
 * @author 张振国
 * @author 孙天奇
 * @version 1.0
 */
public interface TemporaryProgressDao {
    /**
     * 新增临时订单任务进度记录
     *
     * @param temporaryProgress 临时订单任务进度记录实体类对象
     * @return 受影响的行数
     */
    int add(TemporaryProgress temporaryProgress);

    /**
     * 修改临时订单任务进度记录
     *
     * @param temporaryProgress 临时订单任务进度记录实体类对象
     * @return 受影响的行数
     */
    int update(TemporaryProgress temporaryProgress);

    /**
     * 查询订单列表
     *
     * @param temporaryProgress 临时订单任务进度记录对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 临时订单任务进度记录对象集合
     */
    List<TemporaryProgress> select(@Param("temporaryProgress") TemporaryProgress temporaryProgress, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param temporaryProgress 临时订单任务进度记录对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(TemporaryProgress temporaryProgress);

    /**
     * 根据ID查询单个临时订单任务进度记录数据
     * @param temporaryProgressId 临时订单任务进度记录id
     * @return 临时订单任务进度记录对象
     */
    TemporaryProgress selectById(Integer temporaryProgressId);
}
