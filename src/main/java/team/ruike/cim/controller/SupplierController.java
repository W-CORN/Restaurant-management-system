package team.ruike.cim.controller;

/**
 * Created by Administrator on 2017/12/19.
 */

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import team.ruike.cim.pojo.MaterielTypeLevelB;
import team.ruike.cim.pojo.Supplier;
import team.ruike.cim.pojo.SupplierContract;
import team.ruike.cim.service.SupplierService;
import team.ruike.cim.util.GenerateNumber;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 供应商管理控制器
 * @author 王傲祥
 * @version 1.0
 */
@Controller
public class SupplierController {
    @Resource
    private SupplierService supplierService;

    /**
     * 跳转到供应商，并加载数据
     * @param supplier 供应商对象
     * @param pager 分页辅助类
     * @param request 转发
     * @param materielTypeLevelB 二级类型对象
     * @return
     */
    @RequestMapping("/supplier.do")
    public String supplier(Supplier supplier, Pager<Supplier> pager, HttpServletRequest request,MaterielTypeLevelB materielTypeLevelB){

        supplierService.getSupplier(supplier, pager);
        request.setAttribute("suppliers",pager);
        request.setAttribute("MaterielTypeLevelBs",supplierService.getMaterielTypeLevelB(materielTypeLevelB));
        return "supplier/supplier";
    }

    /**
     * 删除供应商
     * @param supplierId 供应商id
     * @return
     */

    @RequestMapping("/delectSupplier.do")
    @ResponseBody
    public String delectSupplier(Integer supplierId){
        int num=supplierService.delectSupplier(supplierId);
        if(num>0){
            return "1";
        }else {
            return "0";
        }
    }

    // 2个多个上传

    public void uploads(HttpServletRequest request, @RequestParam MultipartFile[] file, @RequestParam MultipartFile[] img,Supplier supplier) {
        try {
            for (MultipartFile f : file) {
                if (!f.isEmpty()) {
                    String landing = UUID.randomUUID().toString();
                    //文件名
                    String fileName = landing + f.getOriginalFilename();
                    // 文件保存路径
                    String filePath = request.getSession().getServletContext().getRealPath("/upload/") + fileName;

                    supplier.setSupplierImage(fileName);
                    f.transferTo(new File(filePath));
                } else {
                    System.out.println("file====isempty");
                }
            }

            for (MultipartFile f : img) {
                if (!f.isEmpty()) {
                    String landing = UUID.randomUUID().toString();
                    //文件名
                    String fileName = landing + f.getOriginalFilename();
                    // 文件保存路径
                    String filePath = request.getSession().getServletContext().getRealPath("/upload/") + fileName;

                    f.transferTo(new File(filePath));
                    supplier.setSupplierCharterImage(fileName);
                } else {
                    System.out.println("img====isempty");
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }


    /**
     * 添加供应商
     * @param supplier 供应商对象
     * @param date 转换时间
     * @return
     * @throws IOException 自动抛出异常
     */
    @RequestMapping("/addSupplier.do")
    @ResponseBody
    public String addSupplier(Supplier supplier, String date,HttpServletRequest request, @RequestParam MultipartFile[] file, @RequestParam MultipartFile[] img) throws IOException {

        uploads(request,file,img,supplier);


        Date dates=null;
        try
        {
            //转换时间
            java.text.SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
            dates =  formatter.parse(date);
        }
        catch (ParseException e)
        {
            System.out.println(e.getMessage());
        }
        supplier.setCooperationStartDate(dates);
        //供应商状态，默认为1,
        supplier.setSupplierState(1);
        //自动生成编号
        supplier.setSupplierNo(GenerateNumber.getGenerateNumber().getRandomFileName());


        Supplier supplierNo=supplierService.addSupplier(supplier);

        String supplier2=JSON.toJSONString(supplierNo);


       return  supplier2;

    }

    /**
     * 修改供应商信息
     * @param supplier 供应商对象
     * @return
     */

    @RequestMapping("/updateSupplier.do")
    @ResponseBody
    public String updateSupplier(Supplier supplier){
        int num= supplierService.updateSupplier(supplier);
        if(num>0){
            return  "1";
        }else {
            return  "0";
        }


    }

    /**
     * 根据id查询数据
     * @param id 供应商id
     * @return
     */

    @RequestMapping("/getSupplierById.do")
    @ResponseBody
    public String getSupplierById(@RequestParam(value = "id") int id){
        Supplier supplier=supplierService.getSupplierById(id);
        return JSON.toJSONString(supplier);
    }

    /**
     *根据ID查询所有合同
     * @param id 合同id
     * @return
     */
    @RequestMapping("/getSupplierContractById.do")
    @ResponseBody
    public String getSupplierContractById(@RequestParam(value = "id")int id){
       SupplierContract supplierContract= supplierService.getSupplierContractById(id);
        return JSON.toJSONString(supplierContract);
    }
    /**
     * 跳转，合同管理页面，并加载数据
     * @param supplierContract 合同对象
     * @param pager 分页辅助类
     * @param request 转发
     * @param supplier 供应商对象
     * @return
     */
    @RequestMapping("/contractManagement.do")
    public String contractManagement(SupplierContract supplierContract,Pager<SupplierContract> pager,HttpServletRequest request,Supplier supplier){
        supplierService.getSupplierContract(supplierContract,pager);
        request.setAttribute("supplierContracts",pager);
        request.setAttribute("supplierList",supplierService.getSupplierList(supplier));
        return "supplier/contractManagement";
    }

    /**
     * 添加合同
     * @param supplierContract 合同对象
     * @param date 时间转换
     * @param file 上传文件
     * @param request 转发
     * @return
     */
    @RequestMapping("/addSupplierContract.do")
    @ResponseBody
    public String addSupplierContract(SupplierContract supplierContract,String date,@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request){
        upload(file, request,supplierContract);

        Date dates=null;
        try
        {
            //转换时间
            java.text.SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
            dates =  formatter.parse(date);
        }
        catch (ParseException e)
        {
            System.out.println(e.getMessage());
        }
        supplierContract.setSupplierContractDate(dates);

        supplierContract.setStatus(0);

        SupplierContract supplierContractNo = supplierService.addSupplierContract(supplierContract);
        String supplierContract1= JSON.toJSONString(supplierContractNo);
        return supplierContract1;
    }

    /**
     * 上传文件
     * @param file 上传
     * @param request 转发
     * @return
     */
    public String upload(CommonsMultipartFile file, HttpServletRequest request,SupplierContract supplierContract) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {

                String landing = UUID.randomUUID().toString();
                //文件名
                String fileName = landing + file.getOriginalFilename();
                // 文件保存路径
                String filePath = request.getSession().getServletContext().getRealPath("/upload/") + fileName;
                file.transferTo(new File(filePath));
                supplierContract.setSupplierContractImage(fileName);

                return filePath;

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }


}
