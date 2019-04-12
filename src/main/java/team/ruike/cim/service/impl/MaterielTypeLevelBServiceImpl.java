package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.MaterielTypeLevelBDao;
import team.ruike.cim.pojo.MaterielTypeLevelB;
import team.ruike.cim.service.MaterielTypeLevelBService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物料2级分类实现
 */
@Service("materielTypeLevelBService")
public class MaterielTypeLevelBServiceImpl implements MaterielTypeLevelBService {
    @Resource
    private MaterielTypeLevelBDao materielTypeLevelBDao;

    public List<MaterielTypeLevelB> getMaterielTypeLevelB(MaterielTypeLevelB materielTypeLevelB) {
        return materielTypeLevelBDao.select(materielTypeLevelB,0,99);
    }
}
