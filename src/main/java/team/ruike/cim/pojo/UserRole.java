package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 用户角色关系表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class UserRole implements Serializable {
    public UserRole() {
    }

    public UserRole(Integer roleId, Integer userId) {
        this.roleId = roleId;
        this.userId = userId;
    }

    private static final long serialVersionUID = -4091322812186412892L;
    /**
     * 用户角色关系表id
     */
    private Integer userRoleId;
    /**
     * 角色表外键
     */
    private Integer roleId;
    /**
     * 用户表外键
     */
    private Integer userId;
    /**
     * 状态
     */
    private Integer status;


    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
