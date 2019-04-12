package team.ruike.cim.pojo;


import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 供应商
 *
 * @author 孙天奇
 * @version 1.0
 */
public class Supplier implements Serializable {

    private static final long serialVersionUID = -5528870825436579325L;
    /**
     * 供应商id
     */
    private Integer supplierId;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 编号
     */
    private String supplierNo;
    /**
     * 营业执照路径
     */
    private String supplierImage;
    /**
     * 特许经营许可路径
     */
    private String supplierCharterImage;
    /**
     * 物料二级类型(供货类型)
     */
    private MaterielTypeLevelB materielTypeLevelB;
    /**
     * 地址
     */
    private String supplierAddress;
    /**
     * 联系电话
     */
    private String supplierPhone;
    /**
     * 合作开始时间
     */
    @JSONField(format="yyyy-MM-dd")
    private Date cooperationStartDate;
    /**
     * 删除伪列
     */
    private Integer status;
    /**
     * 备注
     */
    private String supplierRemarks;
    /**
     * 状态
     */
    private Integer supplierState;


    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }


    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }


    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }


    public String getSupplierImage() {
        return supplierImage;
    }

    public void setSupplierImage(String supplierImage) {
        this.supplierImage = supplierImage;
    }


    public String getSupplierCharterImage() {
        return supplierCharterImage;
    }

    public void setSupplierCharterImage(String supplierCharterImage) {
        this.supplierCharterImage = supplierCharterImage;
    }

    public MaterielTypeLevelB getMaterielTypeLevelB() {
        return materielTypeLevelB;
    }

    public void setMaterielTypeLevelB(MaterielTypeLevelB materielTypeLevelB) {
        this.materielTypeLevelB = materielTypeLevelB;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }


    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }


    public Date getCooperationStartDate() {
        return cooperationStartDate;
    }

    public void setCooperationStartDate(Date cooperationStartDate) {
        this.cooperationStartDate = cooperationStartDate;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getSupplierRemarks() {
        return supplierRemarks;
    }

    public void setSupplierRemarks(String supplierRemarks) {
        this.supplierRemarks = supplierRemarks;
    }


    public Integer getSupplierState() {
        return supplierState;
    }

    public void setSupplierState(Integer supplierState) {
        this.supplierState = supplierState;
    }

}
