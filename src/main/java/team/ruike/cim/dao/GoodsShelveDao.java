package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.GoodsShelve;

import java.util.List;

/**
 * 货架接口
 *
 * @author 甄立
 * @author 王傲祥
 * @version 1.0
 * @see #select(GoodsShelve, int, int)
 * @see #selectById(Integer)
 * @see #selectCount(GoodsShelve)
 * @see #add(GoodsShelve)
 * @see #update(GoodsShelve)
 */
public interface GoodsShelveDao {


    /**
     * 新增货架
     *
     * @param goodsShelve 货架实体类对象
     * @return 受影响的行数
     */
    int add(GoodsShelve goodsShelve);

    /**
     * 修改货架
     *
     * @param goodsShelve 货架实体类对象
     * @return 受影响的行数
     */
    int update(GoodsShelve goodsShelve);

    /**
     * 查询货架
     *
     * @param goodsShelve 货架对象(作为查询条件)
     * @param pageNo      要查询的页码
     * @param pageSize    页面数据大小
     * @return 货架对象集合
     */
    List<GoodsShelve> select(@Param("goodsShelve") GoodsShelve goodsShelve, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param goodsShelve 货架对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(GoodsShelve goodsShelve);

    /**
     * 根据ID查询单个货架
     *
     * @param goodsShelveId 货架id
     * @return 货架对象
     */
    GoodsShelve selectById(Integer goodsShelveId);

    /**
     * 根据区域id查询空闲货架
     * @param warehouseRegionId
     * @return 空闲货架集合
     */
    List<GoodsShelve> selectByWarehouseRegionId(Integer warehouseRegionId);

    /**
     * 根据区域id 物料id 查询非空货架
     * @param goodsShelve
     * @return
     */
    List<GoodsShelve> selectgods(GoodsShelve goodsShelve);
}
