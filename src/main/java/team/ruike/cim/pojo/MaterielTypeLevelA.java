package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 物料一级类别
 *
 * @author 甄立
 * @version 1.0
 */
public class MaterielTypeLevelA implements Serializable {

    private static final long serialVersionUID = 5345629873510428301L;
    /**
     * 物料一级类别id
     */
    private Integer materielTypeLevelAId;
    /**
     * 名称
     */
    private String materielTypeLevelAName;
    /**
     * 删除状态
     */
    private Integer status;


    public Integer getMaterielTypeLevelAId() {
        return materielTypeLevelAId;
    }

    public void setMaterielTypeLevelAId(Integer materielTypeLevelAId) {
        this.materielTypeLevelAId = materielTypeLevelAId;
    }


    public String getMaterielTypeLevelAName() {
        return materielTypeLevelAName;
    }

    public void setMaterielTypeLevelAName(String materielTypeLevelAName) {
        this.materielTypeLevelAName = materielTypeLevelAName;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
