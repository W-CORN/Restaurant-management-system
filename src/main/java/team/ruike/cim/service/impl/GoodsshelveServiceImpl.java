package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.GoodsShelveDao;
import team.ruike.cim.pojo.GoodsShelve;
import team.ruike.cim.service.GoodSShelveService;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsshelveService")
public class GoodsshelveServiceImpl implements GoodSShelveService {
    @Resource
    private GoodsShelveDao goodsShelveDao;

    /**
     * 查询物料货架
     *
     * @param goodsShelve
     */
    public List<GoodsShelve> getGoodsshelve(GoodsShelve goodsShelve) {
        return goodsShelveDao.select(goodsShelve, 0, 99);
    }

    /**
     * 新增物料货架
     *
     * @param goodsShelve
     * @return
     */
    public int addGoods_shelve(GoodsShelve goodsShelve) {
        if (goodsShelve != null) {
            return goodsShelveDao.add(goodsShelve);
        }
        return 0;
    }

    /**
     * 修改物料货架
     *
     * @param goodsShelve
     * @return
     */
    public int updGoods_shelve(GoodsShelve goodsShelve) {
        if (goodsShelve != null && goodsShelve.getMateriel().getMaterielId() > 0 && goodsShelve.getMaterielNumber() > 0 && goodsShelve.getWarehouseRegion().getWarehouseRegionId() > 0) {
            return goodsShelveDao.update(goodsShelve);
        }
        return 0;
    }

    /**
     * 根据区域id查询空闲回家
     * @param warehouseRegionId
     * @return
     */
    public List<GoodsShelve> selectByWarehouseRegionId(Integer warehouseRegionId) {
        if (warehouseRegionId != null && warehouseRegionId > 0) {
            return goodsShelveDao.selectByWarehouseRegionId(warehouseRegionId);
        }
        return null;
    }

    /**
     * 根据货架id 查询对应货架
     *
     * @param goodid
     * @return
     */
    @Override
    public GoodsShelve selectByGoodid(Integer goodid) {
        return goodsShelveDao.selectById(goodid);
    }
}
