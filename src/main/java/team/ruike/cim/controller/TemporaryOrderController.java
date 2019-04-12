package team.ruike.cim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ruike.cim.dao.MenuTypeDao;
import team.ruike.cim.dao.TemporaryOrderStateDao;
import team.ruike.cim.pojo.*;
import team.ruike.cim.service.MenuService;
import team.ruike.cim.service.StoreService;
import team.ruike.cim.service.TemporaryOrderService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 临时订单控制器
 *
 * @author 甄立
 * @version 1.0
 */
@Controller
@RequestMapping("temporary/order")
public class TemporaryOrderController {

    @Resource
    private TemporaryOrderService temporaryOrderService;
    @Resource
    private StoreService storeService;
    @Resource
    private MenuService menuService;

    @Resource
    private MenuTypeDao menuTypeDao;//暂无业务类

    @Resource
    private TemporaryOrderStateDao temporaryOrderStateDao;//暂无业务类


    @RequestMapping("index.do")
    public String index(TemporaryOrder temporaryOrder, Pager<TemporaryOrder> pager, Model model) {
        List<TemporaryOrderState> temporaryOrderStateList = temporaryOrderStateDao.selectAll();
        temporaryOrderService.queryTemporaryOrder(temporaryOrder, pager);
        model.addAttribute("pager", pager);
        model.addAttribute("temporaryOrder", temporaryOrder);
        model.addAttribute("temporaryOrderStateList", temporaryOrderStateList);
        return "order/temporary/index";
    }


    @RequestMapping("toAdd.cl")
    public String toAdd(Model model) {
        List<Store> storeList = storeService.queryAllStore();
        List<MenuType> menuTypeList = menuTypeDao.selectAll();
        model.addAttribute("storeList", storeList);
        model.addAttribute("menuTypeList", menuTypeList);
        return "order/temporary/add";
    }

    @RequestMapping("add.do")
    @ResponseBody
    public String add(TemporaryOrder temporaryOrder, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("u");
        temporaryOrder.setUser(user);
        temporaryOrderService.addTemporaryOrder(temporaryOrder, temporaryOrder.getTemporaryOrderTerms());
        return "1";
    }


    @RequestMapping("toView.do")
    public String toView(@RequestParam(value = "temporaryOrderId", required = false) Integer temporaryOrderId, Model model) {
        TemporaryOrder temporaryOrder = temporaryOrderService.queryTemporaryOrderById(temporaryOrderId);
        List<TemporaryOrderState> temporaryOrderStateList = temporaryOrderStateDao.selectAll();
        model.addAttribute("temporaryOrder", temporaryOrder);
        model.addAttribute("temporaryOrderStateList", temporaryOrderStateList);
        return "order/temporary/view";
    }

    @RequestMapping(value = "queryMenu.cl", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryMenu(@RequestParam(value = "menuTypeId") Integer menuTypeId) {
        List<Menu> menuList = menuService.selectByMenuTypeId(menuTypeId);
        StringBuilder option = new StringBuilder();
        for (Menu menu : menuList) {
            option.append("<option value='").append(menu.getMenuId()).append("'>").append(menu.getMenuName()).append("</option>");
        }
        return option.toString();
    }

}