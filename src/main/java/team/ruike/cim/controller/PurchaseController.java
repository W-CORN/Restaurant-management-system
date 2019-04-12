package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ruike.cim.dao.MaterielDao;
import team.ruike.cim.pojo.*;
import team.ruike.cim.service.MaterielService;
import team.ruike.cim.service.PurchaseService;
import team.ruike.cim.service.SupplierService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 采购业务控制器
 * @author 张振国
 * @version 1.0
 */
@Controller
@RequestMapping("/purchase")
public class PurchaseController {
    @Resource
    private PurchaseService purchaseService;
    @Resource
    private MaterielService materielService;
    @Resource
    private SupplierService supplierService;
    /**
     * 跳转周期采购计划页面并查询数据
     * @param stagePurchasingPlan 周期采购计划（参数）
     * @param pager 分页辅助类
     * @param request request
     * @return 计划页面
     */
    @RequestMapping("stagePurchasingPlan.do")
    public String stagePurchasingPlan(StagePurchasingPlan stagePurchasingPlan, Pager<StagePurchasingPlan> pager, HttpServletRequest request){
        purchaseService.getStagePurchasingPlans(stagePurchasingPlan,pager);
        request.setAttribute("pager",pager);
        return "purchase/stagepurchasingplan";
    }

    /**
     * 获取周期计划详细信息
     * @param stagePurchasingPlanId 计划id
     * @param request request
     * @return 修改页面
     */
    @RequestMapping("stagePurchasingPlan.cl")
    public String stagePurchasingPlanById(Integer stagePurchasingPlanId,HttpServletRequest request){
        request.setAttribute("plan",purchaseService.getStagePurchasingPlan(stagePurchasingPlanId));
        //查询供应商
        Pager<Supplier> supplierPager=new Pager<Supplier>();
        supplierPager.setCurrentPage(1);
        supplierPager.setPageSize(1000);
        supplierService.getSupplier(new Supplier(),supplierPager);//获取供应商集合
        request.setAttribute("suppliers",supplierPager.getList());
        //查询物料
        Pager<Materiel> pager=new Pager<Materiel>();
        pager.setCurrentPage(1);
        pager.setPageSize(1000);
        materielService.getMaterielList(new Materiel(),pager);//获取物料集合
        request.setAttribute("materiels",pager.getList());
        return "purchase/updstagepurchasingplan";
    }
    @ResponseBody
    @RequestMapping("updStagePurchasingPlan.do")
    public String updStagePurchasingPlan(StagePurchasingPlan stagePurchasingPlan,String stagePurchasingPlanTerms){
            List<StagePurchasingPlanTerm> items=new ArrayList<StagePurchasingPlanTerm>();
            JSONArray array = JSONArray.fromObject(stagePurchasingPlanTerms);
            for (Object o : array) {
                items.add((StagePurchasingPlanTerm) (JSONObject.toBean(JSONObject.fromObject(o), StagePurchasingPlanTerm.class)));
            }
            purchaseService.updateStagePurchasingPlan(stagePurchasingPlan,items);
            return true+"";
    }

    /**
     * 获取采购记录
     * @param purchase 采购记录对象（参数）
     * @param pager 分页辅助类
     * @param request request
     * @return 采购页面
     */
    @RequestMapping("purchase.do")
    public String purchase(Purchase purchase,Pager<Purchase> pager,HttpServletRequest request){
        purchaseService.getPurchase(purchase,pager);
        request.setAttribute("pager",pager);
        return "purchase/purchase";
    }

    /**
     * 新增周期采购计划页面跳转
     * @return 新增页面
     */
    @RequestMapping("addStagePurchasingPlan.cl")
    public String addStagePurchasingPlan(HttpServletRequest request){
        //查询供应商
        Pager<Supplier> supplierPager=new Pager<Supplier>();
        supplierPager.setCurrentPage(1);
        supplierPager.setPageSize(1000);
        supplierService.getSupplier(new Supplier(),supplierPager);//获取供应商集合
        request.setAttribute("suppliers",supplierPager.getList());
        //查询物料
        Pager<Materiel> pager=new Pager<Materiel>();
        pager.setCurrentPage(1);
        pager.setPageSize(1000);
        materielService.getMaterielList(new Materiel(),pager);//获取物料集合
        request.setAttribute("materiels",pager.getList());
        return "purchase/addstagepurchasingplan";
    }

    /**
     * 新增周期采购计划
     * @param stagePurchasingPlans 周期采购计划Json
     * @return 成功标识
     */
    @RequestMapping("addStagePurchasingPlan.do")
    @ResponseBody
    public String addStagePlan(String stagePurchasingPlans,String stagePurchasingPlanTerms,HttpServletRequest request){
        StagePurchasingPlan stagePurchasingPlan =null;
        JSONObject jsonObject=JSONObject.fromObject(stagePurchasingPlans);
        stagePurchasingPlan= (StagePurchasingPlan) (JSONObject.toBean(jsonObject, StagePurchasingPlan.class));
        stagePurchasingPlan.setUser((User)(request.getSession().getAttribute("u")));
        List<StagePurchasingPlanTerm> items=new ArrayList<StagePurchasingPlanTerm>();
        JSONArray array = JSONArray.fromObject(stagePurchasingPlanTerms);
        for (Object o : array) {
            items.add((StagePurchasingPlanTerm) (JSONObject.toBean(JSONObject.fromObject(o), StagePurchasingPlanTerm.class)));
        }
        stagePurchasingPlan.setStagePurchasingPlanTermList(items);
        purchaseService.addStagePurchasingPlan(stagePurchasingPlan);//调用业务层方法新增
        return true+"";//直接返回true（如出错的话前端ajax的error会接收）
    }

    /**
     * 删除周期计划
     * @param stagePurchasingPlanId 计划id
     * @return 成功标识
     */
    @RequestMapping("delstagePurchasingPlan.do")
    @ResponseBody
    public String delStagePlan(Integer stagePurchasingPlanId){
        purchaseService.delStagePurchasingPlan(stagePurchasingPlanId);//调用业务层方法新增
        return true+"";//直接返回true（如出错的话前端ajax的error会接收）
    }

    /**
     * 跳转每日计划页面并返回数据
     * @param everydayPurchasingPlan 计划对象（查询参数）
     * @param pager 分页辅助类
     * @param request request
     * @return 计划页面
     */
    @RequestMapping("getEverydayPurchasePlans.do")
    public String getEverydayPurchasePlans(EverydayPurchasingPlan everydayPurchasingPlan,Pager<EverydayPurchasingPlan> pager,HttpServletRequest request){
        purchaseService.getEverydayPurchasePlans(everydayPurchasingPlan,pager);
        request.setAttribute("pager",pager);
        return "purchase/everydaypurchasingplan";
    }
}
