package team.ruike.cim.service.impl;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.stereotype.Service;
import team.ruike.cim.dao.*;
import team.ruike.cim.pojo.*;
import team.ruike.cim.service.MenuService;
import team.ruike.cim.util.ArchivesLog;
import team.ruike.cim.util.GenerateNumber;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 菜谱业务实现类
 * @author 张振国
 * @version 1.0
 * @see #getMenuList(Menu, Pager)
 * @see #getMenuStateList()
 * @see #getMenuTypeList()
 * @see #flowMaxHour(int)
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService{
    @Resource
    private MenuDao menuDao;
    @Resource
    private MenuStateDao menuStateDao;
    @Resource
    private MenuTypeDao menuTypeDao;

    @Resource
    private MenuMaterielDao menuMaterielDao;

    @Resource
    private MenuFlowDao menuFlowDao;


    /**
     * 获取菜谱列表
     * @param menu 查询条件
     * @param pager 分页辅助类
     */
    public void getMenuList(Menu menu,Pager<Menu> pager) {
        pager.setTotalRecord(menuDao.selectCount(menu));
        List<Menu> menus = menuDao.select(menu, (pager.getCurrentPage() - 1)*pager.getPageSize(), pager.getPageSize());
        pager.setList(menus);
    }

    /**
     * 获取所有状态集合
     * @return 状态集合
     */
    public List<MenuState> getMenuStateList() {
        return menuStateDao.select(new MenuState(),0,99);
    }

    /**
     * 获取菜品类型集合
     * @return 类型集合
     */
    public List<MenuType> getMenuTypeList() {
        return menuTypeDao.select(new MenuType(),0,99);
    }

    /**
     * 获取菜品工序详情
     * @param menuId 菜品id
     * @return 工序详情
     */
    public List<List<MenuFlow>> getMenuFlows(int menuId){
        Menu menu = menuDao.selectById(menuId);
        List<MenuMateriel> menuMaterielList = menu.getMenuMaterielList();
        List<List<MenuFlow>> menuFlows=new ArrayList<List<MenuFlow>>();
        List<MenuFlow> menuFlows1=new ArrayList<MenuFlow>();
        List<MenuFlow> menuFlows2=new ArrayList<MenuFlow>();
        List<MenuFlow> menuFlows3=new ArrayList<MenuFlow>();
        List<MenuFlow> menuFlows4=new ArrayList<MenuFlow>();
        List<MenuFlow> menuFlows5=new ArrayList<MenuFlow>();
        //根据工序筛选每个工序的子工序
        for (MenuMateriel menuMateriel : menuMaterielList) {
            List<MenuFlow> menuFlow = menuMateriel.getMenuFlow();
            for (MenuFlow flow : menuFlow) {
                if (flow.getWorking().getWorkingId()==1){
                    menuFlows1.add(flow);
                }
                if (flow.getWorking().getWorkingId()==2){
                    menuFlows2.add(flow);
                }
                if (flow.getWorking().getWorkingId()==3){
                    menuFlows3.add(flow);
                }
                if (flow.getWorking().getWorkingId()==4){
                    menuFlows4.add(flow);
                }
                if (flow.getWorking().getWorkingId()==5){
                    menuFlows5.add(flow);
                }
            }
        }
        //放入筛选后的集合
        menuFlows.add(menuFlows1);
        menuFlows.add(menuFlows2);
        menuFlows.add(menuFlows3);
        menuFlows.add(menuFlows4);
        menuFlows.add(menuFlows5);
        return menuFlows;
    }




    /**
     * 获取菜品所有工序的最长时间
     * @param menuId 菜品id
     * @return 最长时间集合
     */
    public Map<String, MenuFlow> flowMaxHour(int menuId) {
        Map<String,MenuFlow> maps=new HashMap<String, MenuFlow>();
        List<List<MenuFlow>> menuFlows = this.getMenuFlows(menuId);
        //取各工序最长子时间
        for (int i = 0; i < menuFlows.size(); i++) {
            Double h=0.0;
            MenuFlow pFlow=new MenuFlow();
            for (MenuFlow menuFlow : menuFlows.get(i)) {
                if (menuFlow.getMenuFlowHour()>h){
                    h=menuFlow.getMenuFlowHour();
                    pFlow=menuFlow;
                }
            }
            maps.put(i+"",pFlow);
        }
        return maps;
    }


    /**
     * 根据菜品类型id 查询菜品
     * @param menuTypeId 菜品类型
     * @return 菜品集合
     */
    public List<Menu> selectByMenuTypeId(Integer menuTypeId) {
        return  menuDao.selectByMenuTypeId(menuTypeId);
    }

    /**
     * 添加菜谱
     * @param menu 菜谱信息
     * @param menuFlowList 制作流程
     */
    @ArchivesLog(operationType = "添加操作", operationName = "添加菜谱")
    public void addMenu(Menu menu,List<MenuFlow> menuFlowList) {
        menu.setMenuNo(GenerateNumber.getGenerateNumber().getRandomFileName());
        menuDao.add(menu);
        addSteps(menu,menuFlowList);
    }

    /**
     * 根据id查询菜谱
     * @param menuId 菜谱id
     * @return 菜谱对象
     */
    public Menu selectById(Integer menuId) {
        return menuDao.selectById(menuId);
    }


    /**
     * 修改菜谱
     * @param menu         菜谱信息
     * @param menuFlowList 制作流程
     */
    public void updateMenu(Menu menu, List<MenuFlow> menuFlowList) {
        menuDao.update(menu);
        List<MenuMateriel>  menuMaterielList=  menuMaterielDao.selectByMenuId(menu.getMenuId());
        for (MenuMateriel menuMateriel : menuMaterielList) {
                menuMaterielDao.deleteById(menuMateriel.getMenuMaterielId());
            for (MenuFlow menuFlow : menuMateriel.getMenuFlow()) {
                menuFlowDao.deleteById(menuFlow.getMenuFlowId());
            }
        }
        addSteps(menu,menuFlowList);
    }


    /**
     * 添加步骤
     * @param menu 菜谱
     * @param menuFlowList 菜谱流程
     */
    private void addSteps(Menu menu,List<MenuFlow> menuFlowList){
        for (MenuFlow menuFlow : menuFlowList) {
            //添加菜谱物料的关系
            menuFlow.getMenuMateriel().setMenuId(menu.getMenuId());
            menuMaterielDao.add(menuFlow.getMenuMateriel());

            //添加制作流程
            menuFlow.setMenuMateriel(menuFlow.getMenuMateriel());
            menuFlowDao.add(menuFlow);
        }
    }

    /**
     * 根据id删除菜谱
     * @param menuId 菜谱id
     */
    public void deleteById(Integer menuId) {
        menuDao.deleteById(menuId);
        menuMaterielDao.selectByMenuId(menuId);
        List<MenuMateriel>  menuMaterielList=  menuMaterielDao.selectByMenuId(menuId);
        for (MenuMateriel menuMateriel : menuMaterielList) {
            menuMaterielDao.deleteById(menuMateriel.getMenuMaterielId());
            for (MenuFlow menuFlow : menuMateriel.getMenuFlow()) {
                menuFlowDao.deleteById(menuFlow.getMenuFlowId());
            }
        }
    }

}
