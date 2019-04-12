package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.MaterielTypeLevelB;

import java.util.Date;
import java.util.List;

/**
 * 物料二级类别接口
 * @author 甄立
 * @author 孙天奇
 * @version 1.0
 * @see #selectById(Integer)
 * @see #select(MaterielTypeLevelB, int, int)
 * @see #selectCount(MaterielTypeLevelB)
 * @see #add(MaterielTypeLevelB)
 * @see #update(MaterielTypeLevelB)
 */
public interface MaterielTypeLevelBDao {
    /**
     * 新增物料二级类别
     *
     * @param materielTypeLevelB 物料二级类别实体类对象
     * @return 受影响的行数
     */
    int add(MaterielTypeLevelB materielTypeLevelB);

    /**
     * 修改物料二级类别
     *
     * @param materielTypeLevelB 物料二级类别实体类对象
     * @return 受影响的行数
     */
    int update(MaterielTypeLevelB materielTypeLevelB);

    /**
     * 查询物料二级类别
     *
     * @param materielTypeLevelB 物料二级类别对象(作为查询条件)
     * @param pageNo             要查询的页码
     * @param pageSize           页面数据大小
     * @return 物料二级类别对象集合
     */
    List<MaterielTypeLevelB> select(@Param("materielTypeLevelB") MaterielTypeLevelB materielTypeLevelB, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param materielTypeLevelB 物料二级类别对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(MaterielTypeLevelB materielTypeLevelB);

    /**
     * 根据ID查询单个物料二级类别数据
     *
     * @param materielTypeLevelBId 物料二级类别id
     * @return 物料二级类别对象
     */
    MaterielTypeLevelB selectById(Integer materielTypeLevelBId);

    /**
     * 根据purchase_date 与 Bid查询物料
     * @param materielTypeLevelAId AId
     * @return
     */
    List<MaterielTypeLevelB> getMaterielTypeLevelBByDate(@Param("materielTypeLevelAId") Integer materielTypeLevelAId,@Param("date")Date date);




}
