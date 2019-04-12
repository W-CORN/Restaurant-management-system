package team.ruike.cim.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单合同表
 *
 * @author 甄立
 * @version 1.0
 */
public class OrderContract implements Serializable {

    private static final long serialVersionUID = -3303836210599961526L;

    /**
     * 订单合同id
     */
    private Integer orderContractId;
    /**
     * 合同名称
     */
    private String orderContractName;
    /**
     * 订单图片路径
     */
    private String orderContractImage;
    /**
     * 合同号
     */
    private String orderContractNo;
    /**
     * 合同签订时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderContractDate;
    /**
     * 所属门店用户
     */
    private Store store;
    /**
     * 删除状态
     */
    private Integer status;

    /**
     * 合同订单
     */
    private ContractOrder contractOrder;

    public ContractOrder getContractOrder() {
        return contractOrder;
    }

    public void setContractOrder(ContractOrder contractOrder) {
        this.contractOrder = contractOrder;
    }

    public Integer getOrderContractId() {
        return orderContractId;
    }

    public void setOrderContractId(Integer orderContractId) {
        this.orderContractId = orderContractId;
    }


    public String getOrderContractName() {
        return orderContractName;
    }

    public void setOrderContractName(String orderContractName) {
        this.orderContractName = orderContractName;
    }


    public String getOrderContractImage() {
        return orderContractImage;
    }

    public void setOrderContractImage(String orderContractImage) {
        this.orderContractImage = orderContractImage;
    }


    public String getOrderContractNo() {
        return orderContractNo;
    }

    public void setOrderContractNo(String orderContractNo) {
        this.orderContractNo = orderContractNo;
    }


    public Date getOrderContractDate() {
        return orderContractDate;
    }

    public void setOrderContractDate(Date orderContractDate) {
        this.orderContractDate = orderContractDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
