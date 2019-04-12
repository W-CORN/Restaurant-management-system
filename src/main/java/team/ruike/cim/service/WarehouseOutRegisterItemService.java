package team.ruike.cim.service;

import team.ruike.cim.pojo.ContractOrder;
import team.ruike.cim.pojo.GoodsShelve;
import team.ruike.cim.pojo.MenuType;
import team.ruike.cim.pojo.WarehouseOutRegisterItem;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 出库记录项
 */
public interface WarehouseOutRegisterItemService {
     /**
      * 新增
      * @param warehouseOutRegisterItem 出库记录对象
      * @return 结果
      */
     int addWarehouseOutRegisterItem(WarehouseOutRegisterItem warehouseOutRegisterItem);
     /**
      * 修改
      * @param warehouseOutRegisterItem 出库记录对象
      * @return 结果
      */
     int upd(WarehouseOutRegisterItem warehouseOutRegisterItem);

     /**
      * 查询所有出库项
      * @param warehouseOutRegisterItem 出库记录对象
      * @param pager 分页辅助类
      */
     void getWarehouseOutRegisterItem(WarehouseOutRegisterItem warehouseOutRegisterItem, Pager<WarehouseOutRegisterItem> pager);

     /**
      * 根据仓库id查询所有出库项
      * @param warehouseOutRegisterItem 出库记录对象
      * @param pager 分页辅助类
      */
     void getOutRegisterItemByWarehouseId(WarehouseOutRegisterItem warehouseOutRegisterItem, Pager<WarehouseOutRegisterItem> pager);

     /**
      * 根据条件查询订单
      * @return 订单对象
      */
     List<ContractOrder> getContractOrder(ContractOrder contractOrder);

     /**
      * 查询以存储物料的货架
      * @param goodsShelve
      * @return
      */
     List<GoodsShelve> getGoods(GoodsShelve goodsShelve);
}
