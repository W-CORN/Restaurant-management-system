package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ruike.cim.pojo.Materiel;
import team.ruike.cim.pojo.MaterielTypeLevelB;
import team.ruike.cim.service.MaterielService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *物料业务控制器
 * @author 张振国
 * @version 1.0
 */
@Controller
public class MaterielController {
    @Resource
    private MaterielService materielService;

    /**
     * 查询物料列表
     * @param materiel 物料（条件）
     * @param pager 分页辅助类对象
     * @param request request
     * @return 物料页面视图地址
     */
    @RequestMapping("/materiellist.do")
    public String getMaterielList(Materiel materiel, Pager<Materiel> pager, HttpServletRequest request){
        materielService.getMaterielList(materiel,pager);
        request.setAttribute("typea",materielService.getMaterielTypeLevelA());
        request.setAttribute("typeb",materielService.getMaterielTypeLevelB());
        request.setAttribute("utils",materielService.getMaterielUnit());
        request.setAttribute("pager",pager);
        return "materiel";
    }
    /**
     * 新增物料业务
     * @return 结果标识
     */
    @ResponseBody
    @RequestMapping("/addMateriel.do")
    public String addMateriel(Materiel materiel,HttpServletRequest request){
        return materielService.addMaterielList(materiel)+"";
    }

    /**
     * 获取物品二级分类集合
     * @param materielTypeLevelB 参数
     * @return 集合
     */
    @ResponseBody
    @RequestMapping("/gettypeblist.do")
    public String getMaterielTypeBList(MaterielTypeLevelB materielTypeLevelB){
        List<MaterielTypeLevelB> typeLevelB=new ArrayList<MaterielTypeLevelB>();
        if (materielTypeLevelB.getMaterielTypeLevelA().getMaterielTypeLevelAId()!=0){
            typeLevelB = materielService.getMaterielTypeLevelB(materielTypeLevelB);
        }
        return JSONArray.toJSONString(typeLevelB);
    }

    /**
     * 删除物料
     * @return 结果标识
     */
    @ResponseBody
    @RequestMapping("/delmateriel.do")
    public String delMateriel(Materiel materiel){
       return materielService.delMateriel(materiel)+"";
    }
}
