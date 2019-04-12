package team.ruike.cim.controller;

import org.springframework.stereotype.Controller;
import team.ruike.cim.pojo.WarehouseRegister;
import team.ruike.cim.service.WareHouSereGISTerService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 物料入库记录
 */
@Controller
public class WareHouSereGISTerControler {
    @Resource
    private WareHouSereGISTerService warehouseRegisterSevice;
        public String addWareHouSereGISTer(WarehouseRegister warehouseRegister, HttpServletRequest request, Pager<WarehouseRegister> pager){
            warehouseRegisterSevice.getWarehouseRegister(warehouseRegister,pager);
            request.setAttribute("warehouseRegisterpa",pager);
            return "warehouses/materiel_register";
        }
}
