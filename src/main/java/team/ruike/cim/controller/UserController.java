package team.ruike.cim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ruike.cim.pojo.User;
import team.ruike.cim.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 用户业务控制器
 *
 * @author 张振国
 * @version 1.0
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 跳转login页面
     * @return login
     */
    @RequestMapping("/login.do")
    public String login(){
        return "login";
    }

    /**
     * 登陆
     *
     * @param user    前端传入的数据
     * @param request request
     * @return 视图地址
     */
    @RequestMapping("/signin.do")
    public String signIn(User user, HttpServletRequest request, String flag, HttpServletResponse response) {
        User u = userService.login(user);
        if (u == null) {
            request.setAttribute("ms","用户名或密码错误");
            return "login";
        }
        request.getSession().setAttribute("u",u);
        if (flag!=null&&flag.equals("1")){
            Cookie cookie=new Cookie("userName",user.getUserName());
            cookie.setMaxAge(1296000);//最大时间15天
            Cookie cookie1=new Cookie("password",user.getPassword());
            cookie1.setMaxAge(1296000);
            response.addCookie(cookie);
            response.addCookie(cookie1);
        }
        return "redirect:/index.do?flag=0";
    }

    /**
     * 注销
     * @param request request
     * @return 登陆页面
     */
    @RequestMapping("/logOut.do")
    public String LogOut(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("u",null);
        return "login";
    }
}
