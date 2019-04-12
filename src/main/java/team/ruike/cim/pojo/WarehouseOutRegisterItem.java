package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 出库登记表项
 *
 * @author 孙天奇
 * @version 1.0
 */
public class WarehouseOutRegisterItem implements Serializable {

    private static final long serialVersionUID = 6782034736748393920L;
    /**
     * 出库登记表项id
     */
    private Integer warehouseOutRegisterItemId;
    /**
     * 物料外键
     */
    private Materiel materiel;
    /**
     * 货架
     */
    private GoodsShelve goodsShelve;
    /**
     * 出库数量
     */
    private Integer materielNumber;
    /**
     * 出口登记表外键
     */
    private WarehouseOutRegister warehouseOutRegister;
    /**
     * 状态
     */
    private Integer status;


    public Integer getMaterielNumber() {
        return materielNumber;
    }

    public void setMaterielNumber(Integer materielNumber) {
        this.materielNumber = materielNumber;
    }

    public Integer getWarehouseOutRegisterItemId() {
        return warehouseOutRegisterItemId;
    }

    public void setWarehouseOutRegisterItemId(Integer warehouseOutRegisterItemId) {
        this.warehouseOutRegisterItemId = warehouseOutRegisterItemId;
    }

    public WarehouseOutRegister getWarehouseOutRegister() {
        return warehouseOutRegister;
    }

    public void setWarehouseOutRegister(WarehouseOutRegister warehouseOutRegister) {
        this.warehouseOutRegister = warehouseOutRegister;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public GoodsShelve getGoodsShelve() {
        return goodsShelve;
    }

    public void setGoodsShelve(GoodsShelve goodsShelve) {
        this.goodsShelve = goodsShelve;
    }
}
