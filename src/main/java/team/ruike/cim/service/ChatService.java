package team.ruike.cim.service;

import team.ruike.cim.pojo.Chat;

import java.util.List;

/**
 * 聊天记录业务处理接口
 */
public interface ChatService {
    /**
     * 获取前10条记录
     * @return 记录
     */
    List<Chat> getChatTop10();

    int add(Chat chat);
}
