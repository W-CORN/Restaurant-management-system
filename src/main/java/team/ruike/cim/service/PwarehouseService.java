package team.ruike.cim.service;

import team.ruike.cim.pojo.ProductWarehouse;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 成品仓库业务接口
 */
public interface PwarehouseService {

    /**
     * 新增产品出库
     *
     * @param productWarehouse
     * @return
     */
     int addPwarehouse(ProductWarehouse productWarehouse);

    /**
     * 修改成品仓库
     *
     * @param productWarehouse
     * @return
     */
     int updWarehouse(ProductWarehouse productWarehouse);

    /**
     * 根据条件查询成品仓库
     *
     * @param productWarehouse
     * @return
     */
     List<ProductWarehouse> getWarehouse(ProductWarehouse productWarehouse);
}
