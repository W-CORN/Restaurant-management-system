package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 入库登记表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class WarehouseRegister implements Serializable {

    private static final long serialVersionUID = 3392966639955030964L;
    /**
     * 入库登记表id
     */
    private Integer warehouseRegisterId;
    /**
     * 每日采购计划外键
     */
    private EverydayPurchasingPlan everydayPurchasingPlan;
    /**
     * 入库时间
     */
    private Date warehouseRegisterDate;
    /**
     * 入库人用户表外键
     */
    private User user;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 入库记录项集合
     */
    private List<WarehouseRegisterItem> warehouseRegisterItemList;

    public Integer getWarehouseRegisterId() {
        return warehouseRegisterId;
    }

    public void setWarehouseRegisterId(Integer warehouseRegisterId) {
        this.warehouseRegisterId = warehouseRegisterId;
    }

    public Date getWarehouseRegisterDate() {
        return warehouseRegisterDate;
    }

    public void setWarehouseRegisterDate(Date warehouseRegisterDate) {
        this.warehouseRegisterDate = warehouseRegisterDate;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public EverydayPurchasingPlan getEverydayPurchasingPlan() {
        return everydayPurchasingPlan;
    }

    public void setEverydayPurchasingPlan(EverydayPurchasingPlan everydayPurchasingPlan) {
        this.everydayPurchasingPlan = everydayPurchasingPlan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<WarehouseRegisterItem> getWarehouseRegisterItemList() {
        return warehouseRegisterItemList;
    }

    public void setWarehouseRegisterItemList(List<WarehouseRegisterItem> warehouseRegisterItemList) {
        this.warehouseRegisterItemList = warehouseRegisterItemList;
    }
}
