package team.ruike.cim.service;

import team.ruike.cim.pojo.User;

/**
 * 用户业务接口
 * @author 张振国
 * @version 1.0
 * @see #login(User)
 */
public interface UserService {
    /**
     * 登陆业务
     * @param user 用户对象(查询条件)
     * @return 返回查询后的用户对象
     */
    User login(User user);
}
