package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ruike.cim.pojo.Menu;
import team.ruike.cim.pojo.MenuType;
import team.ruike.cim.pojo.ProductGoodsShelve;
import team.ruike.cim.pojo.ProductWarehouseRegion;
import team.ruike.cim.service.MenuService;
import team.ruike.cim.service.ProductGoodSShelve;
import team.ruike.cim.service.ProductWareHouSereGIonService;
import team.ruike.cim.util.GenerateNumber;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.util.List;

/**
 * 成品区域
 */
@Controller
public class ProductWareHouSeregionController {
    @Resource
    private ProductWareHouSereGIonService productWareHouSereGIonService;
    @Resource
    private ProductGoodSShelve productGoodSShelve;
    @Resource
    private MenuService menuService;

    /**
     * 获取成品区域集合
     * @param productWarehouseRegion
     * @param pager
     * @param productGoodsShelve
     * @param request
     * @return
     */
    @RequestMapping("/getProductwarehouseregion.do")
    public String getProductwarehouseregion(ProductWarehouseRegion productWarehouseRegion, Pager<ProductWarehouseRegion> pager, ProductGoodsShelve productGoodsShelve, HttpServletRequest request) {
        productWareHouSereGIonService.getProductWareHouSereGIon(productWarehouseRegion,pager);
        List<MenuType> mm=menuService.getMenuTypeList();
        request.setAttribute("Mtype",mm);
        request.setAttribute("productGoodsShelves", productGoodSShelve.getProductGoodSShelve(productGoodsShelve));
        request.setAttribute("productWarehouseRegions",pager);
        request.setAttribute("Phid",productWarehouseRegion.getProductWarehouse().getProductWarehouseId());
        return "warehouses/warehouse_region";
    }

    /**
     * 新增成品区域
     * @param productWarehouseRegion
     * @param printWriter
     */
    @RequestMapping("addProductwarehouseregion.do")
    public void addProductwarehouseregion(ProductWarehouseRegion productWarehouseRegion,PrintWriter printWriter){
        productWarehouseRegion.setProductWarehouseRegionNo(GenerateNumber.getGenerateNumber().getRandomFileName());
       int i =  productWareHouSereGIonService.addProductWareHouSereGIon(productWarehouseRegion);
        System.out.println(i);
        if (productWarehouseRegion.getProductWarehouseRegionId()!=null&&productWarehouseRegion.getProductWarehouseRegionId()>0){
            String Stringusers= JSON.toJSONString(productWarehouseRegion);
            printWriter.write(Stringusers);
            printWriter.flush();
            printWriter.close();
        }
    }

    /**
     * 添加成品货架
     * @param productGoodsShelve 成品货架对象
     * @param printWriter  返回JSON对象
     */
    @RequestMapping("addProductGoodSShelve.do")
    public void addProductGoodSShelve(ProductGoodsShelve productGoodsShelve,PrintWriter printWriter){
        productGoodsShelve.setProductGoodsShelveNo(GenerateNumber.getGenerateNumber().getRandomFileName());
        productGoodSShelve.addProductGoodSShelve(productGoodsShelve);
        if (productGoodsShelve.getProductGoodsShelveId()!=null&&productGoodsShelve.getProductGoodsShelveId()>0){
            String Stringusers= JSON.toJSONString(productGoodsShelve);
            printWriter.write(Stringusers);
            printWriter.flush();
            printWriter.close();
        }
    }
}
