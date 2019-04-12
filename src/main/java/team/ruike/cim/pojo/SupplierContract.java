package team.ruike.cim.pojo;


import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 供应商合同表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class SupplierContract implements Serializable {

    private static final long serialVersionUID = -3915708383686678545L;
    /**
     * 供应商合同表id
     */
    private Integer supplierContractId;
    /**
     * 合同名称
     */
    private String supplierContractName;
    /**
     * 签订时间
     */

    @JSONField(format="yyyy-MM-dd")
    private Date supplierContractDate;
    /**
     * 合同图片路径
     */
    private String supplierContractImage;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 供应商外键
     */
    private Supplier supplier;


    public Integer getSupplierContractId() {
        return supplierContractId;
    }

    public void setSupplierContractId(Integer supplierContractId) {
        this.supplierContractId = supplierContractId;
    }


    public String getSupplierContractName() {
        return supplierContractName;
    }

    public void setSupplierContractName(String supplierContractName) {
        this.supplierContractName = supplierContractName;
    }


    public Date getSupplierContractDate() {
        return supplierContractDate;
    }

    public void setSupplierContractDate(Date supplierContractDate) {
        this.supplierContractDate = supplierContractDate;
    }


    public String getSupplierContractImage() {
        return supplierContractImage;
    }

    public void setSupplierContractImage(String supplierContractImage) {
        this.supplierContractImage = supplierContractImage;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
