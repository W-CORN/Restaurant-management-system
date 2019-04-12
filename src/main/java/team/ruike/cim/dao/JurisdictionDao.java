package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Jurisdiction;

import java.util.List;

public interface JurisdictionDao {


    /**
     * 新增权限
     *@author 王傲祥
     * @param jurisdiction 权限实体类对象
     * @return 受影响的行数
     */
    int add(Jurisdiction jurisdiction);

    /**
     * 修改权限
     *
     * @param jurisdiction 权限实体类对象
     * @return 受影响的行数
     */
    int update(Jurisdiction jurisdiction);

    /**
     * 查询权限
     *
     * @param jurisdiction 权限对象(作为查询条件)
     * @param pageNo       要查询的页码
     * @param pageSize     页面数据大小
     * @return 权限对象集合
     */
    List<Jurisdiction> select(@Param("jurisdiction") Jurisdiction jurisdiction, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param jurisdiction 权限对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Jurisdiction jurisdiction);

    /**
     * 根据ID查询单个权限
     *
     * @param jurisdictionId 权限id
     * @return 权限对象
     */
    Jurisdiction selectById(Integer jurisdictionId);

    /**
     * 根据roleId查询所有权限集合
     * @param roleId 用户角色id
     * @return  所有用户对应权限集合
     */
    List<Jurisdiction> selectByroleId(Integer roleId);
}
