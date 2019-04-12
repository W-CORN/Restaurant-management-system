package team.ruike.cim.pojo;


import java.io.Serializable;
/**
 * 生产品控标准类
 * @author 王傲祥
 * @version 1.0
 */
public class ProductionStandard implements Serializable {

  private static final long serialVersionUID = -5472308480089470038L;
  /**
   * 生产品控标准ID
   */
  private Integer productionStandardId;
  /**
   * 生产批次
   */
  private String productionBatch;
  /**
   * 标准a类型
   */
  private Integer standardAType;
  /**
   * 标准a名称
   */
  private String standardAName;
  /**
   * 标准b类型
   */
  private Integer standardBType;
  /**
   * 标准b名称
   */
  private String standardBName;
  /**
   *  标准c类型
   */
  private Integer standardCType;
  /**
   *  标准c名称
   */
  private String standardCName;
  /**
   * 删除状态
   */
  private String remarks;
  /**
   * 备注
   */
  private Integer status;


  public Integer getProductionStandardId() {
    return productionStandardId;
  }

  public void setProductionStandardId(Integer productionStandardId) {
    this.productionStandardId = productionStandardId;
  }


  public String getProductionBatch() {
    return productionBatch;
  }

  public void setProductionBatch(String productionBatch) {
    this.productionBatch = productionBatch;
  }


  public Integer getStandardAType() {
    return standardAType;
  }

  public void setStandardAType(Integer standardAType) {
    this.standardAType = standardAType;
  }


  public String getStandardAName() {
    return standardAName;
  }

  public void setStandardAName(String standardAName) {
    this.standardAName = standardAName;
  }


  public Integer getStandardBType() {
    return standardBType;
  }

  public void setStandardBType(Integer standardBType) {
    this.standardBType = standardBType;
  }


  public String getStandardBName() {
    return standardBName;
  }

  public void setStandardBName(String standardBName) {
    this.standardBName = standardBName;
  }


  public Integer getStandardCType() {
    return standardCType;
  }

  public void setStandardCType(Integer standardCType) {
    this.standardCType = standardCType;
  }


  public String getStandardCName() {
    return standardCName;
  }

  public void setStandardCName(String standardCName) {
    this.standardCName = standardCName;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}
