package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ChatDao;
import team.ruike.cim.pojo.Chat;
import team.ruike.cim.service.ChatService;

import javax.annotation.Resource;
import java.util.List;
@Service("chatService")
public class ChatServiceImpl implements ChatService{
    @Resource
    private ChatDao chatDao;
    @Override
    public List<Chat> getChatTop10() {
        return chatDao.selectByTop10();
    }

    @Override
    public int add(Chat chat) {
        return chatDao.add(chat);
    }
}
