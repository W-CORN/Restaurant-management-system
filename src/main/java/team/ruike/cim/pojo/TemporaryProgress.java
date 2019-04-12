package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 * 临时订单任务进度记录
 *
 * @author 孙天奇
 * @version 1.0
 */
public class TemporaryProgress implements Serializable {

    private static final long serialVersionUID = -7849773436851293569L;
    /**
     * 临时订单任务进度记录id
     */
    private Integer temporaryProgressId;
    /**
     * 临时订单生产任务分配
     */
    private TemporaryProductionDistribution temporaryProductionDistribution;
    /**
     * 备注(必填)
     */
    private String remarks;
    /**
     * 实际生产开始时间
     */
    private Date startDate;
    /**
     * 实际结束时间
     */
    private Date endDate;
    /**
     * 状态
     */
    private Integer status;


    public Integer getTemporaryProgressId() {
        return temporaryProgressId;
    }

    public void setTemporaryProgressId(Integer temporaryProgressId) {
        this.temporaryProgressId = temporaryProgressId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TemporaryProductionDistribution getTemporaryProductionDistribution() {
        return temporaryProductionDistribution;
    }

    public void setTemporaryProductionDistribution(TemporaryProductionDistribution temporaryProductionDistribution) {
        this.temporaryProductionDistribution = temporaryProductionDistribution;
    }
}
