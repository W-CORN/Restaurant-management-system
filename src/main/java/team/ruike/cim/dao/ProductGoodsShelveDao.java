package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductGoodsShelve;

import java.util.List;

/**
 * 成品货架表数据访问接口
 *
 * @author 华中昊
 * @author 华中昊
 * @version 1.0
 * @see #add(ProductGoodsShelve)
 * @see #update(ProductGoodsShelve)
 * @see #select(ProductGoodsShelve, int, int)
 * @see #selectCount(ProductGoodsShelve)
 * @see #selectById(Integer)
 */
public interface ProductGoodsShelveDao {
    /**
     * 新增成品货架
     *
     * @param productGoodsShelve 成品货架实体类对象
     * @return 受影响的行数
     */
    int add(ProductGoodsShelve productGoodsShelve);

    /**
     * 修改成品货架
     *
     * @param productGoodsShelve 成品货架实体类对象
     * @return 受影响的行数
     */
    int update(ProductGoodsShelve productGoodsShelve);

    /**
     * 查询成品货架列表
     *
     * @param productGoodsShelve 成品货架对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductGoodsShelve> select(@Param("productGoodsShelve") ProductGoodsShelve productGoodsShelve, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productGoodsShelve 成品货架对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ProductGoodsShelve productGoodsShelve);

    /**
     * 根据ID查询单个成品货架数据
     * @param productGoodsShelveId 成品货架id
     * @return 成品货架对象
     */
    ProductGoodsShelve selectById(Integer productGoodsShelveId);
}
