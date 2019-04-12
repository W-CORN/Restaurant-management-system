package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.List;

/**
 *成品仓库区域表类
 * @author 王傲祥
 * @version 1.0
 */
public class ProductWarehouseRegion implements Serializable {

  private static final long serialVersionUID = -7504917268504276428L;
  /**
   * 成品仓库区域表ID
   */
  private Integer productWarehouseRegionId;
  /**
   * 区域编号
   */
  private String productWarehouseRegionNo;
  /**
   * 菜品类型
   */
  private MenuType menuType;
  /**
   * 备注
   */
  private String remarks;
  /**
   * 删除状态
   */
  private Integer status;
  /**
   * 成品仓库
   */
  private ProductWarehouse productWarehouse;
  /**
   * 成品仓库货架类集合
   */
  private List<ProductGoodsShelve> productGoodsShelveList;


  public Integer getProductWarehouseRegionId() {
    return productWarehouseRegionId;
  }

  public void setProductWarehouseRegionId(Integer productWarehouseRegionId) {
    this.productWarehouseRegionId = productWarehouseRegionId;
  }


  public String getProductWarehouseRegionNo() {
    return productWarehouseRegionNo;
  }

  public void setProductWarehouseRegionNo(String productWarehouseRegionNo) {
    this.productWarehouseRegionNo = productWarehouseRegionNo;
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

  public MenuType getMenuType() {
    return menuType;
  }

  public void setMenuType(MenuType menuType) {
    this.menuType = menuType;
  }

  public ProductWarehouse getProductWarehouse() {
    return productWarehouse;
  }

  public void setProductWarehouse(ProductWarehouse productWarehouse) {
    this.productWarehouse = productWarehouse;
  }

  public List<ProductGoodsShelve> getProductGoodsShelveList() {
    return productGoodsShelveList;
  }

  public void setProductGoodsShelveList(List<ProductGoodsShelve> productGoodsShelveList) {
    this.productGoodsShelveList = productGoodsShelveList;
  }
}
