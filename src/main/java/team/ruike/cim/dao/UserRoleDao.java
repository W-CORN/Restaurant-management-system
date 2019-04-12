package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Role;
import team.ruike.cim.pojo.UserRole;

import java.util.List;

/**
 * 用户角色关系表数据接口
 *
 * @author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public interface UserRoleDao {
    /**
     * @param userRole 用户角色关系表实体类对象
     * @return 受影响的行数
     */
    int add(UserRole userRole);

    /**
     * 修改用户角色关系表
     *
     * @param userRole 用户角色关系表实体类对象
     * @return 受影响的行数
     */
    int update(UserRole userRole);

    /**
     * 查询订单列表
     *
     * @param userRole 用户角色关系表对象(作为查询条件)
     * @param pageNo   要查询的页码
     * @param pageSize 页面数据大小
     * @return 用户角色关系表对象集合
     */
    List<UserRole> select(@Param("userRole") UserRole userRole, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询用户角色关系表
     *
     * @param userRole 用户角色关系表对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(UserRole userRole);

    /**
     * 根据ID查询单用户角色关系表数据
     *
     * @param userRoleId 仓库表id
     * @return 用户角色关系表对象
     */
    UserRole selectById(Integer userRoleId);
}
