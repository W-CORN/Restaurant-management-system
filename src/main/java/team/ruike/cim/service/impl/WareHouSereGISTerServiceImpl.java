package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.WarehouseRegisterDao;
import team.ruike.cim.pojo.WarehouseRegister;
import team.ruike.cim.service.WareHouSereGISTerService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;

/**
 * 物料入库记录
 */
@Service("wareHouSereGISTerService")
public class WareHouSereGISTerServiceImpl implements WareHouSereGISTerService {
    @Resource
    private WarehouseRegisterDao warehouseRegisterDao;

    public int addWarehouseRegister(WarehouseRegister warehouseRegister) {
        if (warehouseRegister != null && warehouseRegister.getUser() != null && warehouseRegister.getUser().getUserId() > 0
                && warehouseRegister.getWarehouseRegisterDate() != null && warehouseRegister.getEverydayPurchasingPlan().getEverydayPurchasingPlanId()>0) {
            return warehouseRegisterDao.add(warehouseRegister);
        }
        return 0;
    }

    public int upd(WarehouseRegister warehouseRegister) {
        if (warehouseRegister != null && warehouseRegister.getUser() != null && warehouseRegister.getUser().getUserId() > 0
                && warehouseRegister.getWarehouseRegisterDate() != null && warehouseRegister.getEverydayPurchasingPlan().getEverydayPurchasingPlanId() > 0) {
            return warehouseRegisterDao.update(warehouseRegister);
        }
        return 0;
    }

    public void getWarehouseRegister(WarehouseRegister warehouseRegister, Pager<WarehouseRegister> pager) {
        pager.setTotalRecord(warehouseRegisterDao.selectCount(warehouseRegister));
        pager.setList(warehouseRegisterDao.select(warehouseRegister, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize()));
    }


}
