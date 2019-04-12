package team.ruike.cim.pojo;


import java.io.Serializable;


/**
 * 工序表
 *
 * @author 孙天奇
 * @version 1.0
 */
public class Working implements Serializable {

    private static final long serialVersionUID = 6073877080532606188L;
    /**
     * 工序表id
     */
    private Integer workingId;
    /**
     * 工序名称
     */
    private String workingName;
    /**
     * 删除状态
     */
    private Integer status;


    public Integer getWorkingId() {
        return workingId;
    }

    public void setWorkingId(Integer workingId) {
        this.workingId = workingId;
    }


    public String getWorkingName() {
        return workingName;
    }

    public void setWorkingName(String workingName) {
        this.workingName = workingName;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
