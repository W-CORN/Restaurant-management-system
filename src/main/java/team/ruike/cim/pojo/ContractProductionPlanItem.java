package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 *合同订单生产计划订单项
 * @author 张振国
 * @version 1.0
 */
public class ContractProductionPlanItem implements Serializable {

    private static final long serialVersionUID = 2705376220563549480L;
    /**
     * 合同订单生产计划订单项id
     */
    private Integer contractProductionPlanItemId;
    /**
     * 菜品id外键
     */
    private Menu menu;
    /**
     * 菜品数量
     */
    private Integer menuNumber;
    /**
     * 生产计划id外键
     */
    private Integer contractProductionPlanId;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 合同订单项id外键
     */
    private ContractOrderTerm contractOrderTerm;

    public ContractOrderTerm getContractOrderTerm() {
        return contractOrderTerm;
    }

    public void setContractOrderTerm(ContractOrderTerm contractOrderTerm) {
        this.contractOrderTerm = contractOrderTerm;
    }

    public Integer getContractProductionPlanItemId() {
        return contractProductionPlanItemId;
    }

    public void setContractProductionPlanItemId(Integer contractProductionPlanItemId) {
        this.contractProductionPlanItemId = contractProductionPlanItemId;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Integer getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(Integer menuNumber) {
        this.menuNumber = menuNumber;
    }


    public Integer getContractProductionPlanId() {
        return contractProductionPlanId;
    }

    public void setContractProductionPlanId(Integer contractProductionPlanId) {
        this.contractProductionPlanId = contractProductionPlanId;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
