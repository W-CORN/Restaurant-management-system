package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 * 设备异常报告
 * @author 张振国
 * @version 1.0
 */
public class EquipmentReport implements Serializable {

    private static final long serialVersionUID = -1819529800130114106L;
    /**
     * 设备异常报告id
     */
    private Integer equipmentReportId;
    /**
     * 停用原因
     */
    private String equipmentReportReason;
    /**
     * 维修计划
     */
    private String maintenancePlan;
    /**
     * 预计恢复时间
     */
    private Date endDate;
    /**
     * 登记人
     */
    private User user;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 所属设备
     */
    private Equipment equipment;


    public Integer getEquipmentReportId() {
        return equipmentReportId;
    }

    public void setEquipmentReportId(Integer equipmentReportId) {
        this.equipmentReportId = equipmentReportId;
    }


    public String getEquipmentReportReason() {
        return equipmentReportReason;
    }

    public void setEquipmentReportReason(String equipmentReportReason) {
        this.equipmentReportReason = equipmentReportReason;
    }


    public String getMaintenancePlan() {
        return maintenancePlan;
    }

    public void setMaintenancePlan(String maintenancePlan) {
        this.maintenancePlan = maintenancePlan;
    }


    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
