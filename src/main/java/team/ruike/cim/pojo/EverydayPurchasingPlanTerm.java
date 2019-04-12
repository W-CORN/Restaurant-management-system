package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 每日采购计划项
 *
 * @author 甄立
 * @version 1.0
 */
public class EverydayPurchasingPlanTerm implements Serializable {

    private static final long serialVersionUID = -4849845624266046037L;
    /**
     * 每日采购计划项id
     */
    private Integer everydayPurchasingPlanTermId;
    /**
     * 物料id外键
     */
    private Materiel materiel;
    /**
     * 数量
     */
    private Integer materielNumber;
    /**
     * 预计采购单价
     */
    private Double unitPrice;
    /**
     * 价格允许浮动范围
     */
    private Double priceFloat;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 所属计划,计划表id
     */
    private Integer everydayPurchasingPlanId;


    public Integer getEverydayPurchasingPlanTermId() {
        return everydayPurchasingPlanTermId;
    }

    public void setEverydayPurchasingPlanTermId(Integer everydayPurchasingPlanTermId) {
        this.everydayPurchasingPlanTermId = everydayPurchasingPlanTermId;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Integer getMaterielNumber() {
        return materielNumber;
    }

    public void setMaterielNumber(Integer materielNumber) {
        this.materielNumber = materielNumber;
    }


    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public Double getPriceFloat() {
        return priceFloat;
    }

    public void setPriceFloat(Double priceFloat) {
        this.priceFloat = priceFloat;
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


    public Integer getEverydayPurchasingPlanId() {
        return everydayPurchasingPlanId;
    }

    public void setEverydayPurchasingPlanId(Integer everydayPurchasingPlanId) {
        this.everydayPurchasingPlanId = everydayPurchasingPlanId;
    }

}
