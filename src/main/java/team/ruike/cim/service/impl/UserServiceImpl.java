package team.ruike.cim.service.impl;
import org.springframework.stereotype.Service;
import team.ruike.cim.dao.UserDao;
import team.ruike.cim.pojo.User;
import team.ruike.cim.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户业务实现类
 * @author 张振国
 * @version 1.0
 * @see #login(User)
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    /**
     * 登陆业务
     * @param user 用户对象(查询条件)
     * @return 返回查询后的用户对象
     */
    public User login(User user) {
        //判断登陆名和密码不能为空
        if (user!=null && user.getUserName()!=null&&user.getUserName().length()>0
                &&user.getPassword()!=null&&user.getPassword().length()>0){
            List<User> users = userDao.select(user,0,99);
            //判断是否查询到数据与是否是1条数据
            if (users!=null&&users.size()==1){
                return users.get(0);//返回查到的用户对象
            }
        }
        return null;
    }
}
