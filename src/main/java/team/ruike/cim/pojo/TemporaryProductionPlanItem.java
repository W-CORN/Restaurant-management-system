package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 临时订单生产计划订单项
 *
 * @author 孙天奇
 * @version 1.0
 */
public class TemporaryProductionPlanItem implements Serializable {

    private static final long serialVersionUID = -3478873343512159563L;
    /**
     * 临时订单生产计划订单项id
     */
    private Integer temporaryProductionPlanItemId;
    /**
     * 菜品id外键
     */
    private Menu menu;
    /**
     * 菜品数量
     */
    private Integer menuNumber;
    /**
     * 临时生产计划id外键
     */
    private Integer temporaryProductionPlanId;
    /**
     * 状态
     */
    private Integer status;


    public Integer getTemporaryProductionPlanItemId() {
        return temporaryProductionPlanItemId;
    }

    public void setTemporaryProductionPlanItemId(Integer temporaryProductionPlanItemId) {
        this.temporaryProductionPlanItemId = temporaryProductionPlanItemId;
    }

    public Integer getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(Integer menuNumber) {
        this.menuNumber = menuNumber;
    }


    public Integer getTemporaryProductionPlanId() {
        return temporaryProductionPlanId;
    }

    public void setTemporaryProductionPlanId(Integer temporaryProductionPlanId) {
        this.temporaryProductionPlanId = temporaryProductionPlanId;
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
}
