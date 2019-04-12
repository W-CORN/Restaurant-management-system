package team.ruike.cim.service;

import team.ruike.cim.pojo.ProductGoodsShelve;

import java.util.List;

/**
 * 物料区域
 */
public interface ProductGoodSShelve {
     int addProductGoodSShelve(ProductGoodsShelve productGoodsShelve);

     int updProductGoodSShelve(ProductGoodsShelve productGoodsShelve);

     List<ProductGoodsShelve> getProductGoodSShelve(ProductGoodsShelve productGoodsShelve);
}
