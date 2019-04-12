package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 采购项类
 *
 * @author 王傲祥
 * @version 1.0
 */
public class PurchaseItem implements Serializable {

    private static final long serialVersionUID = 5070534332384313106L;
    /**
     * 采购项ID
     */
    private Integer purchaseItemId;
    /**
     * 物料
     */
    private Materiel materiel;
    /**
     * 数量
     */
    private Integer materielNumber;
    /**
     * 采购单价
     */
    private Double unitPrice;
    /**
     * 供应商
     */
    private Supplier supplier;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 采购表ID
     */
    private Integer purchaseId;


    public Integer getPurchaseItemId() {
        return purchaseItemId;
    }

    public void setPurchaseItemId(Integer purchaseItemId) {
        this.purchaseItemId = purchaseItemId;
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


    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
