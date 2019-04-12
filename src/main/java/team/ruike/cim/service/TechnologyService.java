package team.ruike.cim.service;

import team.ruike.cim.pojo.Technology;
import team.ruike.cim.pojo.Working;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 工艺业务接口
 * @author 张振国
 * @version 1.0
 * @see #getTechnologyList(Technology, Pager)
 * @see #getWorking()
 * @see #addTechnology(Technology)
 * @see #delTechnology(Technology)
 */
public interface TechnologyService {
    /**
     * 获取工艺集合
     * @param technology 工艺对象（查询条件）
     * @param pager 分页辅助类
     */
    void getTechnologyList(Technology technology, Pager<Technology> pager);

    /**
     * 获取工序集合
     */
    List<Working> getWorking();

    /**
     * 添加工艺
     * @param technology 工艺对象
     * @return 是否成功
     */
    boolean addTechnology(Technology technology);

    /**
     * 删除工艺
     * @param technology 工艺对象
     * @return 是否成功
     */
    boolean delTechnology(Technology technology);

    /**
     * 获取所有工艺
     * @return  所有工艺
     */
    List<Technology> selectAllTechnology();

}
