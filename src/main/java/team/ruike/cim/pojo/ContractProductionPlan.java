package team.ruike.cim.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *合同订单生产计划
 * @author 张振国
 * @version 1.0
 */
public class ContractProductionPlan implements Serializable {
    private static final long serialVersionUID = -8749159766478095970L;
    /**
     * 合同订单生产计划id
     */
    private Integer contractProductionPlanId;
    /**
     * 合同订单类
     */
    private ContractOrder contractOrder;
    /**
     * 生产批次
     */
    private String productionBatch;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    /**
     * 合同生产计划项集合
     */
    private List<ContractProductionPlanItem> contractProductionPlanItems;

    public List<ContractProductionPlanItem> getContractProductionPlanItems() {
        return contractProductionPlanItems;
    }

    public void setContractProductionPlanItems(List<ContractProductionPlanItem> contractProductionPlanItems) {
        this.contractProductionPlanItems = contractProductionPlanItems;
    }

    public Integer getContractProductionPlanId() {
        return contractProductionPlanId;
    }

    public void setContractProductionPlanId(Integer contractProductionPlanId) {
        this.contractProductionPlanId = contractProductionPlanId;
    }

    public ContractOrder getContractOrder() {
        return contractOrder;
    }

    public void setContractOrder(ContractOrder contractOrder) {
        this.contractOrder = contractOrder;
    }

    public String getProductionBatch() {
        return productionBatch;
    }

    public void setProductionBatch(String productionBatch) {
        this.productionBatch = productionBatch;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
