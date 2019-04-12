package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import sun.misc.BASE64Encoder;
import team.ruike.cim.pojo.*;
import team.ruike.cim.service.MaterielService;
import team.ruike.cim.service.MenuService;
import team.ruike.cim.service.TechnologyService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 菜谱控制器分支
 *
 * @author 甄立
 * @version 1.0
 */
@RequestMapping("menu")
@Controller
public class MenuBranchController {

    @Resource
    private MenuService menuService;

    @Resource
    private MaterielService materielService;
    @Resource
    private TechnologyService technologyService;

    @RequestMapping("toAdd.cl")
    public String toAdd(Model model) {
        List<MenuType> menuTypeList = menuService.getMenuTypeList();
        List<MenuState> menuStateList = menuService.getMenuStateList();
        List<MaterielTypeLevelA> materielTypeLevelAList = materielService.getMaterielTypeLevelA();
        List<Technology> technologyList = technologyService.selectAllTechnology();
        model.addAttribute("technologyList", technologyList);
        model.addAttribute("menuStateList", menuStateList);
        model.addAttribute("menuTypeList", menuTypeList);
        model.addAttribute("materielTypeLevelAList", materielTypeLevelAList);
        return "menu/add";
    }

    @RequestMapping("add.do")
    @ResponseBody
    public String add(Menu menu, String menuFlowArray, HttpServletRequest request) throws Exception {
        List<MenuFlow> menuFlowList = new ArrayList<>();
        JSONArray array = JSONArray.fromObject(menuFlowArray);
        for (Object o : array) {
            menuFlowList.add((MenuFlow) (JSONObject.toBean(JSONObject.fromObject(o), MenuFlow.class)));
        }



        menu.setMenuImage(menuUpload(request));
        menuFlowUpload(menuFlowList, request);
        menuService.addMenu(menu, menuFlowList);
        return "1";
    }

    @RequestMapping("edit.do")
    @ResponseBody
    public String edit(Menu menu, String menuFlowArray, HttpServletRequest request) throws Exception {
        List<MenuFlow> menuFlowList = new ArrayList<>();
        JSONArray array = JSONArray.fromObject(menuFlowArray);
        for (Object o : array) {
            menuFlowList.add((MenuFlow) (JSONObject.toBean(JSONObject.fromObject(o), MenuFlow.class)));
        }
        String menuImage = menuUpload(request);

        if (menuImage != null) {
            menu.setMenuImage(menuImage);
        }
        menuFlowUpload(menuFlowList, request);
        menuService.updateMenu(menu, menuFlowList);

        return "1";
    }


    private String menuUpload(HttpServletRequest request) {
        MultipartHttpServletRequest murequest = (MultipartHttpServletRequest) request;
        //在文件上传请求中获取文件，根据file的name
        List<MultipartFile> files = murequest.getFiles("menuImageData");
        try {
            for (int i = 0; i < files.size(); i++) {
                if (!files.get(i).isEmpty()) {
                    String landing = UUID.randomUUID().toString();
                    //文件名
                    String fileName = landing + files.get(i).getOriginalFilename();
                    // 文件保存路径
                    String filePath = request.getSession().getServletContext().getRealPath("/images/menuimg/") + fileName;
                    // 转存文件
                    files.get(i).transferTo(new File(filePath));
                    return fileName;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    private void menuFlowUpload(List<MenuFlow> menuFlowList, HttpServletRequest request) {
        MultipartHttpServletRequest murequest = (MultipartHttpServletRequest) request;
        try {
            for (String key : murequest.getFileMap().keySet()) {
                if (!key.equals("menuImageData")) {
                    for (MenuFlow menuFlow : menuFlowList) {
                        if (!murequest.getFileMap().get(key).isEmpty()) {
                            if (menuFlow.getMenuFlowImageCorrespond().equals(key)) {

                                MultipartFile file = murequest.getFileMap().get(key);
                                String landing = UUID.randomUUID().toString();
                                //文件名
                                String fileName = landing + file.getOriginalFilename();
                                // 文件保存路径
                                String filePath = request.getSession().getServletContext().getRealPath("/upload/") + fileName;
                                // 转存文件
                                file.transferTo(new File(filePath));

                                menuFlow.setMenuFlowImage(fileName);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据一物料级别查询物料
     *
     * @param MaterielByLevelId 一物料级别ID
     * @return 二级物料
     */
    @RequestMapping("queryMaterielByOneLevel.cl")
    @ResponseBody
    public String queryMaterielByOneLevel(Integer MaterielByLevelId) {
        List<MaterielTypeLevelB> materielTypeLevelBList = new ArrayList<>();
        for (MaterielTypeLevelB materielTypeLevelB : materielService.getMaterielTypeLevelB()) {
            if (materielTypeLevelB.getMaterielTypeLevelA().getMaterielTypeLevelAId().equals(MaterielByLevelId)) {
                materielTypeLevelBList.add(materielTypeLevelB);
            }
        }
        return JSON.toJSONString(materielTypeLevelBList);
    }

    /**
     * 根据二物料级别查询物料
     *
     * @param MaterielByLevelId 二物料级别ID
     * @return 三级物料
     */
    @RequestMapping("queryMaterielByTwoLevel.cl")
    @ResponseBody
    public String queryMaterielByTwoLevel(Integer MaterielByLevelId) {
        List<Materiel> materielList = new ArrayList<>();
        for (Materiel materiel : materielService.selectAllMateriel()) {
            if (materiel.getMaterielTypeLevelB().getMaterielTypeLevelBId().equals(MaterielByLevelId)) {
                materielList.add(materiel);
            }
        }
        return JSON.toJSONString(materielList);
    }


    @RequestMapping("toEdit.cl")
    public String toEdit(@RequestParam(value = "menuId") Integer menuId, Model model) {

        Menu menu = menuService.selectById(menuId);
      /*  if (menu.getMenuImage() != null && !menu.getMenuImage().equals("")) {
            String path = request.getSession().getServletContext().getRealPath("/images/menuimg/") + menu.getMenuImage();
            menu.setMenuImage(GetImageStr(path));
        }*/
        model.addAttribute("menu", menu);
        List<MenuType> menuTypeList = menuService.getMenuTypeList();
        List<MenuState> menuStateList = menuService.getMenuStateList();
        List<MaterielTypeLevelA> materielTypeLevelAList = materielService.getMaterielTypeLevelA();
        List<Technology> technologyList = technologyService.selectAllTechnology();
        model.addAttribute("technologyList", technologyList);
        model.addAttribute("menuStateList", menuStateList);
        model.addAttribute("menuTypeList", menuTypeList);
        model.addAttribute("materielTypeLevelAList", materielTypeLevelAList);
        return "menu/edit";
    }


    private static String GetImageStr(String imgFilePath) {
        // 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(imgFilePath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);// 返回Base64编码过的字节数组字符串
    }


    @RequestMapping("del.do")
    @ResponseBody
    public String del(@RequestParam(value = "menuId") Integer menuId) {
        menuService.deleteById(menuId);
        return "1";
    }

}
