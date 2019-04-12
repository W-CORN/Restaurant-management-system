package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductionStandard;

import java.util.List;

/**
 * 生产品控标准表数据访问接口
 *
 * @author 华中昊
 * @author 华中昊
 * @version 1.0
 * @see #add(ProductionStandard)
 * @see #update(ProductionStandard)
 * @see #select(ProductionStandard, int, int)
 * @see #selectCount(ProductionStandard)
 * @see #selectById(Integer)
 */
public interface ProductionStandardDao {
    /**
     * 新增生产品控标准
     *
     * @param productionStandard 生产品控标准实体类对象
     * @return 受影响的行数
     */
    int add(ProductionStandard productionStandard);

    /**
     * 修改生产品控标准
     *
     * @param productionStandard 生产品控标准实体类对象
     * @return 受影响的行数
     */
    int update(ProductionStandard productionStandard);

    /**
     * 查询生产品控标准列表
     *
     * @param productionStandard 生产品控标准对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductionStandard> select(@Param("productionStandard") ProductionStandard productionStandard, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productionStandard 生产品控标准对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ProductionStandard productionStandard);

    /**
     * 根据ID查询单个生产品控标准数据
     * @param productionStandardId 生产品控标准id
     * @return 生产品控标准对象
     */
    ProductionStandard selectById(Integer productionStandardId);
}
