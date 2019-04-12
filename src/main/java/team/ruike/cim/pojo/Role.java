package team.ruike.cim.pojo;


import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * 用户角色类
 *
 * @author 王傲祥
 * @version 1.0
 */
public class Role implements Serializable {

    private static final long serialVersionUID = 9025386170720563666L;
    /**
     * 用户角色ID
     */
    private Integer roleId;
    /**
     * 用户名称
     */
    private String roleName;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 功能集合(此角色有多少功能)
     */
    @JSONField(serialize = false)
    private List<Function> functions;
    /**
     * 权限集合(此角色有多少权限)
     */
    @JSONField(serialize = false)
    private List<Jurisdiction> jurisdictions;

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public List<Jurisdiction> getJurisdictions() {
        return jurisdictions;
    }

    public void setJurisdictions(List<Jurisdiction> jurisdictions) {
        this.jurisdictions = jurisdictions;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
