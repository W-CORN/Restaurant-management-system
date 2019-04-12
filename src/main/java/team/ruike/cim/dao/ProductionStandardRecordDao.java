package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ProductionStandardRecord;
import team.ruike.cim.pojo.ProductionStandardRecord;

import java.util.List;

/**
 * 物料品控评估记录表数据访问接口
 *
 * @author 华中昊
 * @author 华中昊
 * @version 1.0
 * @see #add(ProductionStandardRecord)
 * @see #update(ProductionStandardRecord)
 * @see #select(ProductionStandardRecord, int, int)
 * @see #selectCount(ProductionStandardRecord)
 * @see #selectById(Integer)
 */
public interface ProductionStandardRecordDao {
    /**
     * 新增物料品控评估记录
     *
     * @param productionStandardRecord 物料品控评估记录实体类对象
     * @return 受影响的行数
     */
    int add(ProductionStandardRecord productionStandardRecord);

    /**
     * 修改物料品控评估记录
     *
     * @param productionStandardRecord 物料品控评估记录实体类对象
     * @return 受影响的行数
     */
    int update(ProductionStandardRecord productionStandardRecord);

    /**
     * 查询物料品控评估记录列表
     *
     * @param productionStandardRecord 物料品控评估记录对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<ProductionStandardRecord> select(@Param("productionStandardRecord") ProductionStandardRecord productionStandardRecord, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param productionStandardRecord 物料品控评估记录对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ProductionStandardRecord productionStandardRecord);

    /**
     * 根据ID查询单个物料品控评估记录数据
     * @param productionStandardRecordId 物料品控评估记录id
     * @return 物料品控评估记录对象
     */
    ProductionStandardRecord selectById(Integer productionStandardRecordId);
}
