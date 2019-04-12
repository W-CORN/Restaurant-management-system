package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.RoleFunction;

import java.util.List;

/**
 * 用户功能表数据访问接口
 *
 * @author 华中昊
 * @author 孙天奇
 * @version 1.0
 * @see #add(RoleFunction)
 * @see #update(RoleFunction)
 * @see #select(RoleFunction, int, int)
 * @see #selectCount(RoleFunction)
 * @see #selectById(Integer)
 */
public interface RoleFunctionDao {
    /**
     * 新增用户功能
     *
     * @param roleFunction 用户功能实体类对象
     * @return 受影响的行数
     */
    int add(RoleFunction roleFunction);

    /**
     * 修改用户功能
     *
     * @param roleFunction 用户功能实体类对象
     * @return 受影响的行数
     */
    int update(RoleFunction roleFunction);

    /**
     * 查询用户功能列表
     *
     * @param roleFunction 用户功能对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<RoleFunction> select(@Param("roleFunction") RoleFunction roleFunction, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param roleFunction 用户功能对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(RoleFunction roleFunction);

    /**
     * 根据ID查询单个用户功能数据
     * @param roleFunctionId 用户功能id
     * @return 用户功能对象
     */
    RoleFunction selectById(Integer roleFunctionId);

    /**
     * 根据角色id删除关系
     * @param roleId 角色id
     * @return 受影响的行数
     */
    int delete(@Param("roleId")Integer roleId);
}
