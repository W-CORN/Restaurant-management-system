package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 工艺
 *
 * @author 孙天奇
 * @version 1.0
 */
public class Technology implements Serializable {

    private static final long serialVersionUID = 1121809937090228362L;
    /**
     * 工艺id
     */
    private Integer technologyId;
    /**
     * 名称
     */
    private String technologyName;
    /**
     * 预设工序
     */
    private Working working;
    /**
     * 状态
     */
    private Integer status;


    public Integer getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Integer technologyId) {
        this.technologyId = technologyId;
    }


    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public Working getWorking() {
        return working;
    }

    public void setWorking(Working working) {
        this.working = working;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
