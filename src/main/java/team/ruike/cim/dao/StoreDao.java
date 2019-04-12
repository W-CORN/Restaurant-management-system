package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Store;

import java.util.List;

/**
 * 门店用户表表数据访问接口
 *
 * @author 孙天奇
 * @author 王傲祥
 * @version 1.0
 */
public interface StoreDao {
    /**
     * 新增门店用户表
     *
     * @param store 门店用户表实体类对象
     * @return 受影响的行数
     */
    int add(Store store);

    /**
     * 修改合同订单
     *
     * @param store 门店用户表实体类对象
     * @return 受影响的行数
     */
    int update(Store store);

    /**
     * 查询门店用户表
     *
     * @param store 门店用户表对象(作为查询条件)
     * @param pageNo        要查询的页码
     * @param pageSize      页面数据大小
     * @return 门店用户表对象集合
     */
    List<Store> select(@Param("store") Store store, @Param("begin") int pageNo, @Param("pagesize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param store 门店用户表对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Store store);

    /**
     * 根据ID查询单个门店用户表数据
     * @param storeId 门店用户表id
     * @return 门店用户表对象
     */
    Store selectById(@Param("storeId")Integer storeId);


    /**
     * 根据id 隐藏删除
     * @param storeId
     */
    void hiddenById(@Param("storeId")Integer storeId);

    /**
     * 查询所有门店
     * @return 门店集合
     */
    List<Store> selectAll();
}
