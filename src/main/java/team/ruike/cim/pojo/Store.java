package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 门店用户表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class Store implements Serializable {

    private static final long serialVersionUID = -7009722609581777683L;
    /**
     * 门店用户表id
     */
    private Integer storeId;
    /**
     * 用户/门店名称
     */
    private String storeName;
    /**
     * 门店/用户类别(1合同用户2散户)
     */
    private Integer storeType;
    /**
     * 地址
     */
    private String storeAddress;
    /**
     * 电话
     */
    private String storePhone;
    /**
     * 下单项数量
     */
    private Integer storeOrderNumber;
    /**
     * 门店编号
     */
    private String storeNo;
    /**
     * 密码
     */
    private String password;
    /**
     * 状态
     */
    private Integer status;


    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }


    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }


    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }


    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }


    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }


    public Integer getStoreOrderNumber() {
        return storeOrderNumber;
    }

    public void setStoreOrderNumber(Integer storeOrderNumber) {
        this.storeOrderNumber = storeOrderNumber;
    }


    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
