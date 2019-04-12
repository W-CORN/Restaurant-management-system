package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.StoreDao;
import team.ruike.cim.pojo.Store;
import team.ruike.cim.service.StoreService;
import team.ruike.cim.util.ArchivesLog;
import team.ruike.cim.util.GenerateNumber;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * 门店业务类
 *
 * @author 甄立
 * @version 1.0
 */
@Service("storeService")
public class StoreServiceImpl implements StoreService {

    @Resource
    private StoreDao storeDao;

    public void queryStore(Store store, Pager<Store> pager) {
        Integer count = storeDao.selectCount(store);
        pager.setTotalRecord(count);
        List<Store> storeList = storeDao.select(store, (pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize());
        pager.setList(storeList);
    }

    public Store queryStoreById(Integer storeId) {
        Store store = null;
        if (storeId != null && storeId > 0) {
            store = storeDao.selectById(storeId);
        }
        return store;
    }

    @ArchivesLog(operationType = "添加操作", operationName = "添加门店")
    public Store addStore(Store store) {
        String storeNo = GenerateNumber.getGenerateNumber().getRandomFileName();
        store.setStoreNo(storeNo);
        storeDao.add(store);
        return store;
    }

    @ArchivesLog(operationType = "修改操作", operationName = "修改门店")
    public void updateStoreById(Store store) {
        if (store == null) {
            throw new NullPointerException("store not is null");
        }
        if (store.getStoreId() == null | store.getStoreId() <= 0) {
            throw new NullPointerException("storeId not is null");
        }
        storeDao.update(store);
    }

    @ArchivesLog(operationType = "删除操作", operationName = "删除门店")
    public void deleteStoreById(final Integer storeId) {
        if (storeId != null && storeId > 0) {
            storeDao.hiddenById(storeId);
        } else {
            throw new NullPointerException("storeId not is null");
        }

    }

    @Override
    public List<Store> queryAllStore() {
        return storeDao.selectAll();
    }
}
