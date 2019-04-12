package team.ruike.cim.service;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Materiel;
import team.ruike.cim.pojo.MaterielTypeLevelA;
import team.ruike.cim.pojo.MaterielTypeLevelB;
import team.ruike.cim.pojo.MaterielUnit;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 物料管理业务接口
 * @author 张振国
 * @version 1.0
 * @see #getMaterielList(Materiel, Pager)
 * @see #addMaterielList(Materiel)
 * @see #getMaterielTypeLevelA()
 * @see #getMaterielTypeLevelB()
 * @see #getMaterielUnit()
 * @see #getMaterielTypeLevelB(MaterielTypeLevelB)
 * @see #delMateriel(Materiel)
 * @see #updateMateriel(Materiel)
 * @see #getMaterielById(Integer)
 */
public interface MaterielService{
    /**
     * 获取物料列表
     * @param materiel 物料对象（查询条件）
     * @param pager 分页辅助类对象
     */
    void getMaterielList(Materiel materiel, Pager<Materiel> pager);

    /**
     * 新增物料
     * @param materiel 物料对象
     * @return 是否成功
     */
    boolean addMaterielList(Materiel materiel);

    /**
     * 获取所有物料一级分类集合
     * @return 所有物料一级分类集合
     */
    List<MaterielTypeLevelA> getMaterielTypeLevelA();
    /**
     * 获取所有物料二级分类集合
     * @return 所有物料二级分类集合
     */
    List<MaterielTypeLevelB> getMaterielTypeLevelB();
    /**
     * 获取所有物料单位集合
     * @return 所有物料单位集合
     */
    List<MaterielUnit> getMaterielUnit();

    /**
     * 根据查询条件获取物料二级分类
     * @param materielTypeLevelB 条件
     * @return 物料二级分类集合
     */
    List<MaterielTypeLevelB> getMaterielTypeLevelB(MaterielTypeLevelB materielTypeLevelB);

    /**
     * 删除物料
     * @param materiel 物料
     * @return 是否成功
     */
    boolean delMateriel(Materiel materiel);

    /**
     * 修改物料信息
     * @param materiel 物料对象
     * @return 是否成功
     */
    boolean updateMateriel(Materiel materiel);

    /**
     * 根据id查询物料
     * @param materielId 物料id
     * @return 物料对象
     */
    Materiel getMaterielById(Integer materielId);

    /**
     * 获取所有物料
     * @return 物料集合
     */
    List<Materiel> selectAllMateriel();
}
