package team.ruike.cim.service;

import team.ruike.cim.pojo.Chat;

import java.util.List;

/**
 * 聊天记录业务处理分支接口
 */
public interface ChatBranchService {

    /**
     * 查询今天聊天记录
     *
     * @return 记录
     */
    List<Chat> selectChatByNow();
}
