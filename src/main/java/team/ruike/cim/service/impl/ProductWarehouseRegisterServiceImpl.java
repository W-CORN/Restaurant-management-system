package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ProductWarehouseOutRegisterItemDao;
import team.ruike.cim.dao.ProductWarehouseRegisterDao;
import team.ruike.cim.dao.ProductWarehouseRegisterItemDao;
import team.ruike.cim.pojo.ProductWarehouseOutRegisterItem;
import team.ruike.cim.pojo.ProductWarehouseRegister;
import team.ruike.cim.pojo.ProductWarehouseRegisterItem;
import team.ruike.cim.service.ProductWarehouseRegisterService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;

/**
 * 成品库入库登记业务实现类
 */
@Service("productWarehouseRegisterService")
public class ProductWarehouseRegisterServiceImpl implements ProductWarehouseRegisterService {
    @Resource
    private ProductWarehouseRegisterItemDao productWarehouseRegisterItemDao;


    /**
     * 新增入库记录
     * @param productWarehouseRegisterItem 成品入库记录项
     * @return
     */
    @Override
    public int addProductWarehouseRegisterItem(ProductWarehouseRegisterItem productWarehouseRegisterItem) {
        return 0;
    }

    /**
     * 修改入库记录
     * @param productWarehouseRegisterItem 成品入库记录项
     * @return
     */
    @Override
    public int updProductWarehouseRegisterItem(ProductWarehouseRegisterItem productWarehouseRegisterItem) {
        return 0;
    }

    /**
     * 查询所有的入库记录项
     * @param productWarehouseRegisterItem 成品入库记录项
     * @param pager 分页辅助类
     */
    @Override
    public void getProductWarehouseRegisterItem(ProductWarehouseRegisterItem productWarehouseRegisterItem, Pager<ProductWarehouseRegisterItem> pager) {
        int number = productWarehouseRegisterItemDao.selectCount(productWarehouseRegisterItem);
        List<ProductWarehouseRegisterItem> productWarehouseRegisterItemList=productWarehouseRegisterItemDao.select(productWarehouseRegisterItem,(pager.getCurrentPage()-1)*pager.getPageSize(),pager.getPageSize());
        pager.setList(productWarehouseRegisterItemList);
    }

    /**
     * 根据仓库id查询所有出库项
     * @param productWarehouseRegisterItem
     * @param pager
     */
    @Override
    public void getItemByProductWarehouseId(ProductWarehouseRegisterItem productWarehouseRegisterItem, Pager<ProductWarehouseRegisterItem> pager) {
        int number = productWarehouseRegisterItemDao.selectCount(productWarehouseRegisterItem);
        List<ProductWarehouseRegisterItem> productWarehouseRegisterItemList=productWarehouseRegisterItemDao.selectByWarehouseId(productWarehouseRegisterItem,(pager.getCurrentPage()-1)*pager.getPageSize(),pager.getPageSize());
        pager.setList(productWarehouseRegisterItemList);
    }
}
