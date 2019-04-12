package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.UserDao;
import team.ruike.cim.dao.WarehouseDao;
import team.ruike.cim.pojo.User;
import team.ruike.cim.pojo.Warehouse;
import team.ruike.cim.service.WarehouseService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 仓库业务实现
 */
@Service("warehouseService")
public class WarehouseServiceImpl implements WarehouseService {
    @Resource
    private WarehouseDao warehouseDao;
    @Resource
    private UserDao userDao;

    /**
     * 查询所有物料仓库
     *
     * @return
     */
    public List<Warehouse> getWareHouses(Warehouse warehouse) {
        List<Warehouse> Warehouses = warehouseDao.select(warehouse, 0, 99);
        return Warehouses;

    }

    /**
     * 添加物料仓库
     *
     * @param warehouse
     * @return
     */
    public int addWareHouse(Warehouse warehouse) {
        if (warehouse != null && warehouse.getUser() != null && warehouse.getUser().getUserId() > 0 && warehouse.getWarehouseName() != "") {
            return warehouseDao.add(warehouse);
        }
        return 0;
    }

    /**
     * 修改物料仓库
     *
     * @param warehouse
     * @return
     */
    public int updWareHouse(Warehouse warehouse) {
        if (warehouse != null && warehouse.getUser() != null && warehouse.getUser().getUserId() > 0 && warehouse.getWarehouseName() != "") {
            return warehouseDao.update(warehouse);
        }
        return 0;
    }

    public List<User> getUser(User user) {
        return userDao.select(user, 0, 99);
    }
}
