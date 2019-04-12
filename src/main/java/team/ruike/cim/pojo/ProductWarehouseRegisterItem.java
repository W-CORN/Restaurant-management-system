package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 成品库入库登记记录项类
 *
 * @author 王傲祥
 * @version 1.0
 */
public class ProductWarehouseRegisterItem implements Serializable {

    private static final long serialVersionUID = -6715749602097496720L;
    /**
     * 成品库入库登记记录项ID
     */
    private Integer productWarehouseRegisterItemId;
    /**
     * 菜品
     */
    private Menu menu;
    /**
     * 成品货架
     */
    private ProductGoodsShelve productGoodsShelve;
    /**
     * 入库数量
     */
    private Integer menuNumber;
    /**
     * 成品入库记录
     */
    //private Integer productWarehouseRegisterId;
    private ProductWarehouseRegister productWarehouseRegister;
    /**
     * 删除状态
     */
    private Integer status;

    public Integer getProductWarehouseRegisterItemId() {
        return productWarehouseRegisterItemId;
    }

    public void setProductWarehouseRegisterItemId(Integer productWarehouseRegisterItemId) {
        this.productWarehouseRegisterItemId = productWarehouseRegisterItemId;
    }

    public Integer getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(Integer menuNumber) {
        this.menuNumber = menuNumber;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ProductGoodsShelve getProductGoodsShelve() {
        return productGoodsShelve;
    }

    public void setProductGoodsShelve(ProductGoodsShelve productGoodsShelve) {
        this.productGoodsShelve = productGoodsShelve;
    }

    /*public Integer getProductWarehouseRegisterId() {
        return productWarehouseRegisterId;
    }

    public void setProductWarehouseRegisterId(Integer productWarehouseRegisterId) {
        this.productWarehouseRegisterId = productWarehouseRegisterId;
    }*/

    public ProductWarehouseRegister getProductWarehouseRegister() {
        return productWarehouseRegister;
    }

    public void setProductWarehouseRegister(ProductWarehouseRegister productWarehouseRegister) {
        this.productWarehouseRegister = productWarehouseRegister;
    }
}
