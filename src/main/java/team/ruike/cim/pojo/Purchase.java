package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 采购类
 *
 * @author 王傲祥
 * @version 1.0
 */
public class Purchase implements Serializable {
    private static final long serialVersionUID = -5046439097768407830L;
    /**
     * 采购ID
     */
    private Integer purchaseId;
    /**
     * 每日采购计划
     */
    private EverydayPurchasingPlan everydayPurchasingPlan;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 采购时间
     */
    private Date purchaseDate;
    /**
     * 用户表外键(采购人)
     */
    private User user;
    /**
     * 采购项集合
     */
    private List<PurchaseItem> purchaseItems;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public EverydayPurchasingPlan getEverydayPurchasingPlan() {
        return everydayPurchasingPlan;
    }

    public void setEverydayPurchasingPlan(EverydayPurchasingPlan everydayPurchasingPlan) {
        this.everydayPurchasingPlan = everydayPurchasingPlan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PurchaseItem> getPurchaseItems() {
        return purchaseItems;
    }

    public void setPurchaseItems(List<PurchaseItem> purchaseItems) {
        this.purchaseItems = purchaseItems;
    }
}
