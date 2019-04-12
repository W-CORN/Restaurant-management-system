package team.ruike.cim.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 合同订单类
 *
 * @author 张振国
 * @version 1.0
 */
public class ContractOrder implements Serializable {

    private static final long serialVersionUID = 7490050891725847244L;
    /**
     * 合同订单id
     */
    private Integer contractOrderId;
    /**
     * 合同订单编号(自动生成)
     */
    private String contractOrderNo;
    /**
     * 合同订单交付时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date contractOrderEndDate;
    /**
     * 合同订单交付状态(0:未交付,1:已交付)
     */
    private Integer contractOrderState;
    /**
     * 合同订单下单时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date contractOrderStartDate;
    /**
     * 合同订单所属合同
     */
    private OrderContract orderContract;
    /**
     * 添加次订单的用户id
     */
    private User user;
    /**
     * 合同订单备注
     */
    private String contractOrderRemarks;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 合同订单项集合
     */
    private List<ContractOrderTerm> contractOrderTerms;

    public List<ContractOrderTerm> getContractOrderTerms() {
        return contractOrderTerms;
    }

    public void setContractOrderTerms(List<ContractOrderTerm> contractOrderTerms) {
        this.contractOrderTerms = contractOrderTerms;
    }

    public Integer getContractOrderId() {
        return contractOrderId;
    }

    public void setContractOrderId(Integer contractOrderId) {
        this.contractOrderId = contractOrderId;
    }


    public String getContractOrderNo() {
        return contractOrderNo;
    }

    public void setContractOrderNo(String contractOrderNo) {
        this.contractOrderNo = contractOrderNo;
    }


    public Date getContractOrderEndDate() {
        return contractOrderEndDate;
    }

    public void setContractOrderEndDate(Date contractOrderEndDate) {
        this.contractOrderEndDate = contractOrderEndDate;
    }


    public Integer getContractOrderState() {
        return contractOrderState;
    }

    public void setContractOrderState(Integer contractOrderState) {
        this.contractOrderState = contractOrderState;
    }


    public Date getContractOrderStartDate() {
        return contractOrderStartDate;
    }

    public void setContractOrderStartDate(Date contractOrderStartDate) {
        this.contractOrderStartDate = contractOrderStartDate;
    }

    public OrderContract getOrderContract() {
        return orderContract;
    }

    public void setOrderContract(OrderContract orderContract) {
        this.orderContract = orderContract;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContractOrderRemarks() {
        return contractOrderRemarks;
    }

    public void setContractOrderRemarks(String contractOrderRemarks) {
        this.contractOrderRemarks = contractOrderRemarks;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
