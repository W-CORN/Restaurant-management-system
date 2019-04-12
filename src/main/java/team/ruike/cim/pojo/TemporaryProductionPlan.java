package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 临时订单生产计划表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class TemporaryProductionPlan implements Serializable {

    private static final long serialVersionUID = -8796638088313303084L;
    /**
     * 临时订单生产计划表
     */
    private Integer temporaryProductionPlanId;
    /**
     * 临时订单id外键
     */
    private TemporaryOrder temporaryOrderId;
    /**
     * 生产批次
     */
    private String productionBatch;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 日期
     */
    private Date date;
    /**
     * 临时订单生产计划项集合
     */
    private List<TemporaryProductionPlanItem> temporaryProductionPlanItems;

    public Integer getTemporaryProductionPlanId() {
        return temporaryProductionPlanId;
    }

    public void setTemporaryProductionPlanId(Integer temporaryProductionPlanId) {
        this.temporaryProductionPlanId = temporaryProductionPlanId;
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

    public TemporaryOrder getTemporaryOrderId() {
        return temporaryOrderId;
    }

    public void setTemporaryOrderId(TemporaryOrder temporaryOrderId) {
        this.temporaryOrderId = temporaryOrderId;
    }

    public List<TemporaryProductionPlanItem> getTemporaryProductionPlanItems() {
        return temporaryProductionPlanItems;
    }

    public void setTemporaryProductionPlanItems(List<TemporaryProductionPlanItem> temporaryProductionPlanItems) {
        this.temporaryProductionPlanItems = temporaryProductionPlanItems;
    }
}
