package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *每日采购计划
 * @author 张振国
 * @version 1.0
 */
public class EverydayPurchasingPlan implements Serializable {

    private static final long serialVersionUID = -5022604544780534725L;
    /**
     * id主键自增
     */
    private Integer everydayPurchasingPlanId;
    /**
     * 采购批次
     */
    private String everydayPurchasingPlanNo;
    /**
     * 采购时间
     */
    private Date everydayPurchasingPlanDate;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 每日采购计划项类集合
     */
    private List<EverydayPurchasingPlanTerm> everydayPurchasingPlanTerms;

    public List<EverydayPurchasingPlanTerm> getEverydayPurchasingPlanTerms() {
        return everydayPurchasingPlanTerms;
    }

    public void setEverydayPurchasingPlanTerms(List<EverydayPurchasingPlanTerm> everydayPurchasingPlanTerms) {
        this.everydayPurchasingPlanTerms = everydayPurchasingPlanTerms;
    }

    public Integer getEverydayPurchasingPlanId() {
        return everydayPurchasingPlanId;
    }

    public void setEverydayPurchasingPlanId(Integer everydayPurchasingPlanId) {
        this.everydayPurchasingPlanId = everydayPurchasingPlanId;
    }

    public String getEverydayPurchasingPlanNo() {
        return everydayPurchasingPlanNo;
    }

    public void setEverydayPurchasingPlanNo(String everydayPurchasingPlanNo) {
        this.everydayPurchasingPlanNo = everydayPurchasingPlanNo;
    }

    public Date getEverydayPurchasingPlanDate() {
        return everydayPurchasingPlanDate;
    }

    public void setEverydayPurchasingPlanDate(Date everydayPurchasingPlanDate) {
        this.everydayPurchasingPlanDate = everydayPurchasingPlanDate;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
