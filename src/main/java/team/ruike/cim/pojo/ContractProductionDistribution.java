package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 * 合同订单生产任务分配
 *
 * @author 张振国
 * @version 1.0
 */
public class ContractProductionDistribution implements Serializable {
    private static final long serialVersionUID = 4224470599322559142L;
    /**
     * 合同订单生产任务分配id
     */
    private Integer contractProductionDistributionId;
    /**
     * 合同计划订单项类
     */
    private ContractProductionPlanItem contractProductionPlanItem;
    /**
     * 工序实体类
     */
    private Working working;
    /**
     * 用户类
     */
    private User user;
    /**
     * 预计生产开始时间
     */
    private Date startDate;
    /**
     * 预计结束时间
     */
    private Date endDate;
    /**
     * 配置人数
     */
    private Integer peopleNumber;
    /**
     * 生产线id外键
     */
    private ProductionLine productionLine;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 进入下一工序数量
     */
    private Integer nextWorkingNumber;

    public Integer getContractProductionDistributionId() {
        return contractProductionDistributionId;
    }

    public void setContractProductionDistributionId(Integer contractProductionDistributionId) {
        this.contractProductionDistributionId = contractProductionDistributionId;
    }

    public ContractProductionPlanItem getContractProductionPlanItem() {
        return contractProductionPlanItem;
    }

    public void setContractProductionPlanItem(ContractProductionPlanItem contractProductionPlanItem) {
        this.contractProductionPlanItem = contractProductionPlanItem;
    }

    public Working getWorking() {
        return working;
    }

    public void setWorking(Working working) {
        this.working = working;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public ProductionLine getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(ProductionLine productionLine) {
        this.productionLine = productionLine;
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

    public Integer getNextWorkingNumber() {
        return nextWorkingNumber;
    }

    public void setNextWorkingNumber(Integer nextWorkingNumber) {
        this.nextWorkingNumber = nextWorkingNumber;
    }
}
