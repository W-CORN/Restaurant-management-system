package team.ruike.cim.service;

import team.ruike.cim.pojo.EverydayPurchasingPlan;
import team.ruike.cim.pojo.WarehouseRegisterItem;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 物料入库项记录接口
 */
public interface WarehouseRegisterItemService {
     /**
      * 新增物料入库记录项
      * @param warehouseRegisterItem 入库记录项id
      * @return 结果
      */
     int addWarehouseRegisterItem(WarehouseRegisterItem warehouseRegisterItem);

     /**
      * 修改入库记录项
      * @param warehouseRegisterItem 入库记录项对象
      * @return 结果
      */
     int updWarehouseRegisterItem(WarehouseRegisterItem warehouseRegisterItem);

     /**
      * 分页查询入库记录
      * @param warehouseRegisterItem 入库记录对象
      * @param pager 分页辅助类
      */
     void getWarehouseRegisterItem(WarehouseRegisterItem warehouseRegisterItem, Pager<WarehouseRegisterItem> pager);

     /**
      * 根据仓库id查询所有记录
      * @param warehouseRegisterItem 入库记录对象
      * @param pager 分页辅助类
      */
     void getWarehouseRegisterItemByWarehouseId(WarehouseRegisterItem warehouseRegisterItem, Pager<WarehouseRegisterItem> pager);
     /**
      * 根据时间查询每日计划生产编号
      * @param everydayPurchasingPlan 入库记录对象
      * @return 每日计划生产编号
      */
     List<EverydayPurchasingPlan> getPlan(EverydayPurchasingPlan everydayPurchasingPlan);
}
