package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ruike.cim.dao.WarehouseOutRegisterDao;
import team.ruike.cim.pojo.*;
import team.ruike.cim.service.GoodSShelveService;
import team.ruike.cim.service.MenuService;
import team.ruike.cim.service.WarehouseOutRegisterItemService;
import team.ruike.cim.service.WarehouseService;
import team.ruike.cim.service.impl.MaterielTypeLevelBServiceImpl;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 物料出库记录表项控制器
 */
@Controller
public class WarehouseOutRegisterItemController {
    @Resource
    private WarehouseOutRegisterItemService warehouseOutRegisterItemService;
    @Resource
    private WarehouseService warehouseService;
    @Resource
    private MaterielTypeLevelBServiceImpl materielTypeLevelBService;
    @Resource
    WarehouseOutRegisterDao warehouseOutRegisterDao;
    @Resource
    GoodSShelveService goodSShelveService;
    @RequestMapping("getWarehouseOutRegisterItem.do")
    public String getWarehouseOutRegisterItem(WarehouseOutRegisterItem warehouseOutRegisterItem, Pager<WarehouseOutRegisterItem> pager, HttpServletRequest request) {
        warehouseOutRegisterItemService.getOutRegisterItemByWarehouseId(warehouseOutRegisterItem, pager);
        request.setAttribute("wid", warehouseOutRegisterItem.getGoodsShelve().getWarehouseRegion().getWarehouse().getWarehouseId());
        request.setAttribute("OutRegisterItemPage", pager);
        return "warehouses/materiel_Out_Register";
    }

    @RequestMapping("lodlodaddProductsOut.do")
    public String lodlodaddProductsOut(HttpServletRequest request, User user, MaterielTypeLevelB materielTypeLevelB, int wid) {
        request.setAttribute("outUser", warehouseService.getUser(user));
        request.setAttribute("outMb", materielTypeLevelBService.getMaterielTypeLevelB(materielTypeLevelB));//加载物料列表
        request.setAttribute("whid", wid);
        return "warehouses/addproduct_warehouse_out_register_item";
    }

    @RequestMapping("selectgods.cl")
    public void selectgods(PrintWriter printWriter, GoodsShelve goodsShelve) {
        List<GoodsShelve> goodsShelveList = warehouseOutRegisterItemService.getGoods(goodsShelve);
        String jsonString = JSON.toJSONString(goodsShelveList);
        printWriter.write(jsonString);
        printWriter.flush();
        printWriter.close();
    }

    @RequestMapping("aadWarehouseOutRegisterItem.do")
    public void addWarehouseOutRegisterItem(PrintWriter printWriter, String WarehouseOutRegisterItems, int userId) {
        ArrayList<WarehouseOutRegisterItem> listst = JSON.parseObject(WarehouseOutRegisterItems, new TypeReference<ArrayList<WarehouseOutRegisterItem>>() {});
        WarehouseOutRegister ware=new WarehouseOutRegister();
        User u=new User();
        u.setUserId(userId);
        ware.setUser(u);
        ware.setWarehouseOutRegisterEndDate(new Date());
        warehouseOutRegisterDao.add(ware);
        int i=0;
        if (ware.getWarehouseOutRegisterId()!=null&&ware.getWarehouseOutRegisterId()>0) {
            for (WarehouseOutRegisterItem item : listst) {
                item.setWarehouseOutRegister(ware);
                item.setStatus(0);
               i+=warehouseOutRegisterItemService.addWarehouseOutRegisterItem(item);
               int aa=item.getGoodsShelve().getGoodsShelveId();
              GoodsShelve god=  goodSShelveService.selectByGoodid(aa);
              god.setMaterielNumber(god.getMaterielNumber()-item.getMaterielNumber());
                goodSShelveService.updGoods_shelve(god);
            }
            if (i==listst.size()){
                printWriter.write("1");
            }
        }else {
            printWriter.write("0");
        }
        printWriter.flush();
        printWriter.close();
    }
}
