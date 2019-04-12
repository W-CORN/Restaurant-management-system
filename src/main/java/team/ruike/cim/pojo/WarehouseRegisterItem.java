package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 入库登记记录项
 *
 * @author 孙天奇
 * @version 1.0
 */
public class WarehouseRegisterItem implements Serializable {

    private static final long serialVersionUID = -6425395051315653087L;
    /**
     * 入库登记记录项id
     */
    private Integer warehouseRegisterItemId;
    /**
     * 物料外键
     */
    private Materiel materiel;
    /**
     * 货架id
     */
    private GoodsShelve goodsShelve;
    /**
     * 入库数量
     */
    private Integer materielNumber;
    /**
     * 入库记录id外键
     */
    private WarehouseRegister warehouseRegister;
    /**
     * 入库登记记录项状态
     */
    private Integer status;


    public Integer getWarehouseRegisterItemId() {
        return warehouseRegisterItemId;
    }

    public void setWarehouseRegisterItemId(Integer warehouseRegisterItemId) {
        this.warehouseRegisterItemId = warehouseRegisterItemId;
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

    public Integer getMaterielNumber() {
        return materielNumber;
    }

    public void setMaterielNumber(Integer materielNumber) {
        this.materielNumber = materielNumber;
    }

    public WarehouseRegister getWarehouseRegister() {
        return warehouseRegister;
    }

    public void setWarehouseRegister(WarehouseRegister warehouseRegister) {
        this.warehouseRegister = warehouseRegister;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
