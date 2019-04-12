package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 菜谱类别
 *
 * @author 甄立
 * @version 1.0
 */
public class MenuType implements Serializable {

    private static final long serialVersionUID = 2647922421561759648L;
    /**
     * 菜谱类别id
     */
    private Integer menuTypeId;
    /**
     * 类型名称
     */
    private String menuTypeName;
    /**
     * 类编码
     */
    private String menuTypeNo;
    /**
     * 删除状态
     */
    private Integer status;

    public Integer getMenuTypeId() {
        return menuTypeId;
    }

    public void setMenuTypeId(Integer menuTypeId) {
        this.menuTypeId = menuTypeId;
    }


    public String getMenuTypeName() {
        return menuTypeName;
    }

    public void setMenuTypeName(String menuTypeName) {
        this.menuTypeName = menuTypeName;
    }


    public String getMenuTypeNo() {
        return menuTypeNo;
    }

    public void setMenuTypeNo(String menuTypeNo) {
        this.menuTypeNo = menuTypeNo;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
