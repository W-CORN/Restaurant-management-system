package team.ruike.cim.service;

import team.ruike.cim.pojo.WarehouseOutRegister;
import team.ruike.cim.util.Pager;

/**
 * 物料出库记录
 */
public interface WareHouSereGISTerOutService {
     int addWareHouseOutRegister(WarehouseOutRegister warehouseOutRegister);

     int updWareHouseOutRegister(WarehouseOutRegister warehouseOutRegister);

     void getWarehouseOutRegister(WarehouseOutRegister warehouseOutRegister, Pager<WarehouseOutRegister> pager);
}
