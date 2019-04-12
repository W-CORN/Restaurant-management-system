package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.MenuMateriel;

import java.util.List;

/**
 * 菜谱物料关系接口
 *
 * @author 甄立
 * @author 华中昊
 * @version 1.0
 * @see #select(MenuMateriel, int, int)
 * @see #selectById(Integer)
 * @see #selectCount(MenuMateriel)
 * @see #add(MenuMateriel)
 * @see #update(MenuMateriel)
 */
public interface MenuMaterielDao {

    /**
     * 新增菜谱物料关系
     *
     * @param menuMateriel 菜谱物料关系实体类对象
     * @return 受影响的行数
     */
    int add(MenuMateriel menuMateriel);

    /**
     * 修改菜谱物料关系
     *
     * @param menuMateriel 菜谱物料关系实体类对象
     * @return 受影响的行数
     */
    int update(MenuMateriel menuMateriel);

    /**
     * 查询菜谱物料关系
     *
     * @param menuMateriel 菜谱物料关系对象(作为查询条件)
     * @param pageNo       要查询的页码
     * @param pageSize     页面数据大小
     * @return 菜谱物料关系对象集合
     */
    List<MenuMateriel> select(@Param("menuMateriel") MenuMateriel menuMateriel, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param menuMateriel 菜谱物料关系对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(MenuMateriel menuMateriel);

    /**
     * 根据ID查询单个菜谱物料关系
     *
     * @param menuMaterielId 菜谱物料关系id
     * @return 菜谱物料关系对象
     */
    MenuMateriel selectById(Integer menuMaterielId);

    /**
     * 根据菜品id查询菜谱物料关系
     * @param menuId 菜品的id
     * @return 菜谱物料关系对象集合
     */
    List<MenuMateriel> selectByMenuId(Integer menuId);


    void deleteById(Integer menuMaterielId);
}
