package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.MenuType;

import java.util.List;

/**
 * 菜谱类别表数据访问接口
 *
 * @author 华中昊
 * @version 1.0
 * @see #add(MenuType)
 * @see #update(MenuType)
 * @see #select(MenuType, int, int)
 * @see #selectCount(MenuType)
 * @see #selectById(Integer)
 */
public interface MenuTypeDao {
    /**
     * 新增菜谱类别
     *
     * @param menuType 菜谱类别实体类对象
     * @return 受影响的行数
     */
    int add(MenuType menuType);

    /**
     * 修改菜谱类别
     *
     * @param menuType 菜谱类别实体类对象
     * @return 受影响的行数
     */
    int update(MenuType menuType);

    /**
     * 查询菜谱类别列表
     *
     * @param menuType 菜谱类别对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<MenuType> select(@Param("menuType") MenuType menuType, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param menuType 菜谱类别对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(@Param("menuType")MenuType menuType);

    /**
     * 根据ID查询单个菜谱类别数据
     * @param menuTypeId 菜谱类别id
     * @return 菜谱类别对象
     */
    MenuType selectById(Integer menuTypeId);

    /**
     * 查询所有菜谱类别
     * @return 菜谱类别集合
     */
    List<MenuType> selectAll();
}
