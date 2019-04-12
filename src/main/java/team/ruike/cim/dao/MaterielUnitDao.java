package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.MaterielUnit;

import java.util.List;

/**
 * 单位接口
 *
 * @author 甄立
 * @author 孙天奇
 * @version 1.0
 * @see #selectById(Integer)
 * @see #select(MaterielUnit, int, int)
 * @see #selectCount(MaterielUnit)
 * @see #add(MaterielUnit)
 * @see #update(MaterielUnit)
 */
public interface MaterielUnitDao {
    /**
     * 新增单位
     *
     * @param materielUnit 单位实体类对象
     * @return 受影响的行数
     */
    int add(MaterielUnit materielUnit);

    /**
     * 修改单位
     *
     * @param materielUnit 单位实体类对象
     * @return 受影响的行数
     */
    int update(MaterielUnit materielUnit);

    /**
     * 查询单位
     *
     * @param materielUnit 单位对象(作为查询条件)
     * @param pageNo       要查询的页码
     * @param pageSize     页面数据大小
     * @return 单位对象集合
     */
    List<MaterielUnit> select(@Param("materielUnit") MaterielUnit materielUnit, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param materielUnit 单位对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(MaterielUnit materielUnit);

    /**
     * 根据ID查询单个单位数据
     *
     * @param materielUnitId 单位id
     * @return 单位对象
     */
    MaterielUnit selectById(Integer materielUnitId);
}
