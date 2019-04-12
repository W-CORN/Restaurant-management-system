package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.List;

/**
 * 仓库表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 3925245141136426037L;
    /**
     * 仓库表id
     */
    private Integer warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 仓库管理员用户表外键
     */
    private User user;
    /**
     * 仓库所拥有的区域集合
     */
    private List<WarehouseRegion> warehouseRegionList;


    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }


    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
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


    public List<WarehouseRegion> getWarehouseRegionList() {
        return warehouseRegionList;
    }

    public void setWarehouseRegionList(List<WarehouseRegion> warehouseRegionList) {
        this.warehouseRegionList = warehouseRegionList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
