package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import team.ruike.cim.pojo.ContractOrder;
import team.ruike.cim.pojo.OrderContract;
import team.ruike.cim.pojo.Store;
import team.ruike.cim.service.ContractOrderService;
import team.ruike.cim.service.OrderContractService;
import team.ruike.cim.service.StoreService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

/**
 * 订单合同
 *[
 * @author 甄立
 * @version 1.0
 */
@Controller
@RequestMapping("order/contract")
public class OrderContractController {

    @Resource
    private OrderContractService orderContractService;

    @Resource
    private ContractOrderService contractOrderService;

    @Resource
    private StoreService storeService;


    @RequestMapping("index.do")
    public String index(OrderContract orderContract, Pager<OrderContract> pager, Model model) {
        orderContractService.queryOrderContract(orderContract, pager);
        List<Store> storeList = storeService.queryAllStore();
        model.addAttribute("storeList", storeList);
        model.addAttribute("pager", pager);
        model.addAttribute("orderContract", orderContract);
        return "order/contractControl/index";
    }

    @RequestMapping("toEdit.cl")
    public String toEdit(@RequestParam(value = "orderContractId") Integer orderContractId, Model model) {
        OrderContract orderContract = orderContractService.queryOrderContractById(orderContractId);
        List<Store> storeList = storeService.queryAllStore();
        model.addAttribute("storeList", storeList);
        model.addAttribute("orderContract", orderContract);
        return "order/contractControl/edit";
    }

    @RequestMapping("toPreview.do")
    public void toPreview(@RequestParam(value = "orderContractId") Integer orderContractId, HttpServletResponse response,HttpServletRequest request) {
        OrderContract orderContract = orderContractService.queryOrderContractById(orderContractId);
        try {
            OutputStream outputStream = response.getOutputStream();
            String filePath = orderContract.getOrderContractImage();
            Path file = Paths.get( request.getSession().getServletContext().getRealPath("/upload/")+filePath);
            Files.copy(file, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("edit.do")
    public String edit(OrderContract orderContract, @RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) {
        String filePath = upload(file, request);
        orderContract.setOrderContractImage("");
        if (filePath != null && !filePath.equals("")) {
            orderContract.setOrderContractImage(filePath);
        }
        orderContractService.updateOrderContractById(orderContract);
        return "order/contractControl/index";
    }


    @RequestMapping("add.do")
    @ResponseBody
    public String add(OrderContract orderContract, @RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) {

        String filePath = upload(file, request);
        orderContract.setOrderContractImage("");
        if (filePath != null && !filePath.equals("")) {
            orderContract.setOrderContractImage(filePath);
        }

        OrderContract orderContract1 = orderContractService.addOrderContract(orderContract);
        return JSON.toJSONString(orderContract1);
    }


    public String upload(CommonsMultipartFile file, HttpServletRequest request) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                String landing = UUID.randomUUID().toString();
                //文件名
                String fileName = landing + file.getOriginalFilename();
                // 文件保存路径
                String filePath = request.getSession().getServletContext().getResource("upload\\").getPath() + fileName;
                // 转存文件
                file.transferTo(new File(filePath));
                return fileName;

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

}
