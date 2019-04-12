package team.ruike.cim.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ruike.cim.pojo.ContractProductionDistribution;
import team.ruike.cim.pojo.TemporaryProductionDistribution;
import team.ruike.cim.service.ProductionBranchService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductionBranchController {

    @Resource
    private ProductionBranchService productionBranchService;

    /**
     * 跳转任务分配页面
     * @param request 作用域
     * @param contractProductionDistribution 合同订单任务分配
     * @param temporaryProductionDistribution 临时订单任务分配
     * @param pager1 合同分页辅助类
     * @param pager2 临时订单辅助类
     * @return 任务分配查看页面
     */
    @RequestMapping("productionDistribution.do")
    public String openProduction(HttpServletRequest request, ContractProductionDistribution contractProductionDistribution, TemporaryProductionDistribution temporaryProductionDistribution, Pager<ContractProductionDistribution> pager1, Pager<TemporaryProductionDistribution> pager2){
        productionBranchService.selectContractProductionDistribution(contractProductionDistribution,pager1);
        productionBranchService.selectTemporaryProductionDistribution(temporaryProductionDistribution,pager2);
        request.setAttribute("pg1",pager1);
        request.setAttribute("pg2",pager2);
        return "production/viewProductionDistribution";
    };
}
