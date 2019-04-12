package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ruike.cim.pojo.ProductWarehouse;
import team.ruike.cim.service.PwarehouseService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;

/**
 * 成品仓库
 */
@Controller
public class PWareHouseController {
    @Resource
    private PwarehouseService pwarehouseService;
    @RequestMapping("productWarehouse.do")
    public String getPwarehouse(ProductWarehouse productWarehouse, Pager<ProductWarehouse> pager,HttpServletRequest request){
        pwarehouseService.getWarehouse(productWarehouse);
        request.setAttribute("productWarehouses", pager.getList());
        return "warehouses/warehouse";
    }
    @RequestMapping("/addPWareHouse.do")
    public void addPwarehouse(PrintWriter printWriter,ProductWarehouse productWarehouse){
        pwarehouseService.addPwarehouse(productWarehouse);
        if (productWarehouse.getProductWarehouseId()!=null&&productWarehouse.getProductWarehouseId()>0){
            String Stringusers= JSON.toJSONString(productWarehouse.getProductWarehouseId());
            printWriter.write(Stringusers);
            printWriter.flush();
            printWriter.close();
        }
    }
}
