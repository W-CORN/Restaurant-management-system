package team.ruike.cim.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.ruike.cim.pojo.Chat;
import team.ruike.cim.service.ChatBranchService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 聊天信息
 *
 * @author 甄立
 * @version 1.0
 */
@Controller
public class ChatController {

    @Resource
    private ChatBranchService chatBranchService;

    @RequestMapping("chat.do")
    @ResponseBody
    public String chat() {
        List<Chat> chatList = chatBranchService.selectChatByNow();
        return JSON.toJSONString(chatList);
    }


}
