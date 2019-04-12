package team.ruike.cim.service.impl;


import org.springframework.stereotype.Service;
import team.ruike.cim.dao.WarehouseRegionDao;
import team.ruike.cim.pojo.WarehouseRegion;
import team.ruike.cim.service.WareHouSereGIonService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;

/**
 * 物料区域
 */
@Service("warehouseRegionService")
public class WarehouseRegionServiceImpl implements WareHouSereGIonService {
    @Resource
    private WarehouseRegionDao warehouseRegionDao;

    /**
     * 查询所有区域
     *
     * @param warehouseRegion
     * @param pager
     */
    public void getWareHouSereGIonServer(WarehouseRegion warehouseRegion, Pager<WarehouseRegion> pager) {
        pager.setTotalRecord(warehouseRegionDao.selectCount(warehouseRegion));
        pager.setPageSize(3);
        pager.setList(warehouseRegionDao.select(warehouseRegion, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize()));
    }

    /**
     * 新增区域
     *
     * @param warehouseRegion
     * @return
     */
    public int addWareHouSereGIonServer(WarehouseRegion warehouseRegion) {
        if (warehouseRegion != null && warehouseRegion.getMaterielTypeLevelB().getMaterielTypeLevelBId() > 0) {
            return warehouseRegionDao.add(warehouseRegion);
        }
        return 0;
    }

    /**
     * 修改区域
     *
     * @param warehouseRegion
     * @return
     */
    public int updWareHouSereGIonServer(WarehouseRegion warehouseRegion) {
        if (warehouseRegion != null && warehouseRegion.getMaterielTypeLevelB().getMaterielTypeLevelBId() > 0) {
            return warehouseRegionDao.update(warehouseRegion);
        }
        return 0;
    }
}
