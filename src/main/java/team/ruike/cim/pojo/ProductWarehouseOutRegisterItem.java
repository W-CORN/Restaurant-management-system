package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 成品库出库登记表项类
 *
 * @author 王傲祥
 * @version 1.0
 */
public class ProductWarehouseOutRegisterItem implements Serializable {

    private static final long serialVersionUID = -6274426992693661592L;
    /**
     * 成品库出库登记表项ID
     */
    private Integer productWarehouseOutRegisterItemId;
    /**
     * 菜品外键
     */
    private Menu menu;
    /**
     * 成品货架
     */
    private ProductGoodsShelve productGoodsShelve;
    /**
     * 出库数量
     */
    private Integer menuNumber;
    /**
     * 成品出口登记表外键
     */
    private ProductWarehouseOutRegister productWarehouseOutRegister;
    /**
     * 删除状态
     */
    private Integer status;

    public Integer getProductWarehouseOutRegisterItemId() {
        return productWarehouseOutRegisterItemId;
    }

    public void setProductWarehouseOutRegisterItemId(Integer productWarehouseOutRegisterItemId) {
        this.productWarehouseOutRegisterItemId = productWarehouseOutRegisterItemId;
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

    public Integer getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(Integer menuNumber) {
        this.menuNumber = menuNumber;
    }

    public ProductWarehouseOutRegister getProductWarehouseOutRegister() {
        return productWarehouseOutRegister;
    }

    public void setProductWarehouseOutRegister(ProductWarehouseOutRegister productWarehouseOutRegister) {
        this.productWarehouseOutRegister = productWarehouseOutRegister;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
