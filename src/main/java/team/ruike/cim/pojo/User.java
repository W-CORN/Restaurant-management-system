package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.List;

/**
 * 用户表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 8683068068593924459L;
    /**
     * 用户表id
     */

    private Integer userId;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 联系电话(登陆账号)
     */
    private String userPhone;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 用户所拥有的角色
     */
    private List<Role> roles;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Role> getRoles() {
        return roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
