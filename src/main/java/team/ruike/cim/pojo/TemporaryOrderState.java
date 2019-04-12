package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 临时订单状态表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class TemporaryOrderState implements Serializable {
    private static final long serialVersionUID = -358147864562847230L;
    /**
     * 临时订单状态表id
     */
    private Integer temporaryOrderStateId;
    /**
     * 状态名
     */
    private String temporaryOrderStateName;
    /**
     * 删除状态
     */
    private Integer status;


    public Integer getTemporaryOrderStateId() {
        return temporaryOrderStateId;
    }

    public void setTemporaryOrderStateId(Integer temporaryOrderStateId) {
        this.temporaryOrderStateId = temporaryOrderStateId;
    }

    public String getTemporaryOrderStateName() {
        return temporaryOrderStateName;
    }

    public void setTemporaryOrderStateName(String temporaryOrderStateName) {
        this.temporaryOrderStateName = temporaryOrderStateName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
