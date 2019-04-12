package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.RoleJurisdiction;

import java.util.List;

/**
 * 用户权限表数据访问接口
 *
 * @author 华中昊
 * @author 孙天奇
 * @version 1.0
 * @see #add(RoleJurisdiction)
 * @see #update(RoleJurisdiction)
 * @see #select(RoleJurisdiction, int, int)
 * @see #selectCount(RoleJurisdiction)
 * @see #selectById(Integer)
 */
public interface RoleJurisdictionDao {
    /**
     * 新增用户权限
     *
     * @param roleJurisdiction 用户权限实体类对象
     * @return 受影响的行数
     */
    int add(RoleJurisdiction roleJurisdiction);

    /**
     * 修改用户权限
     *
     * @param roleJurisdiction 用户权限实体类对象
     * @return 受影响的行数
     */
    int update(RoleJurisdiction roleJurisdiction);

    /**
     * 查询用户权限列表
     *
     * @param roleJurisdiction 用户权限对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<RoleJurisdiction> select(@Param("roleJurisdiction") RoleJurisdiction roleJurisdiction, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param roleJurisdiction 用户权限对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(RoleJurisdiction roleJurisdiction);

    /**
     * 根据ID查询单个用户权限数据
     * @param roleJurisdictionId 用户权限id
     * @return 用户权限对象
     */
    RoleJurisdiction selectById(Integer roleJurisdictionId);

    /**
     * 根据角色id删除关系
     * @param roleId 角色id
     * @return 受影响的行数
     */
    int delete(@Param("roleId")Integer roleId);
}
