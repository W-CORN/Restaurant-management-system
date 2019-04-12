package team.ruike.cim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ruike.cim.pojo.Menu;
import team.ruike.cim.pojo.MenuFlow;
import team.ruike.cim.service.MenuService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 菜谱业务控制器
 * @author 张振国
 * @version 1.0
 */
@Controller
public class MenuController {
    @Resource
    private MenuService menuService;
    /**
     * 跳转菜谱页面并查询数据
     * @return 菜谱jsp
     */
    @RequestMapping("/menulist.do")
    public String menuList(Menu menu, Pager<Menu> pager, HttpServletRequest request){
        menuService.getMenuList(menu,pager);
        request.setAttribute("pager",pager.getList());//返回菜谱数据
        request.setAttribute("stateList",menuService.getMenuStateList());//返回菜谱状态集合
        request.setAttribute("typeList",menuService.getMenuTypeList());//返回菜谱类型集合
        return "menulist";
    }

    /**
     * 跳转流程页面并查询数据
     * @return 流程页面jsp
     */
    @RequestMapping("/menuflow.do")
    public String menuFlow(Integer menuId,HttpServletRequest request){
        request.setAttribute("list",menuService.getMenuFlows(menuId));
        return "menuflow";
    }
}
