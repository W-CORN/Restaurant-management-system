package team.ruike.cim.service;

import team.ruike.cim.pojo.Store;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 门店业务接口
 *
 * @author 甄立
 * @version 1.0
 */
public interface StoreService {
    /**
     * 查询门店数据
     *
     * @param store 查询条件
     * @param pager 分页辅助类
     */
    void queryStore(Store store, Pager<Store> pager);

    /**
     * 根据ID查询门店数据
     *
     * @param storeId 门店ID
     * @return 门店对象
     */
    Store queryStoreById(Integer storeId);


    /**
     * 添加门店
     * @param store 门店对象
     * @return 新的门店
     */
    Store addStore(Store store);


    /**
     * 根据ID修改门店信息
     *
     * @param store 修改信息
     */
    void updateStoreById(Store store);


    /**
     * 根据ID删除门店信息
     *
     * @param storeId 门店ID
     */
    void deleteStoreById(Integer storeId);


    /**
     * 查询所有门店
     *
     * @return 门店集合
     */
    List<Store> queryAllStore();


}
