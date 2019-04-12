package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Role;

import java.util.List;

/**
 * 用户角色表数据访问接口
 *
 * @author 华中昊
 * @author 王傲祥
 * @version 1.0
 * @see #add(Role)
 * @see #update(Role)
 * @see #select(Role, int, int)
 * @see #selectCount(Role)
 * @see #selectById(Integer)
 */
public interface RoleDao {
    /**
     * 新增用户角色
     *
     * @param role 用户角色实体类对象
     * @return 受影响的行数
     */
    int add(Role role);

    /**
     * 修改用户角色
     *
     * @param role 用户角色实体类对象
     * @return 受影响的行数
     */
    int update(Role role);

    /**
     * 查询用户角色列表
     *
     * @param role 用户角色对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<Role> select(@Param("role") Role role, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param role 用户角色对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Role role);

    /**
     * 根据ID查询单个用户角色数据
     * @param roleId 用户角色id
     * @return 用户角色对象
     */
    Role selectById(Integer roleId);

    /**
     * 根据userID查询用户角色
     * @param userId 用户ID
     * @return 用户角色集合
     */
    List<Role> selectByUserId(Integer userId);
}
