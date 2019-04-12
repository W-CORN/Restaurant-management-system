package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ruike.cim.service.ContractProductionPlanService;
import team.ruike.cim.service.ProductionService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

/**
 * 生产业务控制器
 * @author 张振国
 * @version 1.0
 */
@Controller
public class ProductionController {
    @Resource
    private ContractProductionPlanService contractProductionPlanService;
    @Resource
    private ProductionService productionService;
    /**
     * 跳转生产计划项任务分配页面
     * @param contractProductionPlanItemId 合同订单生产计划项id
     * @param temporaryProductionPlanItemId 临时生产计划项id
     * @param request request
     * @return 生产计划项任务分配页面
     */
    @RequestMapping("/product.do")
    public String product(Integer contractProductionPlanItemId, Integer temporaryProductionPlanItemId, HttpServletRequest request){
        //判断查询的是哪种任务分配
        if (contractProductionPlanItemId!=null&&contractProductionPlanItemId>0){
            request.setAttribute("cps",contractProductionPlanService.getContractProductionDistributions(contractProductionPlanItemId));
            request.setAttribute("citem",contractProductionPlanService.getContractProductionPlanItem(contractProductionPlanItemId));
        }else if (temporaryProductionPlanItemId!=null&&temporaryProductionPlanItemId>0){

        }
        return "product";
    }
    @RequestMapping("/generateContractProductionPlan.do")
    @ResponseBody
    public String generateContractProductionPlan() throws ParseException {
        productionService.generateContractProductionPlan();
        return "";
    }
}
