package team.ruike.cim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ruike.cim.pojo.*;
import team.ruike.cim.service.EquipementService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/5.
 */

/**
 *设备业务控制器
 * @author 王傲祥
 * @version 1.0
 */
@Controller
public class EquipementControloler {
    @Resource
    private EquipementService equipementService;

    /**
     * 查询所有设备信息
     * @param equipment 设备表
     * @param pager 分页辅助类
     * @param request 转发
     * @param equipmentType 设备状态
     * @param working 工序表
     * @param productionLine 生产线
     * @param user 用户
     * @return list对象
     */
    @RequestMapping("/equipment.do")
    public String  equipment(@RequestParam(value = "ms",required = false)Integer ms, Equipment equipment, Pager<Equipment> pager, HttpServletRequest request, EquipmentType equipmentType, Working working, ProductionLine productionLine, User user,String SD){
        if (ms!=null&&ms==1){
            System.out.print(ms);
        }
        if (SD!=null  && SD!=""){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            Date date=null;
            try {
                date=format.parse(SD);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            equipment.setStartDate(date);
        }
        equipementService.getEquipment(equipment, pager);
        request.setAttribute("equipments",pager);
        request.setAttribute("equipmentTypes",equipementService.getEquipmentType(equipmentType));
        request.setAttribute("workings",equipementService.getWorking(working));
        request.setAttribute("productionLines",equipementService.getProductionLine(productionLine));
        request.setAttribute("users",equipementService.getUser(user));
        return "equipement/equipment";
    }

    /**
     * 新增设备信息
     * @param equipment 设备表
     * @return 是否成功
     */
    @RequestMapping("/addEquipment.do")
    @ResponseBody
    public  String addEquipment(Equipment equipment){
        equipment.setStatus(0);
        equipementService.addEquipment(equipment);
       return "1";
    }

    /**
     * 修改设备信息
     * @param equipments 设备表
     * @return 是否成功
     */
    @RequestMapping("/updateMateriel.do")
    public String updateMateriels(Equipment equipments){
        int num = equipementService.updateEquipment(equipments);
        if (num==1){
            if (equipments.getEquipmentType().getEquipmentTypeId()!=1) {
                return "forward:/redayAddEP.cl?equipment="+equipments;
            } else {
                return "redirect:/equipment.do";
            }
        }else {
            return"redirect:/equipment.do?ms=1";
        }
    }

    /**
     * 跳转异常新增页面
     * @param equipment 设备表
     * @param request 转发
     * @return 对象ID
     */
    @RequestMapping("/redayAddEP.cl")
    public String redayAddEP(Equipment equipment,HttpServletRequest request){
        Equipment equipment1=new Equipment();
        equipment1=equipementService.redalAddEP(equipment);
        request.setAttribute("et",equipment1);
        return "equipement/addequipmentreport";
    }

    /**
     * 添加异常报告
     * @param equipmentReport 异常表
     * @param date 时间
     * @return 是否成功
     */
    @RequestMapping("/addequipmentreport.do")
    public String addequipmentType(EquipmentReport equipmentReport, String date){
        Date dates=null;
        try
        {
            java.text.SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
            dates =  formatter.parse(date);
        }
        catch (ParseException e)
        {
            System.out.println(e.getMessage());
        }
        equipmentReport.setEndDate(dates);
        int num=equipementService.addEquipmentReport(equipmentReport);
        if (num>0) {
            return "redirect:/equipment.do";
        }else {
            return "equipement/addequipmentreport";
        }
    }

    /**
     * 删除设备
     * @param equipmentId 设备ID
     * @return 是否删除
     */
    @RequestMapping("/delequipment.do")
    @ResponseBody
    public String delMateriel(Integer equipmentId ){
        int num=equipementService.deleteEquipment(equipmentId);
        if (num>0){
            return "1";
        }else {
            return "0";
        }
    }

    /**
     * 查询异常信息
     * @param equipmentReport 异常对象
     * @param pager 分页辅助类
     * @param request 转发
     * @return 异常集合
     */
    @RequestMapping("/equipmentreport.do")
    public String equipmentreport(EquipmentReport equipmentReport,Pager<EquipmentReport> pager, HttpServletRequest request,User user){
        equipementService.getEquipmentReport(equipmentReport,pager);
        request.setAttribute("equipmentReports",pager);
        request.setAttribute("users",equipementService.getUser(user));

        return "equipement/equipmentreport";
    }
}
