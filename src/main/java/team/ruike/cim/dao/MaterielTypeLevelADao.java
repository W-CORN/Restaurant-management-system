package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.MaterielTypeLevelA;

import java.util.Date;
import java.util.List;

/**
 * 物料一级类别接口
 *
 * @author 甄立
 * @author 孙天奇
 * @version 1.0
 * @see #selectById(Integer)
 * @see #select(MaterielTypeLevelA, int, int)
 * @see #selectCount(MaterielTypeLevelA)
 * @see #update(MaterielTypeLevelA)
 * @see #add(MaterielTypeLevelA)
 */
public interface MaterielTypeLevelADao {
    /**
     * 新增物料一级类别
     *
     * @param materielTypeLevelA 物料一级类别实体类对象
     * @return 受影响的行数
     */
    int add(MaterielTypeLevelA materielTypeLevelA);

    /**
     * 修改物料一级类别
     *
     * @param materielTypeLevelA 物料一级类别实体类对象
     * @return 受影响的行数
     */
    int update(MaterielTypeLevelA materielTypeLevelA);

    /**
     * 查询物料一级类别
     *
     * @param materielTypeLevelA 物料一级类别对象(作为查询条件)
     * @param pageNo             要查询的页码
     * @param pageSize           页面数据大小
     * @return 物料一级类别对象集合
     */
    List<MaterielTypeLevelA> select(@Param("materielTypeLevelA") MaterielTypeLevelA materielTypeLevelA, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param materielTypeLevelA 物料一级类别对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(MaterielTypeLevelA materielTypeLevelA);

    /**
     * 根据ID查询单个物料一级类别数据
     *
     * @param materielTypeLevelAId 物料一级类别id
     * @return 物料一级类别对象
     */
    MaterielTypeLevelA selectById(Integer materielTypeLevelAId);

    /**
     * 查询所有当天的物料一级菜单
     * @return
     */
    List<MaterielTypeLevelA> getMaterielTypeLevelAByDate(Date date);
}
