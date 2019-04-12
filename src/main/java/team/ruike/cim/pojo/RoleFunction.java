package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 角色功能类
 *
 * @author 王傲祥
 * @version 1.0
 */
public class RoleFunction implements Serializable {
    public RoleFunction() {
    }

    public RoleFunction(Integer roleId, Integer functionId) {
        this.roleId = roleId;
        this.functionId = functionId;
    }

    private static final long serialVersionUID = 2387468227803471501L;
    /**
     * 角色功能ID
     */
    private Integer roleFunctionId;
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 功能ID
     */
    private Integer functionId;
    /**
     * 删除状态
     */
    private Integer status;


    public Integer getRoleFunctionId() {
        return roleFunctionId;
    }

    public void setRoleFunctionId(Integer roleFunctionId) {
        this.roleFunctionId = roleFunctionId;
    }


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }


    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
