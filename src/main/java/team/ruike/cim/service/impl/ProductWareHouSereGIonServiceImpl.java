package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ProductWarehouseRegionDao;
import team.ruike.cim.pojo.ProductWarehouseRegion;
import team.ruike.cim.service.ProductWareHouSereGIonService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;

/**
 * 成品区域业务实现
 */
@Service("productWareHouSereGIonService")
public class ProductWareHouSereGIonServiceImpl implements ProductWareHouSereGIonService {
    @Resource
    private ProductWarehouseRegionDao productWarehouseRegionDao;

    /**
     * 添加成品区域表
     *
     * @param productWarehouseRegion
     * @return
     */
    public int addProductWareHouSereGIon(ProductWarehouseRegion productWarehouseRegion) {
        if (productWarehouseRegion.getProductWarehouseRegionNo() != null && productWarehouseRegion.getProductWarehouseRegionNo() != ""
                && productWarehouseRegion.getMenuType() != null && productWarehouseRegion.getMenuType().getMenuTypeId() > 0
                && productWarehouseRegion.getProductWarehouse() != null && productWarehouseRegion.getProductWarehouse().getProductWarehouseId() > 0) {
            return productWarehouseRegionDao.add(productWarehouseRegion);
        }
        return 0;
    }

    /**
     * 修改成品区域表
     *
     * @param productWarehouseRegion
     * @return
     */
    public int updProductWareHouSereGIon(ProductWarehouseRegion productWarehouseRegion) {
        return productWarehouseRegionDao.add(productWarehouseRegion);
    }

    /**
     * 分页查询成品区域表
     *
     * @param productWarehouseRegion
     * @param pager
     */
    public void getProductWareHouSereGIon(ProductWarehouseRegion productWarehouseRegion, Pager<ProductWarehouseRegion> pager) {
        pager.setPageSize(3);
        pager.setTotalRecord(productWarehouseRegionDao.selectCount(productWarehouseRegion));
        pager.setList(productWarehouseRegionDao.select(productWarehouseRegion, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize()));
    }
}
