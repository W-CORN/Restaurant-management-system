package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 *用户权限表
 * @author  孙天奇
 * @author  孙天奇
 * @version  1.0
 */
public class RoleJurisdiction implements Serializable {
  public RoleJurisdiction() {
  }

  public RoleJurisdiction(Integer roleId, Integer jurisdictionId) {
    this.roleId = roleId;
    this.jurisdictionId = jurisdictionId;
  }

  private static final long serialVersionUID = 3994098330391599594L;
  /**
   *用户权限id自增
   */
  private Integer roleJurisdictionId;
  /**
   *用户id
   */
  private Integer roleId;
  /**
   *权限id
   */
  private Integer jurisdictionId;
  /**
   *状态
   */
  private Integer status;

  public Integer getRoleJurisdictionId() {
    return roleJurisdictionId;
  }

  public void setRoleJurisdictionId(Integer roleJurisdictionId) {
    this.roleJurisdictionId = roleJurisdictionId;
  }


  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  public Integer getJurisdictionId() {
    return jurisdictionId;
  }

  public void setJurisdictionId(Integer jurisdictionId) {
    this.jurisdictionId = jurisdictionId;
  }


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}
