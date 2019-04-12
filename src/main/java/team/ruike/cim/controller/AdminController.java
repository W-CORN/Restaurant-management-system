package team.ruike.cim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ruike.cim.pojo.Role;
import team.ruike.cim.pojo.User;
import team.ruike.cim.service.AdminService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 管理员业务控制器
 * @author 张振国
 * @version 1.0
 */
@Controller()
@RequestMapping("admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @RequestMapping("roles.do")
    public String role(Role role, Pager<Role> pager, HttpServletRequest request){
        pager.setPageSize(5);
        adminService.getRole(role,pager);
        request.setAttribute("pager",pager);
        request.setAttribute("jur",adminService.getJurisdictions());
        request.setAttribute("fun",adminService.getFunctions());
        return "admin/role";
    }
    @ResponseBody
    @RequestMapping("addRole.do")
    public String addRole(Role role){
        return adminService.addRole(role)+"";
    }

    /**
     * 修改角色权限
     * @return 成功标识
     */
    @ResponseBody
    @RequestMapping("updateRoleJurisdiction.do")
    public String updateRoleJurisdiction(Integer[] jurisdictionIds,Integer[] functionIds,Integer roleId){
            adminService.updateRoleJurisdiction(jurisdictionIds,functionIds,roleId);
            return true+"";
    }

    /**
     * 跳转管理员页面并查询数据
     * @param user 用户对象（参数）
     * @param pager 分页辅助类
     * @param request request
     * @return 管理员页面视图
     */
    @RequestMapping("userList.do")
    public String UserList(User user,Pager<User> pager,HttpServletRequest request){
        /*获取所有角色列表为页面提供下拉框*/
        Pager<Role> rolePager=new Pager<Role>();
        rolePager.setPageSize(99);
        rolePager.setCurrentPage(1);
        adminService.getRole(new Role(),rolePager);
        request.setAttribute("roles",rolePager);
        adminService.getUsers(user,pager);
        request.setAttribute("pager",pager);
        return "admin/admin";
    }

    /**
     * 新增管理员
     * @param user 管理员对象
     * @param roleId 角色id
     * @return 成功标识
     */
    @ResponseBody
    @RequestMapping("addUser.do")
    public String addUser(User user,Integer roleId){
        boolean flag=false;
        try{
            adminService.addUser(user,roleId);
            flag=true;
        }finally {
            return flag+"";
        }
    }

    /**
     * 修改角色信息
     * @param role 角色对象
     * @return 结果标识
     */
    @RequestMapping("updateRole.do")
    @ResponseBody
    public String updateRole(Role role){
        return adminService.updateRole(role)+"";
    }

    /**
     * 删除角色
     * @param roleId 角色id
     * @return 结果标识
     */
    @RequestMapping("delRole.do")
    @ResponseBody
    public String delRole(Integer roleId){
        return adminService.delRole(roleId)+"";
    }

}
