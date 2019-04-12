package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 菜品制作流程
 *
 * @author 甄立
 * @version 1.0
 */
public class MenuFlow implements Serializable {

    private static final long serialVersionUID = 8303793683156656287L;
    /**
     * 菜品制作流程 id
     */
    private Integer menuFlowId;
    /**
     * 菜物关系表id外键
     */
    private MenuMateriel menuMateriel;
    /**
     * 工序
     */
    private Working working;
    /**
     * 工艺表
     */
    private Technology technology;
    /**
     * 描述
     */
    private String menuFlowDescribe;
    /**
     * 耗时(H)
     */
    private Double menuFlowHour;
    /**
     * 图片路径
     */
    private String menuFlowImage;
    /**
     * 删除状态
     */
    private Integer status;

    /**
     * 图片路径对应
     * 用于多上传（找对应的文件）
     */
    private String menuFlowImageCorrespond;

    public String getMenuFlowImageCorrespond() {
        return menuFlowImageCorrespond;
    }

    public void setMenuFlowImageCorrespond(String menuFlowImageCorrespond) {
        this.menuFlowImageCorrespond = menuFlowImageCorrespond;
    }

    public Integer getMenuFlowId() {
        return menuFlowId;
    }

    public void setMenuFlowId(Integer menuFlowId) {
        this.menuFlowId = menuFlowId;
    }

    public MenuMateriel getMenuMateriel() {
        return menuMateriel;
    }

    public void setMenuMateriel(MenuMateriel menuMateriel) {
        this.menuMateriel = menuMateriel;
    }

    public Working getWorking() {
        return working;
    }

    public void setWorking(Working working) {
        this.working = working;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public String getMenuFlowDescribe() {
        return menuFlowDescribe;
    }

    public void setMenuFlowDescribe(String menuFlowDescribe) {
        this.menuFlowDescribe = menuFlowDescribe;
    }


    public Double getMenuFlowHour() {
        return menuFlowHour;
    }

    public void setMenuFlowHour(Double menuFlowHour) {
        this.menuFlowHour = menuFlowHour;
    }


    public String getMenuFlowImage() {
        return menuFlowImage;
    }

    public void setMenuFlowImage(String menuFlowImage) {
        this.menuFlowImage = menuFlowImage;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
