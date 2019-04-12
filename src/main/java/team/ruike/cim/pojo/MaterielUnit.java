package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 单位
 *
 * @author 甄立
 * @version 1.0
 */
public class MaterielUnit implements Serializable {

    private static final long serialVersionUID = -5578289551297900321L;
    /**
     * 单位id
     */
    private Integer materielUnitId;
    /**
     * 单位名称
     */
    private String materielUnitName;
    /**
     * 删除状态
     */
    private Integer status;


    public Integer getMaterielUnitId() {
        return materielUnitId;
    }

    public void setMaterielUnitId(Integer materielUnitId) {
        this.materielUnitId = materielUnitId;
    }


    public String getMaterielUnitName() {
        return materielUnitName;
    }

    public void setMaterielUnitName(String materielUnitName) {
        this.materielUnitName = materielUnitName;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
