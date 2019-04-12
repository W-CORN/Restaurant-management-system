package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 * 货架表
 *
 * @author 甄立
 * @version 1.0
 */
public class GoodsShelve implements Serializable {

    private static final long serialVersionUID = 5857865848760569834L;
    /**
     * 货架表id
     */
    private Integer goodsShelveId;
    /**
     * 货架编号
     */
    private String goodsShelveNo;
    /**
     * 当前所放物料
     */
    private Materiel materiel;
    /**
     * 当前数量
     */
    private Integer materielNumber;
    /**
     * 到期时间
     */
    private Date materielShelfLifeEndDate;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 所属仓库区域
     */
    private WarehouseRegion warehouseRegion;


    public Integer getGoodsShelveId() {
        return goodsShelveId;
    }

    public void setGoodsShelveId(Integer goodsShelveId) {
        this.goodsShelveId = goodsShelveId;
    }


    public String getGoodsShelveNo() {
        return goodsShelveNo;
    }

    public void setGoodsShelveNo(String goodsShelveNo) {
        this.goodsShelveNo = goodsShelveNo;
    }


    public Integer getMaterielNumber() {
        return materielNumber;
    }

    public void setMaterielNumber(Integer materielNumber) {
        this.materielNumber = materielNumber;
    }


    public Date getMaterielShelfLifeEndDate() {
        return materielShelfLifeEndDate;
    }

    public void setMaterielShelfLifeEndDate(Date materielShelfLifeEndDate) {
        this.materielShelfLifeEndDate = materielShelfLifeEndDate;
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

    public WarehouseRegion getWarehouseRegion() {
        return warehouseRegion;
    }

    public void setWarehouseRegion(WarehouseRegion warehouseRegion) {
        this.warehouseRegion = warehouseRegion;
    }
}
