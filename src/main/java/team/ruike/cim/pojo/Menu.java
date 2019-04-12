package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 菜谱
 *@author 孙天奇
 * @author 甄立
 * @version 1.0
 */
public class Menu implements Serializable {

    private static final long serialVersionUID = -4447100772306943624L;
    /**
     * 菜谱id
     */
    private Integer menuId;
    /**
     * 菜谱名称
     */
    private String menuName;
    /**
     * 菜谱编码
     */
    private String menuNo;
    /**
     * 菜谱类别
     */
    private MenuType menuType;
    /**
     * 净重
     */
    private Double menuWeight;
    /**
     * 成本
     */
    private Double menuCost;
    /**
     * 图片路径
     */
    private String menuImage;
    /**
     * 储存条件(最高温度)
     */
    private Integer menuStoreMax;
    /**
     * 储存条件(最低温度)
     */
    private Integer menuStoreMin;
    /**
     * 保质期
     */
    private Integer menuShelfLife;
    /**
     * 创建时间
     */
    private Date menuCreateDate;
    /**
     * 菜谱状态
     */
    private MenuState menuState;
    /**
     * 发布时间
     */
    private Date menuReleaseDate;
    /**
     * 删除状态
     */
    private Integer status;
    /**
     * 备注
     */
    private String menuRemarks;
    /**
     * 菜品物料关系类集合
     */
    private List<MenuMateriel> menuMaterielList;

    public List<MenuMateriel> getMenuMaterielList() {
        return menuMaterielList;
    }

    public void setMenuMaterielList(List<MenuMateriel> menuMaterielList) {
        this.menuMaterielList = menuMaterielList;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }


    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    public Double getMenuWeight() {
        return menuWeight;
    }

    public void setMenuWeight(Double menuWeight) {
        this.menuWeight = menuWeight;
    }


    public Double getMenuCost() {
        return menuCost;
    }

    public void setMenuCost(Double menuCost) {
        this.menuCost = menuCost;
    }


    public String getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage;
    }


    public Integer getMenuStoreMax() {
        return menuStoreMax;
    }

    public void setMenuStoreMax(Integer menuStoreMax) {
        this.menuStoreMax = menuStoreMax;
    }


    public Integer getMenuStoreMin() {
        return menuStoreMin;
    }

    public void setMenuStoreMin(Integer menuStoreMin) {
        this.menuStoreMin = menuStoreMin;
    }


    public Integer getMenuShelfLife() {
        return menuShelfLife;
    }

    public void setMenuShelfLife(Integer menuShelfLife) {
        this.menuShelfLife = menuShelfLife;
    }


    public Date getMenuCreateDate() {
        return menuCreateDate;
    }

    public void setMenuCreateDate(Date menuCreateDate) {
        this.menuCreateDate = menuCreateDate;
    }

    public Date getMenuReleaseDate() {
        return menuReleaseDate;
    }

    public void setMenuReleaseDate(Date menuReleaseDate) {
        this.menuReleaseDate = menuReleaseDate;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getMenuRemarks() {
        return menuRemarks;
    }

    public void setMenuRemarks(String menuRemarks) {
        this.menuRemarks = menuRemarks;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public MenuState getMenuState() {
        return menuState;
    }

    public void setMenuState(MenuState menuState) {
        this.menuState = menuState;
    }
}
