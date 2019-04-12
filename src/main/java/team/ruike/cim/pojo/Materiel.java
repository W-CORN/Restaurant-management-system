package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 物料表
 *
 * @author 甄立
 * @version 1.0
 */
public class Materiel implements Serializable {
    private static final long serialVersionUID = -4385404318257726019L;
    /**
     * 物料id
     */
    private Integer materielId;
    /**
     * 物料名称
     */
    private String materielName;
    /**
     * 类别二级分类
     */
    private MaterielTypeLevelB materielTypeLevelB;
    /**
     * 单位
     */
    private MaterielUnit materielUnit;
    /**
     * 出成率(0-1)
     */
    private Double materielYield;
    /**
     * 保质期
     */
    private Integer materielShelfLife;
    /**
     * 最低库存预警
     */
    private Integer materielMinWarning;
    /**
     * 备注
     */
    private String materielRemarks;
    /**
     * 删除状态
     */
    private Integer status;


    public Integer getMaterielId() {
        return materielId;
    }

    public void setMaterielId(Integer materielId) {
        this.materielId = materielId;
    }


    public String getMaterielName() {
        return materielName;
    }

    public void setMaterielName(String materielName) {
        this.materielName = materielName;
    }

    public MaterielTypeLevelB getMaterielTypeLevelB() {
        return materielTypeLevelB;
    }

    public void setMaterielTypeLevelB(MaterielTypeLevelB materielTypeLevelB) {
        this.materielTypeLevelB = materielTypeLevelB;
    }

    public MaterielUnit getMaterielUnit() {
        return materielUnit;
    }

    public void setMaterielUnit(MaterielUnit materielUnit) {
        this.materielUnit = materielUnit;
    }

    public Double getMaterielYield() {
        return materielYield;
    }

    public void setMaterielYield(Double materielYield) {
        this.materielYield = materielYield;
    }


    public Integer getMaterielShelfLife() {
        return materielShelfLife;
    }

    public void setMaterielShelfLife(Integer materielShelfLife) {
        this.materielShelfLife = materielShelfLife;
    }


    public Integer getMaterielMinWarning() {
        return materielMinWarning;
    }

    public void setMaterielMinWarning(Integer materielMinWarning) {
        this.materielMinWarning = materielMinWarning;
    }


    public String getMaterielRemarks() {
        return materielRemarks;
    }

    public void setMaterielRemarks(String materielRemarks) {
        this.materielRemarks = materielRemarks;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
