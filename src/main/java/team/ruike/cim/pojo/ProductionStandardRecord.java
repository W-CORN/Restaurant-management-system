package team.ruike.cim.pojo;


import java.io.Serializable;
/**
 * 生产品控评估记录类
 * @author 王傲祥
 * @version 1.0
 */
public class ProductionStandardRecord implements Serializable {

    private static final long serialVersionUID = 8878793559446967394L;
    /**
     * 生产品控评估记录ID
     */
    private Integer productionStandardRecordId;
    /**
     * 标准类
     */
    private ProductionStandard productionStandard;
    /**
     *   标准a评分
     */
    private Integer standardAScore;
    /**
     *标准b评分
     */
    private Integer standardBScore;
    /**
     *标准c评分
     */
    private Integer standardCScore;
    /**
     *结论
     */
    private String conclusion;
    /**
     *删除状态
     */
    private Integer status;

    public Integer getProductionStandardRecordId() {
        return productionStandardRecordId;
    }

    public void setProductionStandardRecordId(Integer productionStandardRecordId) {
        this.productionStandardRecordId = productionStandardRecordId;
    }

    public ProductionStandard getProductionStandard() {
        return productionStandard;
    }

    public void setProductionStandard(ProductionStandard productionStandard) {
        this.productionStandard = productionStandard;
    }

    public Integer getStandardAScore() {
        return standardAScore;
    }

    public void setStandardAScore(Integer standardAScore) {
        this.standardAScore = standardAScore;
    }

    public Integer getStandardBScore() {
        return standardBScore;
    }

    public void setStandardBScore(Integer standardBScore) {
        this.standardBScore = standardBScore;
    }

    public Integer getStandardCScore() {
        return standardCScore;
    }

    public void setStandardCScore(Integer standardCScore) {
        this.standardCScore = standardCScore;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
