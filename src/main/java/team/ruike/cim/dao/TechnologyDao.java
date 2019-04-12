package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Technology;

import java.util.List;

/**
 * 工艺表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface TechnologyDao {
    /**
     * 新增工艺
     *
     * @param technology 工艺实体类对象
     * @return 受影响的行数
     */
    int add(Technology technology);

    /**
     * 修改工艺
     *
     * @param technology 工艺实体类对象
     * @return 受影响的行数
     */
    int update(Technology technology);

    /**
     * 查询工艺列表
     *
     * @param technology 工艺对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 工艺对象集合
     */
    List<Technology> select(@Param("technology") Technology technology, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param technology 工艺对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Technology technology);

    /**
     * 根据ID查询单个工艺数据
     * @param technologyId 工艺id
     * @return 工艺对象
     */
    Technology selectById(Integer technologyId);
}
