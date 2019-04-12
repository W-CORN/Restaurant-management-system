package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductionLine;

import java.util.List;

/**
 * 生产线表数据访问接口
 *
 * @author 华中昊
 * @author 华中昊
 * @version 1.0
 * @see #add(ProductionLine)
 * @see #update(ProductionLine)
 * @see #select(ProductionLine, int, int)
 * @see #selectCount(ProductionLine)
 * @see #selectById(Integer)
 */
public interface ProductionLineDao {
    /**
     * 新增生产线
     *
     * @param productionLine 生产线实体类对象
     * @return 受影响的行数
     */
    int add(ProductionLine productionLine);

    /**
     * 修改生产线
     *
     * @param productionLine 生产线实体类对象
     * @return 受影响的行数
     */
    int update(ProductionLine productionLine);

    /**
     * 查询生产线列表
     *
     * @param productionLine 生产线对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductionLine> select(@Param("productionLine") ProductionLine productionLine, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productionLine 生产线对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ProductionLine productionLine);

    /**
     * 根据ID查询单个生产线数据
     * @param productionLineId 生产线id
     * @return 生产线对象
     */
    ProductionLine selectById(Integer productionLineId);
}
