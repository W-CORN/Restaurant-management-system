package team.ruike.cim.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 临时订单
 *
 * @author 孙天奇
 * @version 1.0
 */
public class TemporaryOrder implements Serializable {

    private static final long serialVersionUID = 2570650295657728928L;
    /**
     * 临时订单id
     */
    private Integer temporaryOrderId;
    /**
     * 订单号(自动生成)
     */
    private String temporaryOrderNo;
    /**
     * 交付时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date temporaryOrderEndDate;
    /**
     * 状态外键
     */
    private TemporaryOrderState temporaryOrderState;
    /**
     * 下单时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date temporaryOrderStartDate;
    /**
     * 备注
     */
    private String temporaryOrderRemarks;
    /**
     * 门店用户id外键
     */
    private Integer storeId;
    /**
     * 用户表(确认人)
     */
    private User user;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 临时订单项集合
     */
    private List<TemporaryOrderTerm> temporaryOrderTerms;

    /**
     * 门店对象
     */
    private Store store;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Integer getTemporaryOrderId() {
        return temporaryOrderId;
    }

    public void setTemporaryOrderId(Integer temporaryOrderId) {
        this.temporaryOrderId = temporaryOrderId;
    }


    public String getTemporaryOrderNo() {
        return temporaryOrderNo;
    }

    public void setTemporaryOrderNo(String temporaryOrderNo) {
        this.temporaryOrderNo = temporaryOrderNo;
    }


    public Date getTemporaryOrderEndDate() {
        return temporaryOrderEndDate;
    }

    public void setTemporaryOrderEndDate(Date temporaryOrderEndDate) {
        this.temporaryOrderEndDate = temporaryOrderEndDate;
    }

    public Date getTemporaryOrderStartDate() {
        return temporaryOrderStartDate;
    }

    public void setTemporaryOrderStartDate(Date temporaryOrderStartDate) {
        this.temporaryOrderStartDate = temporaryOrderStartDate;
    }


    public String getTemporaryOrderRemarks() {
        return temporaryOrderRemarks;
    }

    public void setTemporaryOrderRemarks(String temporaryOrderRemarks) {
        this.temporaryOrderRemarks = temporaryOrderRemarks;
    }


    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TemporaryOrderState getTemporaryOrderState() {
        return temporaryOrderState;
    }

    public void setTemporaryOrderState(TemporaryOrderState temporaryOrderState) {
        this.temporaryOrderState = temporaryOrderState;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<TemporaryOrderTerm> getTemporaryOrderTerms() {
        return temporaryOrderTerms;
    }

    public void setTemporaryOrderTerms(List<TemporaryOrderTerm> temporaryOrderTerms) {
        this.temporaryOrderTerms = temporaryOrderTerms;
    }

}
