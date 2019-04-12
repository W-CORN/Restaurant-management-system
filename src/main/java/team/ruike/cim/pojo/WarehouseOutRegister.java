package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 出库登记表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class WarehouseOutRegister implements Serializable {

    private static final long serialVersionUID = -326486441366423505L;
    /**
     * 出库登记表id
     */
    private Integer warehouseOutRegisterId;
    /**
     * 出库时间
     */
    private Date warehouseOutRegisterEndDate;
    /**
     * 用户表外键领料人
     */
    private User user;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 出库领料项集合
     */
    private List<WarehouseOutRegisterItem> warehouseOutRegisterItemList;

    public Integer getWarehouseOutRegisterId() {
        return warehouseOutRegisterId;
    }

    public void setWarehouseOutRegisterId(Integer warehouseOutRegisterId) {
        this.warehouseOutRegisterId = warehouseOutRegisterId;
    }


    public Date getWarehouseOutRegisterEndDate() {
        return warehouseOutRegisterEndDate;
    }

    public void setWarehouseOutRegisterEndDate(Date warehouseOutRegisterEndDate) {
        this.warehouseOutRegisterEndDate = warehouseOutRegisterEndDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<WarehouseOutRegisterItem> getWarehouseOutRegisterItemList() {
        return warehouseOutRegisterItemList;
    }

    public void setWarehouseOutRegisterItemList(List<WarehouseOutRegisterItem> warehouseOutRegisterItemList) {
        this.warehouseOutRegisterItemList = warehouseOutRegisterItemList;
    }
}
