package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 物料二级类别
 *
 * @author 甄立
 * @version 1.0
 */
public class MaterielTypeLevelB implements Serializable {

    private static final long serialVersionUID = -3632127145415491654L;
    /**
     * 物料二级类别
     */
    private Integer materielTypeLevelBId;
    /**
     * 名称
     */
    private String materielTypeLevelBName;
    /**
     * 所属一级分类
     */
    private MaterielTypeLevelA materielTypeLevelA;
    /**
     * 状态
     */
    private Integer status;


    public Integer getMaterielTypeLevelBId() {
        return materielTypeLevelBId;
    }

    public void setMaterielTypeLevelBId(Integer materielTypeLevelBId) {
        this.materielTypeLevelBId = materielTypeLevelBId;
    }


    public String getMaterielTypeLevelBName() {
        return materielTypeLevelBName;
    }

    public void setMaterielTypeLevelBName(String materielTypeLevelBName) {
        this.materielTypeLevelBName = materielTypeLevelBName;
    }

    public MaterielTypeLevelA getMaterielTypeLevelA() {
        return materielTypeLevelA;
    }

    public void setMaterielTypeLevelA(MaterielTypeLevelA materielTypeLevelA) {
        this.materielTypeLevelA = materielTypeLevelA;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
