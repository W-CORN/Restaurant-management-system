package team.ruike.cim.service;


import team.ruike.cim.pojo.ProductWarehouseOutRegisterItem;
import team.ruike.cim.pojo.ProductWarehouseRegisterItem;
import team.ruike.cim.util.Pager;

/**
 * 成品库入库登记表接口
 */
public interface ProductWarehouseRegisterService {
    /**
     * 新增成品入库
     * @param productWarehouseRegisterItem 成品入库记录项
     * @return 受影响行数
     */
    int addProductWarehouseRegisterItem(ProductWarehouseRegisterItem productWarehouseRegisterItem);

    /**
     * 修改新品入库信息
     * @param productWarehouseRegisterItem 成品入库记录项
     * @return 受影响行数
     */
    int updProductWarehouseRegisterItem(ProductWarehouseRegisterItem productWarehouseRegisterItem);

    /**
     * 查询成品入库信息
     * @param productWarehouseRegisterItem 成品入库记录项
     * @param pager 分页辅助类
     */
    void getProductWarehouseRegisterItem(ProductWarehouseRegisterItem productWarehouseRegisterItem, Pager<ProductWarehouseRegisterItem> pager);

    /**
     * 根据仓库id查询所有仓库记录信息
     * @param productWarehouseRegisterItem
     * @param pager
     */
    void getItemByProductWarehouseId(ProductWarehouseRegisterItem productWarehouseRegisterItem, Pager<ProductWarehouseRegisterItem> pager);
}
