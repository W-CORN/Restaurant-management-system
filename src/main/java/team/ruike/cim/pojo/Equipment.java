package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;


public class Equipment implements Serializable {

    private static final long serialVersionUID = 4233770308844199286L;

    private Integer equipmentId;

    private ProductionLine productionLine;

    private Working working;

    private User user;

    private Date startDate;

    private EquipmentType equipmentType;

    private Integer maintenanceCycle;

    private Integer inspectionCycle;

    private String equipmentName;

    private Integer status;


    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public ProductionLine getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    public Working getWorking() {
        return working;
    }

    public void setWorking(Working working) {
        this.working = working;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Integer getMaintenanceCycle() {
        return maintenanceCycle;
    }

    public void setMaintenanceCycle(Integer maintenanceCycle) {
        this.maintenanceCycle = maintenanceCycle;
    }


    public Integer getInspectionCycle() {
        return inspectionCycle;
    }

    public void setInspectionCycle(Integer inspectionCycle) {
        this.inspectionCycle = inspectionCycle;
    }


    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
