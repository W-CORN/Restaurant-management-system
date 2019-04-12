package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ContractOrderDao;
import team.ruike.cim.dao.GoodsShelveDao;
import team.ruike.cim.dao.MenuTypeDao;
import team.ruike.cim.dao.WarehouseOutRegisterItemDao;
import team.ruike.cim.pojo.ContractOrder;
import team.ruike.cim.pojo.GoodsShelve;
import team.ruike.cim.pojo.MenuType;
import team.ruike.cim.pojo.WarehouseOutRegisterItem;
import team.ruike.cim.service.GoodSShelveService;
import team.ruike.cim.service.WarehouseOutRegisterItemService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * 出库记录表项业务实现
 */
@Service("warehouseOutRegisterItemService")
public class WarehouseOutRegisterItemServiceImpl implements WarehouseOutRegisterItemService {
    @Resource
    private WarehouseOutRegisterItemDao warehouseOutRegisterItemDao;
    @Resource
    ContractOrderDao contractOrderDao;
    @Resource
    GoodsShelveDao goodsShelveDao;

    public int addWarehouseOutRegisterItem(WarehouseOutRegisterItem warehouseOutRegisterItem) {
        if (warehouseOutRegisterItem != null && warehouseOutRegisterItem.getMateriel() != null && warehouseOutRegisterItem.getMateriel().getMaterielId() > 0 && warehouseOutRegisterItem.getGoodsShelve() != null
                && warehouseOutRegisterItem.getGoodsShelve().getGoodsShelveId() > 0 && warehouseOutRegisterItem.getWarehouseOutRegister() != null && warehouseOutRegisterItem.getWarehouseOutRegister().getWarehouseOutRegisterId() > 0) {
            return warehouseOutRegisterItemDao.add(warehouseOutRegisterItem);
        }
        return 0;
    }

    public int upd(WarehouseOutRegisterItem warehouseOutRegisterItem) {
        if (warehouseOutRegisterItem != null && warehouseOutRegisterItem.getMateriel() != null && warehouseOutRegisterItem.getMateriel().getMaterielId() > 0 && warehouseOutRegisterItem.getGoodsShelve() != null
                && warehouseOutRegisterItem.getGoodsShelve().getGoodsShelveId() > 0 && warehouseOutRegisterItem.getWarehouseOutRegister() != null && warehouseOutRegisterItem.getWarehouseOutRegister().getWarehouseOutRegisterId() > 0) {
            return warehouseOutRegisterItemDao.update(warehouseOutRegisterItem);
        }
        return 0;
    }

    public void getWarehouseOutRegisterItem(WarehouseOutRegisterItem warehouseOutRegisterItem, Pager<WarehouseOutRegisterItem> pager) {
        pager.setTotalRecord(warehouseOutRegisterItemDao.selectCount(warehouseOutRegisterItem));
        pager.setList(warehouseOutRegisterItemDao.select(warehouseOutRegisterItem, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize()));
    }

    @Override
    public void getOutRegisterItemByWarehouseId(WarehouseOutRegisterItem warehouseOutRegisterItem, Pager<WarehouseOutRegisterItem> pager) {
        pager.setTotalRecord(warehouseOutRegisterItemDao.selectCount(warehouseOutRegisterItem));
        pager.setList(warehouseOutRegisterItemDao.selectByWarehouseId(warehouseOutRegisterItem, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize()));
    }

    /**
     * 根据条件查询订单
     *
     * @param contractOrder 订单对象
     * @return 订单对象
     */
    @Override
    public List<ContractOrder> getContractOrder(ContractOrder contractOrder) {
        return contractOrderDao.select(contractOrder, 0, 99);
    }

    /**
     * 查询以存储物料的货架
     *
     * @param goodsShelve
     * @return
     */
    @Override
    public List<GoodsShelve> getGoods(GoodsShelve goodsShelve) {
        return goodsShelveDao.selectgods(goodsShelve);
    }
}
