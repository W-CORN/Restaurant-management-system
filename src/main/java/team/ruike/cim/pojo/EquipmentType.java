package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 *设备状态
 * @author 张振国
 * @version 1.0
 */
public class EquipmentType implements Serializable {

    private static final long serialVersionUID = -8738298441032302623L;
    /**
     * 设备状态id
     */
    private Integer equipmentTypeId;
    /**
     * 名称
     */
    private String equipmentTypeName;
    /**
     * 删除状态
     */
    private Integer status;


    public Integer getEquipmentTypeId() {
        return equipmentTypeId;
    }

    public void setEquipmentTypeId(Integer equipmentTypeId) {
        this.equipmentTypeId = equipmentTypeId;
    }


    public String getEquipmentTypeName() {
        return equipmentTypeName;
    }

    public void setEquipmentTypeName(String equipmentTypeName) {
        this.equipmentTypeName = equipmentTypeName;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
