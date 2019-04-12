package team.ruike.cim.service;

import team.ruike.cim.pojo.Function;
import team.ruike.cim.pojo.Jurisdiction;
import team.ruike.cim.pojo.Role;
import team.ruike.cim.pojo.User;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 管理员业务接口
 * @author 张振国
 * @version 1.0
 */
public interface AdminService {
    /**
     * 获取角色列表
     * @param role 角色对象（参数）
     * @param pager 分页辅助类
     */
    void getRole(Role role, Pager<Role> pager);

    /**
     * 获取所有权限
     * @return 权限集合
     */
    List<Jurisdiction> getJurisdictions();

    /**
     * 获取所有功能集合
     * @return 功能集合
     */
    List<Function> getFunctions();

    /**
     * 新增角色
     * @param role 角色对象
     * @return 是否成功
     */
    boolean addRole(Role role);

    /**
     * 更新用户权限
     * @param jurisdictionIds 权限id数组
     * @param functionIds 功能id数组
     * @param roleId 角色id
     * @return 是否成功
     */
    boolean updateRoleJurisdiction(Integer[] jurisdictionIds,Integer[] functionIds,Integer roleId);

    /**
     * 获取管理员列表
     * @param user 管理员对象（参数）
     * @param pager 分页辅助类
     */
    void getUsers(User user,Pager<User> pager);

    /**
     * 新增管理员
     * @param user 管理员对象
     * @param roleId 角色id
     * @return 是否成功
     */
    boolean addUser(User user,Integer roleId);

    /**
     * 修改角色信息
     * @param role 角色对象
     * @return 是否成功
     */
    boolean updateRole(Role role);

    /**
     * 删除角色
     * @param roleId 角色id
     * @return 成功标识 0：角色有用户无法删除 1：成功 其他：异常
     */
    int delRole(Integer roleId);
}
