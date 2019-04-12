package team.ruike.cim.controller;

import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;
import team.ruike.cim.pojo.Function;
import team.ruike.cim.pojo.Role;
import team.ruike.cim.pojo.User;
import team.ruike.cim.service.AdminService;
import team.ruike.cim.service.UserService;
import team.ruike.cim.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class JurisdictionFilter implements Filter {
    private UserService userService;
    FilterConfig filterConfig;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig=filterConfig;
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        HttpSession session = httpServletRequest.getSession();
        httpServletResponse.setCharacterEncoding("UTF-8");
        //获取请求地址
        String path = httpServletRequest.getRequestURI();
        path=path.substring(1,path.length());
        if (path.equals("index.do")||path.equals("")){
            filterChain.doFilter(httpServletRequest,httpServletResponse);
            return;
        }
        if (path.equals("login.do")||path.equals("signin.do")){
            filterChain.doFilter(httpServletRequest,httpServletResponse);
            return;
        }
        System.out.println(path);
        //获取当前登录的用户
        User u = (User) session.getAttribute("u");
        if (u==null){
            String userName="";
            String password="";
            Cookie[] cook=httpServletRequest.getCookies();
            if(cook!=null){
                for (Cookie cookie : cook) {
                    if(cookie.getName().equals("userName")){
                        userName=cookie.getValue();
                    }else if(cookie.getName().equals("password")){
                        password=cookie.getValue();
                    }
                }
                User user=new User();
                user.setUserName(userName);
                user.setPassword(password);
                ServletContext sc = filterConfig.getServletContext();
                XmlWebApplicationContext cxt = (XmlWebApplicationContext) WebApplicationContextUtils.getWebApplicationContext(sc);
                if(cxt != null && cxt.getBean("userService") != null && userService == null)
                    userService = (UserService) cxt.getBean("userService");
                User login = userService.login(user);
                if (login!=null){
                    httpServletRequest.getSession().setAttribute("u",login);
                    filterChain.doFilter(httpServletRequest,httpServletResponse);
                    return;
                }
            }
            httpServletResponse.sendRedirect("/login.do?ms=1");
            return;
        }
        Role role = u.getRoles().get(0);//获取用户所属角色
        List<Function> functions = role.getFunctions();//获取角色所拥有的功能
        for (Function function : functions) {
            //判断如果角色所拥有的权限与当前访问的权限地址相同则放行
            if (function.getFunctionUrl().equals(path)){
                filterChain.doFilter(httpServletRequest,httpServletResponse);
                return;
            }
        }
        httpServletResponse.sendRedirect("/login.do?ms=2");
    }

    @Override
    public void destroy() {

    }
}
