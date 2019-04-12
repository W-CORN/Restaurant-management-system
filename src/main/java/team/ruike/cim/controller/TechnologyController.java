package team.ruike.cim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ruike.cim.pojo.Technology;
import team.ruike.cim.service.TechnologyService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 工艺业务控制器
 * @author 张振国
 * @version 1.0
 */
@Controller
public class TechnologyController {
    @Resource
    private TechnologyService technologyService;

    /**
     * 跳转工艺页面并返回数据
     * @param technology 工艺对象（查询参数）
     * @param pager 分页辅助类
     * @param request httpRequest
     * @return 工艺页面
     */
    @RequestMapping("/technology.do")
    public String technology(Technology technology, Pager<Technology> pager, HttpServletRequest request){
        technologyService.getTechnologyList(technology,pager);
        request.setAttribute("pager",pager);
        request.setAttribute("workings",technologyService.getWorking());
        return "technology";
    }

    /**
     * 新增工艺
     * @param technology 工艺对象
     * @return 成功标识
     */
    @ResponseBody
    @RequestMapping("/addTechnology.do")
    public String addTechnology(Technology technology){
        return technologyService.addTechnology(technology)+"";
    }

    /**
     * 删除工艺
     * @param technology 工艺对象
     * @return 结果标识
     */
    @ResponseBody
    @RequestMapping("/delTechnology.do")
    public String delTechnology(Technology technology){
        return technologyService.delTechnology(technology)+"";
    }
}
