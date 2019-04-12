package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Function;

import java.util.List;

/**
 * 功能接口
 * @author 甄立
 * @author 王傲祥
 * @version 1.0
 * @see #selectById(Integer)
 * @see #select(Function, int, int)
 * @see #selectCount(Function)
 * @see #update(Function)
 * @see #add(Function)
 */
public interface FunctionDao {

    /**
     * 新增功能
     *
     * @param function 功能实体类对象
     * @return 受影响的行数
     */
    int add(Function function);

    /**
     * 修改功能
     *
     * @param function 功能实体类对象
     * @return 受影响的行数
     */
    int update(Function function);


    /**
     * 查询功能
     *
     * @param function 功能对象(作为查询条件)
     * @param pageNo   要查询的页码
     * @param pageSize 页面数据大小
     * @return 功能对象集合
     */
    List<Function> select(@Param("function") Function function, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param function 功能对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Function function);

    /**
     * 根据ID查询单个功能
     *
     * @param functionId 功能id
     * @return 功能对象
     */
    Function selectById(Integer functionId);

    /**
     * 根据roleId获取所有用户功能
     * @param roleId    用户主键
     * @return  用户功能集合
     */
    List<Function> selectByroleId(Integer roleId);
}
