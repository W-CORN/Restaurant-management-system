package team.ruike.cim.dao;

import team.ruike.cim.pojo.Chat;

import java.util.List;

public interface ChatDao {
    /**
     * 获取所有消息
     * @return 消息集合
     */
    List<Chat> select();

    /**
     * 获取前十条消息
     * @return 消息集合
     */
    List<Chat> selectByTop10();

    /**
     * 新增消息
     * @param chat 消息对象
     * @return 受影响的行数
     */
    int add(Chat chat);
}
