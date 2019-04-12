package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ProductGoodsShelveDao;
import team.ruike.cim.pojo.ProductGoodsShelve;
import team.ruike.cim.service.ProductGoodSShelve;

import javax.annotation.Resource;
import java.util.List;

/**
 * 成品货架业务
 */
@Service("productGoodSShelve")
public class ProductGoodSShelveImpl implements ProductGoodSShelve {
    @Resource
    private ProductGoodsShelveDao productGoodsShelveDao;

    /**
     *新增菜品货架
     * @param productGoodsShelve 成品货架对象
     * @return 结果
     */
    public int addProductGoodSShelve(ProductGoodsShelve productGoodsShelve) {
        if (productGoodsShelve != null  && productGoodsShelve.getProductWarehouseRegion() != null
                && productGoodsShelve.getProductWarehouseRegion().getProductWarehouseRegionId() > 0&&productGoodsShelve.getProductGoodsShelveNo()!="") {
                return productGoodsShelveDao.add(productGoodsShelve);
        }
        return 0;
    }

    /**
     *修改成品货架
     * @param productGoodsShelve 成品货架对象
     * @return 结果
     */
    public int updProductGoodSShelve(ProductGoodsShelve productGoodsShelve) {
        if (productGoodsShelve != null && productGoodsShelve.getMenu() != null && productGoodsShelve.getMenu().getMenuId() > 0
                && productGoodsShelve.getMenuNumber() > 0
                && productGoodsShelve.getMaterielShelfLifeEndDate() != null && productGoodsShelve.getProductWarehouseRegion() != null
                && productGoodsShelve.getProductWarehouseRegion().getProductWarehouseRegionId() > 0) {
            return productGoodsShelveDao.update(productGoodsShelve);
        }
        return 0;
    }

    /**
     *分页查询货架
     * @param productGoodsShelve 成品货架对象
     * @return 成品货架对象
     */
    public List<ProductGoodsShelve> getProductGoodSShelve(ProductGoodsShelve productGoodsShelve) {
        return productGoodsShelveDao.select(productGoodsShelve,0,99);
    }
}
