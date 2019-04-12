package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.TechnologyDao;
import team.ruike.cim.dao.WorkingDao;
import team.ruike.cim.pojo.Technology;
import team.ruike.cim.pojo.Working;
import team.ruike.cim.service.TechnologyService;
import team.ruike.cim.util.ArchivesLog;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * 工艺业务实现类
 * @author 张振国
 * @version 1.0
 * @see #getTechnologyList(Technology, Pager)
 * @see #getWorking()
 * @see #delTechnology(Technology)
 * @see #addTechnology(Technology)
 */
@Service("technologyService")
public class TechnologyServiceImpl implements TechnologyService {
    @Resource
    private TechnologyDao technologyDao;
    @Resource
    private WorkingDao workingDao;
    /**
     * 获取工艺集合
     * @param technology 工艺对象（查询条件）
     * @param pager 分页辅助类
     */
    public void getTechnologyList(Technology technology, Pager<Technology> pager) {
        pager.setTotalRecord(technologyDao.selectCount(technology));
        pager.setList(technologyDao.select(technology,(pager.getCurrentPage()-1)*pager.getPageSize(),pager.getPageSize()));
    }

    @Override
    public List<Working> getWorking() {
        return workingDao.select(new Working(), 0, 99);
    }

    /**
     * 新增工序信息
     * @param technology 工艺对象
     * @return 是否成功
     */
    @Override
    @ArchivesLog(operationType="新增操作",operationName="新增工艺")
    public boolean addTechnology(Technology technology) {
        return technologyDao.add(technology)==1;
    }

    @Override
    @ArchivesLog(operationType="删除操作",operationName="删除工艺")
    public boolean delTechnology(Technology technology) {
        Technology technology1 = technologyDao.selectById(technology.getTechnologyId());
        technology1.setStatus(1);
        return technologyDao.update(technology1) == 1;
    }

    /**
     * 获取所有工艺
     * @return 所有工艺
     */
    public List<Technology> selectAllTechnology() {
        return technologyDao.select(new Technology(),0,99);
    }
}
