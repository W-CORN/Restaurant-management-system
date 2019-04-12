package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 * 合同订单任务进度记录
 *
 * @author 张振国
 * @version 1.0
 */
public class ContractProgress implements Serializable {
    private static final long serialVersionUID = -3202788285496916399L;
    /**
     * 合同订单任务进度记录id
     */
    private Integer contractProgressId;
    /**
     * 合同订单生产任务分配id
     */
    private ContractProductionDistribution contractProductionDistribution;
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
     * 删除状态
     */
    private Integer status;


    public Integer getContractProgressId() {
        return contractProgressId;
    }

    public void setContractProgressId(Integer contractProgressId) {
        this.contractProgressId = contractProgressId;
    }

    public ContractProductionDistribution getContractProductionDistribution() {
        return contractProductionDistribution;
    }

    public void setContractProductionDistribution(ContractProductionDistribution contractProductionDistribution) {
        this.contractProductionDistribution = contractProductionDistribution;
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

}
