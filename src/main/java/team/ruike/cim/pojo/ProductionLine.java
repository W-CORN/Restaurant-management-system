package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 生产线类
 * @author 王傲祥
 * @version 1.0
 */
public class ProductionLine implements Serializable {

  private static final long serialVersionUID = -4399658117392350475L;
  /**
   * 生产ID
   */
  private Integer productionLineId;
  /**
   *生产线编号
   */
  private Integer productionLineNo;
  /**
   * 生产线状态
   */
  private Integer productionLineState;
  /**
   * 生产线备注
   */
  private String remarks;
  /**
   * 删除状态
   */
  private Integer status;


  public Integer getProductionLineId() {
    return productionLineId;
  }

  public void setProductionLineId(Integer productionLineId) {
    this.productionLineId = productionLineId;
  }


  public Integer getProductionLineNo() {
    return productionLineNo;
  }

  public void setProductionLineNo(Integer productionLineNo) {
    this.productionLineNo = productionLineNo;
  }


  public Integer getProductionLineState() {
    return productionLineState;
  }

  public void setProductionLineState(Integer productionLineState) {
    this.productionLineState = productionLineState;
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
