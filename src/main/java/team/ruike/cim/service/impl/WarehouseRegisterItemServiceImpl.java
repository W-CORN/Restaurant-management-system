package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.EverydayPurchasingPlanDao;
import team.ruike.cim.dao.WarehouseRegisterItemDao;
import team.ruike.cim.pojo.EverydayPurchasingPlan;
import team.ruike.cim.pojo.WarehouseRegisterItem;
import team.ruike.cim.service.WarehouseRegisterItemService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物料入库记录项
 */
@Service("warehouseRegisterItemService")
public class WarehouseRegisterItemServiceImpl implements WarehouseRegisterItemService {
    @Resource
    private WarehouseRegisterItemDao warehouseRegisterItemDao;
    @Resource
    EverydayPurchasingPlanDao everydayPurchasingPlanDao;

    public int addWarehouseRegisterItem(WarehouseRegisterItem warehouseRegisterItem) {
        if (warehouseRegisterItem.getMateriel()!=null&&warehouseRegisterItem.getMateriel().getMaterielId()>0 &&warehouseRegisterItem.getMaterielNumber()!=null&&warehouseRegisterItem.getMaterielNumber()>0) {
            return warehouseRegisterItemDao.add(warehouseRegisterItem);
        }
        return 0;
    }

    public int updWarehouseRegisterItem(WarehouseRegisterItem warehouseRegisterItem) {
        if (warehouseRegisterItem.getGoodsShelve() != null && warehouseRegisterItem.getGoodsShelve().getGoodsShelveId() > 0 && warehouseRegisterItem.getMateriel() != null
                && warehouseRegisterItem.getMateriel().getMaterielId() > 0 && warehouseRegisterItem.getMaterielNumber() > 0 && warehouseRegisterItem.getWarehouseRegister() != null && warehouseRegisterItem.getWarehouseRegister().getWarehouseRegisterId() > 0) {
            return warehouseRegisterItemDao.update(warehouseRegisterItem);
        }
        return 0;
    }

    public void getWarehouseRegisterItem(WarehouseRegisterItem warehouseRegisterItem, Pager<WarehouseRegisterItem> pager) {
        pager.setTotalRecord(warehouseRegisterItemDao.selectCount(warehouseRegisterItem));
        pager.setList(warehouseRegisterItemDao.select(warehouseRegisterItem, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize()));
    }

    /**
     * 根据仓库id查询所有记录
     *
     * @param warehouseRegisterItem
     * @param pager
     */
    @Override
    public void getWarehouseRegisterItemByWarehouseId(WarehouseRegisterItem warehouseRegisterItem, Pager<WarehouseRegisterItem> pager) {
        pager.setTotalRecord(warehouseRegisterItemDao.selectCount(warehouseRegisterItem));
        pager.setList(warehouseRegisterItemDao.selectWarehouseId(warehouseRegisterItem, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize()));
    }

    /**
     * 根据时间查询每日计划生产编号
     *
     * @param everydayPurchasingPlan
     * @return 每日计划生产编号
     */
    public List<EverydayPurchasingPlan> getPlan(EverydayPurchasingPlan everydayPurchasingPlan) {
        return everydayPurchasingPlanDao.select(everydayPurchasingPlan, 0, 99);
    }
}
