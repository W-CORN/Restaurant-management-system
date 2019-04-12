package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import team.ruike.cim.dao.ChatDao;
import team.ruike.cim.pojo.Chat;
import team.ruike.cim.pojo.User;
import team.ruike.cim.service.ChatBranchService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 聊天记录业务
 */
@Service("chatBranchService")
public class ChatBranchServiceImpl implements ChatBranchService {

    @Resource
    private ChatDao chatDao;

    @Override
    public List<Chat> selectChatByNow() {
        return chatDao.select();
    }

}
