package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 成品库入库登记类
 *
 * @author 王傲祥
 * @version 1.0
 */
public class ProductWarehouseRegister implements Serializable {
    private static final long serialVersionUID = -9125912786565069677L;
    /**
     * 成品库入库登记ID
     */
    private Integer productWarehouseRegisterId;
    /**
     * 生产批次
     */
    private String productionBatch;
    /**
     * 入库时间
     */
    private Date productWarehouseRegisterDate;
    /**
     * 入库人用户表
     */
    private User user;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 成品库入库登记记录项集合
     */
    private List<ProductWarehouseRegisterItem> productWarehouseRegisterItemList;


    public Integer getProductWarehouseRegisterId() {
        return productWarehouseRegisterId;
    }

    public void setProductWarehouseRegisterId(Integer productWarehouseRegisterId) {
        this.productWarehouseRegisterId = productWarehouseRegisterId;
    }


    public String getProductionBatch() {
        return productionBatch;
    }

    public void setProductionBatch(String productionBatch) {
        this.productionBatch = productionBatch;
    }


    public Date getProductWarehouseRegisterDate() {
        return productWarehouseRegisterDate;
    }

    public void setProductWarehouseRegisterDate(Date productWarehouseRegisterDate) {
        this.productWarehouseRegisterDate = productWarehouseRegisterDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ProductWarehouseRegisterItem> getProductWarehouseRegisterItemList() {
        return productWarehouseRegisterItemList;
    }

    public void setProductWarehouseRegisterItemList(List<ProductWarehouseRegisterItem> productWarehouseRegisterItemList) {
        this.productWarehouseRegisterItemList = productWarehouseRegisterItemList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
