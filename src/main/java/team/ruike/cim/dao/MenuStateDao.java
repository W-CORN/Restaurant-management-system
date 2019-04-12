package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.MenuState;
import team.ruike.cim.pojo.MenuState;

import java.util.List;

/**
 * 菜谱状态表数据访问接口
 *@author 张振国
 * @author 华中昊
 * @version 1.0
 * @see #add(MenuState)
 * @see #update(MenuState)
 * @see #select(MenuState, int, int)
 * @see #selectCount(MenuState)
 * @see #selectById(Integer)
 */
public interface MenuStateDao {
    /**
     * 新增菜谱状态
     *
     * @param menuState 菜谱状态实体类对象
     * @return 受影响的行数
     */
    int add(MenuState menuState );

    /**
     * 修改菜谱状态
     *
     * @param menuState 菜谱状态实体类对象
     * @return 受影响的行数
     */
    int update(MenuState menuState);

    /**
     * 查询菜谱状态列表
     *
     * @param menuState 菜谱状态对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<MenuState> select(@Param("menuState") MenuState menuState, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param menuState 菜谱状态对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(@Param("menuState")MenuState menuState);

    /**
     * 根据ID查询单个菜谱状态数据
     * @param menuStateId 菜谱状态id
     * @return 菜谱状态对象
     */
    MenuState selectById(Integer menuStateId);
}
