package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 临时订单项
 *
 * @author 孙天奇
 * @version 1.0
 */
public class TemporaryOrderTerm implements Serializable {

    private static final long serialVersionUID = 2774828252848847150L;
    /**
     * 临时订单项
     */
    private Integer temporaryOrderTermId;
    /**
     * 菜品外键
     */
    private Menu menu;
    /**
     * 菜品数量
     */
    private Integer menuNumber;
    /**
     * 完成数量
     */
    private Integer completeNumber;
    /**
     * 完成状态(0:未,1:已)
     */
    private Integer temporaryOrderTermState;
    /**
     * 产品批次(自动生成)
     */
    private String productBatch;
    /**
     * 临时订单外键
     */
    private TemporaryOrder temporaryOrder;
    /**
     * 状态
     */
    private Integer status;


    public Integer getTemporaryOrderTermId() {
        return temporaryOrderTermId;
    }

    public void setTemporaryOrderTermId(Integer temporaryOrderTermId) {
        this.temporaryOrderTermId = temporaryOrderTermId;
    }

    public Integer getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(Integer menuNumber) {
        this.menuNumber = menuNumber;
    }


    public Integer getCompleteNumber() {
        return completeNumber;
    }

    public void setCompleteNumber(Integer completeNumber) {
        this.completeNumber = completeNumber;
    }


    public Integer getTemporaryOrderTermState() {
        return temporaryOrderTermState;
    }

    public void setTemporaryOrderTermState(Integer temporaryOrderTermState) {
        this.temporaryOrderTermState = temporaryOrderTermState;
    }


    public String getProductBatch() {
        return productBatch;
    }

    public void setProductBatch(String productBatch) {
        this.productBatch = productBatch;
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

    public TemporaryOrder getTemporaryOrder() {
        return temporaryOrder;
    }

    public void setTemporaryOrder(TemporaryOrder temporaryOrder) {
        this.temporaryOrder = temporaryOrder;
    }
}
