package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 功能名称
 *
 * @author 甄立
 * @version 1.0
 */
public class Function implements Serializable {

    private static final long serialVersionUID = 372370922270141132L;
    /**
     * 功能名称id
     */
    private Integer functionId;
    /**
     * 功能名称
     */
    private String functionName;
    /**
     * 功能url
     */
    private String functionUrl;
    /**
     * 权限id
     */
    private Integer jurisdictionId;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 功能类型
     */
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }


    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }


    public String getFunctionUrl() {
        return functionUrl;
    }

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl;
    }


    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
