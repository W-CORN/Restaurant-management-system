package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.User;

import java.util.List;

/**
 * 用户表表数据访问接口
 *
 * @author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public interface UserDao {
    /**
     * 新增用户表
     *
     * @param user 用户表实体类对象
     * @return 受影响的行数
     */
    int add(User user);

    /**
     * 修改合同订单
     *
     * @param user 用户表实体类对象
     * @return 受影响的行数
     */
    int update(User user);

    /**
     * 查询订单列表
     *
     * @param user     用户表对象(作为查询条件)
     * @param pageNo   要查询的页码
     * @param pageSize 页面数据大小
     * @return 用户表对象集合
     */
    List<User> select(@Param("user") User user, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param user 用户表对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(User user);

    /**
     * 根据ID查询单个合同订单数据
     *
     * @param userId 合同订单id
     * @return 用户表对象
     */
    User selectById(Integer userId);

    /**
     * 根据角色id查询角色所拥有用户
     * @param roleId 角色id
     * @return 用户集合
     */
    List<User> selectByRoleId(Integer roleId);
}
