package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ProductWarehouseDao;
import team.ruike.cim.pojo.ProductWarehouse;
import team.ruike.cim.service.PwarehouseService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * 成品仓库
 */
@Service("pwarehouseService")
public class PwarehouseServiceImpl implements PwarehouseService {
    @Resource
    private ProductWarehouseDao productWarehouseDao;

    /**
     * 新增成品出库
     *
     * @param productWarehouse
     * @return
     */
    public int addPwarehouse(ProductWarehouse productWarehouse) {
        if (productWarehouse != null && productWarehouse.getProductWarehouseName() != "" && productWarehouse.getUser() != null && productWarehouse.getUser().getUserId() > 0) {
            return productWarehouseDao.add(productWarehouse);
        }
        return 0;
    }

    /**
     * 修改成品仓库
     *
     * @param productWarehouse
     * @return
     */
    public int updWarehouse(ProductWarehouse productWarehouse) {
        if (productWarehouse != null && productWarehouse.getProductWarehouseName() != "" && productWarehouse.getUser() != null && productWarehouse.getUser().getUserId() > 0) {
            return productWarehouseDao.update(productWarehouse);
        }
        return 0;
    }

    /**
     * 根据条件查询成品仓库
     *
     * @param productWarehouse
     * @return
     */
    public List<ProductWarehouse> getWarehouse(ProductWarehouse productWarehouse) {
        List<ProductWarehouse> ProductWarehouses= productWarehouseDao.select(productWarehouse,0,99);
        return ProductWarehouses;
    }
}
