package team.ruike.cim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ruike.cim.pojo.ProductWarehouseOutRegisterItem;
import team.ruike.cim.pojo.ProductWarehouseRegister;
import team.ruike.cim.pojo.ProductWarehouseRegisterItem;
import team.ruike.cim.service.ProductWarehouseRegisterService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 成品库入库控制器
 */
@Controller
public class ProductWarehouseRegisterController {
    @Resource
    private ProductWarehouseRegisterService productWarehouseRegisterService;
   @RequestMapping("getProductWarehouseRegister.do")
    public String getProductWarehouseRegister(ProductWarehouseRegisterItem productWarehouseRegisterItem, Pager< ProductWarehouseRegisterItem> pager, HttpServletRequest request){
        productWarehouseRegisterService.getItemByProductWarehouseId(productWarehouseRegisterItem,pager);
        request.setAttribute("RuKuPage",pager);
       return "warehouses/product";
    }

    @RequestMapping("getProductOutRegisterItem.do")
    public String getProductOutWarehouseRegister(ProductWarehouseOutRegisterItem productWarehouseOutRegisterItem, Pager< ProductWarehouseOutRegisterItem> pager, HttpServletRequest request){
       return "warehouses/ProductWareHouseRegisterOutItem";
    }
}
