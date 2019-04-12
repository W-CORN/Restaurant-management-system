package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Menu;

import java.util.List;

/**
 * 菜单接口
 *
 * @author 甄立
 * @author 孙天奇
 * @version 1.0
 * @see #selectById(Integer)
 * @see #selectCount(Menu)
 * @see #select(Menu, int, int)
 * @see #add(Menu)
 * @see #update(Menu)
 */
public interface MenuDao {
    /**
     * 新增菜单
     *
     * @param menu 菜单实体类对象
     * @return 受影响的行数
     */
    int add(Menu menu);

    /**
     * 修改菜单
     *
     * @param menu 菜单实体类对象
     * @return 受影响的行数
     */
    int update(Menu menu);

    /**
     * 查询菜单
     *
     * @param menu     菜单对象(作为查询条件)
     * @param pageNo   要查询的页码
     * @param pageSize 页面数据大小
     * @return 菜单对象集合
     */
    List<Menu> select(@Param("menu") Menu menu, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param menu 菜单对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(@Param("menu")Menu menu);

    /**
     * 根据ID查询单个菜单数据
     *
     * @param menuId 菜单id
     * @return 菜单对象
     */
    Menu selectById(Integer menuId);

    /**
     * 根据菜谱类型id查询菜谱
     *
     * @param menuTypeId 菜谱类型
     * @return 菜谱集合
     */
    List<Menu> selectByMenuTypeId(@Param("menuTypeId") Integer menuTypeId);


    void deleteById(Integer menuId);
}
