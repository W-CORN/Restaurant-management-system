package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Materiel;

import java.util.Date;
import java.util.List;

/**
 * 物料表数据访问接口
 *
 * @author 华中昊
 * @author 王傲祥
 * @version 1.0
 * @see #add(Materiel)
 * @see #update(Materiel)
 * @see #select(Materiel, int, int)
 * @see #selectCount(Materiel)
 * @see #selectById(Integer)
 */
public interface MaterielDao {
    /**
     * 新增物料
     *
     * @param materiel 物料实体类对象
     * @return 受影响的行数
     */
    int add(Materiel materiel);

    /**
     * 修改物料
     *
     * @param materiel 物料实体类对象
     * @return 受影响的行数
     */
    int update(Materiel materiel);

    /**
     * 查询物料列表
     *
     * @param materiel 物料对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 订单对象集合
     */
    List<Materiel> select(@Param("materiel") Materiel materiel, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param materiel 物料对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Materiel materiel);

    /**
     * 根据ID查询单个物料数据
     * @param materielId 物料id
     * @return 物料对象
     */
    Materiel selectById(Integer materielId);

    /**
     * 根据purchase_date 与 Bid查询物料
     * @return
     */
    List<Materiel> getMaterielByDate(@Param("materielTypeLevelBId") Integer materielTypeLevelBId,@Param("date") Date date);
}
