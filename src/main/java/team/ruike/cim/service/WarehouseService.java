package team.ruike.cim.service;

import team.ruike.cim.pojo.User;
import team.ruike.cim.pojo.Warehouse;
import team.ruike.cim.util.Pager;

import java.util.List;

public interface WarehouseService {
    /**
     * 查询所有物料仓库
     * @return
     */
     List<Warehouse> getWareHouses(Warehouse warehouse);

    /**
     * 添加物料仓库
     * @param warehouse
     * @return
     */
     int addWareHouse(Warehouse warehouse);

    /**
     * 修改物料仓库
     * @param warehouse
     * @return
     */
     int updWareHouse(Warehouse warehouse);

    /**
     * 查询所有用户
     * @param user
     * @return
     */
     List<User> getUser(User user);
}
