package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.MenuFlow;

import java.util.List;

/**
 * 菜品制作流程接口
 *
 * @author 甄立
 * @author 孙天奇
 * @version 1.0
 * @see #selectById(Integer)
 * @see #selectCount(MenuFlow)
 * @see #select(MenuFlow, int, int)
 * @see #add(MenuFlow)
 * @see #update(MenuFlow)
 */
public interface MenuFlowDao {

    /**
     * 新增菜品制作流程
     *
     * @param menuFlow 菜品制作流程实体类对象
     * @return 受影响的行数
     */
    int add(MenuFlow menuFlow);

    /**
     * 修改菜品制作流程
     *
     * @param menuFlow 菜品制作流程实体类对象
     * @return 受影响的行数
     */
    int update(MenuFlow menuFlow);

    /**
     * 查询菜品制作流程
     *
     * @param menuFlow 菜品制作流程对象(作为查询条件)
     * @param pageNo   要查询的页码
     * @param pageSize 页面数据大小
     * @return 菜品制作流程对象集合
     */
    List<MenuFlow> select(@Param("menuFlow") MenuFlow menuFlow, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param menuFlow 菜品制作流程对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(MenuFlow menuFlow);

    /**
     * 根据ID查询单个菜品制作流程数据
     *
     * @param menuFlowId 菜品制作流程id
     * @return 菜品制作流程对象
     */
    MenuFlow selectById(Integer menuFlowId);

    /**
     * 根据菜谱物料关系id 查询 菜品制作流
     * @param menuMaterielId 菜谱物料关系id
     * @return 菜品制作流对象集合
     */
    List<MenuFlow> selectBYMenuMaterielId(Integer menuMaterielId);


    /**
     * 删除菜谱流程
     * @param menuFlowId 菜谱流程id
     */
    void deleteById(Integer menuFlowId);

}
