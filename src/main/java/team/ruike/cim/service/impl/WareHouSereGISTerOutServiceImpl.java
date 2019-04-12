package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.WarehouseOutRegisterDao;
import team.ruike.cim.pojo.WarehouseOutRegister;
import team.ruike.cim.service.WareHouSereGISTerOutService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;

/**
 * 物料出库记录
 */
@Service("wareHouSereGISTerOutService")
public class WareHouSereGISTerOutServiceImpl implements WareHouSereGISTerOutService {
    @Resource
    private WarehouseOutRegisterDao warehouseOutRegisterDao;
    public int addWareHouseOutRegister(WarehouseOutRegister warehouseOutRegister) {
        if (warehouseOutRegister!=null&& warehouseOutRegister.getUser()!=null&&warehouseOutRegister.getUser().getUserId()>0
                &&warehouseOutRegister.getWarehouseOutRegisterEndDate()!=null){
           return warehouseOutRegisterDao.add(warehouseOutRegister);
        }
        return 0;
    }

    public int updWareHouseOutRegister(WarehouseOutRegister warehouseOutRegister) {
        if (warehouseOutRegister!=null&& warehouseOutRegister.getUser()!=null&&warehouseOutRegister.getUser().getUserId()>0
                &&warehouseOutRegister.getWarehouseOutRegisterEndDate()!=null){
            return warehouseOutRegisterDao.update(warehouseOutRegister);
        }
        return 0;
    }

    public void getWarehouseOutRegister(WarehouseOutRegister warehouseOutRegister, Pager<WarehouseOutRegister> pager) {
        pager.setTotalRecord(warehouseOutRegisterDao.selectCount(warehouseOutRegister));
        pager.setList(warehouseOutRegisterDao.select(warehouseOutRegister,(pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize()));

    }
}
