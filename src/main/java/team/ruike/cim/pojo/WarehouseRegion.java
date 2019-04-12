package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 仓库区域表
 *
 * @author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public class WarehouseRegion implements Serializable {

    private static final long serialVersionUID = -413071175503456395L;
    /**
     * 仓库区域表id
     */
    private Integer warehouseRegionId;
    /**
     * 区域编号
     */
    private String warehouseRegionNo;
    /**
     * 物料二级分类(规定)外键
     */
    private MaterielTypeLevelB materielTypeLevelB;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 状态
     */
    private String status;
    /**
     * 仓库外键
     */
    private Warehouse warehouse;


    public Integer getWarehouseRegionId() {
        return warehouseRegionId;
    }

    public void setWarehouseRegionId(Integer warehouseRegionId) {
        this.warehouseRegionId = warehouseRegionId;
    }


    public String getWarehouseRegionNo() {
        return warehouseRegionNo;
    }

    public void setWarehouseRegionNo(String warehouseRegionNo) {
        this.warehouseRegionNo = warehouseRegionNo;
    }

    public MaterielTypeLevelB getMaterielTypeLevelB() {
        return materielTypeLevelB;
    }

    public void setMaterielTypeLevelB(MaterielTypeLevelB materielTypeLevelB) {
        this.materielTypeLevelB = materielTypeLevelB;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
