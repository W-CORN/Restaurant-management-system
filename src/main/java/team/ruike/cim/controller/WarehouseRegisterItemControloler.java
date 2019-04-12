package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.ruike.cim.pojo.*;
import team.ruike.cim.service.*;
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
 * 物料入库记录项
 */
@Controller
public class WarehouseRegisterItemControloler {
    @Resource
    private WarehouseRegisterItemService warehouseRegisterItemService;
    @Resource
    private MaterielTypeLevelBServiceImpl materielTypeLevelBService;
    @Resource
    private WareHouSereGIonService warehouseRegionService;
    @Resource
    private GoodSShelveService goodSShelveService;
    @Resource
    private MaterielService materielService;
    @Resource
    WareHouSereGISTerService wareHouSereGISTerService;
    @Resource
    WarehouseService warehouseService;

    /**
     * 查看入库记录页面
     */
    @RequestMapping("/getWarehouseRegisterItem.do")
    public String getWarehouseRegisterItem(HttpServletRequest request, WarehouseRegisterItem warehouseRegisterItem, Pager<WarehouseRegisterItem> pager) {
        warehouseRegisterItemService.getWarehouseRegisterItemByWarehouseId(warehouseRegisterItem, pager);
        request.setAttribute("wid",warehouseRegisterItem.getGoodsShelve().getWarehouseRegion().getWarehouse().getWarehouseId());
        request.setAttribute("RegisterItemPager",pager);
        return "warehouses/materiel_register";
    }

    /**
     * 跳转入库记录页面
     *
     * @param request            作用域
     * @param materielTypeLevelB 物料二级类别
     * @return 返回页面
     */
    @RequestMapping("lodaddProducts.do")
    public String lodaddProducts(HttpServletRequest request, MaterielTypeLevelB materielTypeLevelB, int wid,User user) {
        request.setAttribute("uu",warehouseService.getUser(user));
        request.setAttribute("Mb", materielTypeLevelBService.getMaterielTypeLevelB(materielTypeLevelB));//加载物料列表
        request.setAttribute("whid", wid);
        return "warehouses/addproduct_warehouse_register_item";
    }

    /**
     * 根据物料id查询对应的区域
     *
     * @param warehouseRegion 区域
     * @param pager           分页辅助类
     */
    @RequestMapping("getQuyu.cl")
    public void getQuyu(WarehouseRegion warehouseRegion, Pager<WarehouseRegion> pager, PrintWriter printWriter) {
        warehouseRegionService.getWareHouSereGIonServer(warehouseRegion, pager);
        String Stringusers = JSON.toJSONString(pager.getList());
        printWriter.write(Stringusers);
        printWriter.flush();
        printWriter.close();
    }

    /**
     * 通过区域id 查询可用空货架
     */
    @RequestMapping("gethuojia.cl")
    public void gethuojia(Integer warehouseRegionId, PrintWriter printWriter) {
        List<GoodsShelve> goodsShelveList = goodSShelveService.selectByWarehouseRegionId(warehouseRegionId);
        String joins = JSON.toJSONString(goodsShelveList);
        printWriter.write(joins);
        printWriter.flush();
        printWriter.close();
    }

    /**
     * 根据2级物料id获取三级物料列表
     */
    @RequestMapping("/getMateriel.cl")
    public void getMateriel(PrintWriter printWriter, Materiel materiel, Pager<Materiel> pager) {
        materielService.getMaterielList(materiel, pager);
        List<Materiel> materiels = pager.getList();
        String joins = JSON.toJSONString(materiels);
        printWriter.write(joins);
        printWriter.flush();
        printWriter.close();
    }

    /**
     * 根据时间查询每日计划订单编号
     *
     * @param printWriter 返回数据
     * @param dd          时间
     */
    @RequestMapping("getPlan.cl")
    public void getPlan(PrintWriter printWriter, String dd) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(dd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        EverydayPurchasingPlan everys = new EverydayPurchasingPlan();
        everys.setEverydayPurchasingPlanDate(date);
        List<EverydayPurchasingPlan> everydayPurchasingPlans = warehouseRegisterItemService.getPlan(everys);
        String joins = JSON.toJSONString(everydayPurchasingPlans);
        printWriter.write(joins);
        printWriter.flush();
        printWriter.close();
    }

    @RequestMapping("addWarehouseRegisterItem.do")
    public void addWarehouseRegisterItem(String WarehouseRegisterItems, Integer userId, Integer everydayPurchasingPlanNo, PrintWriter printWriter) {
        ArrayList<WarehouseRegisterItem> listst = JSON.parseObject(WarehouseRegisterItems, new TypeReference<ArrayList<WarehouseRegisterItem>>() {
        });
        WarehouseRegister wa = new WarehouseRegister();
        EverydayPurchasingPlan e = new EverydayPurchasingPlan();
        e.setEverydayPurchasingPlanId(everydayPurchasingPlanNo);
        User user = new User();
        user.setUserId(userId);
        wa.setUser(user);
        wa.setEverydayPurchasingPlan(e);
        wa.setWarehouseRegisterDate(new Date());
        wa.setStatus(0);
        wareHouSereGISTerService.addWarehouseRegister(wa);
        if (wa.getWarehouseRegisterId() != null && wa.getWarehouseRegisterId() > 0) {
            int i = 0;
            for (WarehouseRegisterItem item : listst) {
                item.setWarehouseRegister(wa);
                int cc = warehouseRegisterItemService.addWarehouseRegisterItem(item);
                GoodsShelve god = goodSShelveService.selectByGoodid(item.getGoodsShelve().getGoodsShelveId());
                god.setMateriel(item.getMateriel());
                god.setMaterielNumber(item.getMaterielNumber());
                goodSShelveService.updGoods_shelve(god);
                if (cc == 0) {
                    printWriter.write("0");
                }
                i++;
            }
            if (i == listst.size()) {
                printWriter.write("1");
            }
            printWriter.write("0");
        }
        printWriter.write("0");
        printWriter.flush();
        printWriter.close();
    }
}
