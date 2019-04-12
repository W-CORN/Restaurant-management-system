package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.List;

/**
 * @author 王傲祥
 * 阶段采购计划类
 */
public class StagePurchasingPlan implements Serializable {

    private static final long serialVersionUID = 617372739170617783L;
    /**
     * 阶段采购计划ID
     */
    private Integer stagePurchasingPlanId;
    /**
     * 周期(周)
     */
    private Integer stagePurchasingPlanCycle;
    /**
     * 备注
     */
    private String stagePurchasingPlanRemarks;
    /**
     * 制定人
     */
    private User user;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 阶段采购计划项集合
     */
    private List<StagePurchasingPlanTerm> stagePurchasingPlanTermList;

    public Integer getStagePurchasingPlanId() {
        return stagePurchasingPlanId;
    }

    public void setStagePurchasingPlanId(Integer stagePurchasingPlanId) {
        this.stagePurchasingPlanId = stagePurchasingPlanId;
    }


    public Integer getStagePurchasingPlanCycle() {
        return stagePurchasingPlanCycle;
    }

    public void setStagePurchasingPlanCycle(Integer stagePurchasingPlanCycle) {
        this.stagePurchasingPlanCycle = stagePurchasingPlanCycle;
    }


    public String getStagePurchasingPlanRemarks() {
        return stagePurchasingPlanRemarks;
    }

    public void setStagePurchasingPlanRemarks(String stagePurchasingPlanRemarks) {
        this.stagePurchasingPlanRemarks = stagePurchasingPlanRemarks;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<StagePurchasingPlanTerm> getStagePurchasingPlanTermList() {
        return stagePurchasingPlanTermList;
    }

    public void setStagePurchasingPlanTermList(List<StagePurchasingPlanTerm> stagePurchasingPlanTermList) {
        this.stagePurchasingPlanTermList = stagePurchasingPlanTermList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
