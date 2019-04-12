package team.ruike.cim.websocket;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import net.sf.json.JSONObject;
import org.springframework.web.socket.*;
import team.ruike.cim.pojo.Chat;
import team.ruike.cim.pojo.Function;
import team.ruike.cim.pojo.Jurisdiction;
import team.ruike.cim.pojo.User;
import team.ruike.cim.service.ChatService;

import javax.annotation.Resource;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class WebSocket implements WebSocketHandler {
    @Resource
    private ChatService chatService;
    /**
     * 用来存储所有用户的连接
     */
    private static final Map<User,WebSocketSession> webSockSession=new HashMap<User,WebSocketSession>();
    private static List<User> users=new ArrayList<User>();
    /**
     * 连接成功方法
     * @param Session Session客户端唯一
     * @throws Exception 处理错误
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession Session) throws Exception {
        User user = (User) Session.getAttributes().get("user");
        users.add(user);
        System.out.println("连接成功！！");
        webSockSession.put(user, Session);
        OutPut();
        //发送聊天记录
        List<Chat> chatTop10 = chatService.getChatTop10();
        MessageUtils messageUtils=new MessageUtils();
        messageUtils.setDate("3:50");
        messageUtils.setType(4);
        messageUtils.setUserId(user.getUserId());
        messageUtils.setSenderUserId(0);
        messageUtils.setMessage(JSONArray.toJSONString(chatTop10, SerializerFeature.DisableCircularReferenceDetect));
        Session.sendMessage(new TextMessage(JSONArray.toJSONString(messageUtils,SerializerFeature.DisableCircularReferenceDetect)));
    }

    /**
     * 发送上下线通知
     */
    public void OutPut(){
        //发送上下线通知
        MessageUtils messageUtils=new MessageUtils();
        messageUtils.setDate("3:50");
        messageUtils.setType(3);
        messageUtils.setUserId(0);
        messageUtils.setSenderUserId(0);
        messageUtils.setMessage(JSONArray.toJSONString(users));
        sendMessageToUsers(new TextMessage(JSONArray.toJSONString(messageUtils)));
    }
    /**
     * 接收消息处理方法
     * @param webSocketSession Session客户端唯一
     * @param webSocketMessage webSocketMessage
     * @throws Exception 处理错误
     */
    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {
//        sendMessageToUsers(new TextMessage(webSocketMessage.getPayload() + ""));
        MessageUtils messageUtils=null;
        JSONObject jsonObject=JSONObject.fromObject(webSocketMessage.getPayload() + "");
        messageUtils= (MessageUtils) (JSONObject.toBean(jsonObject, MessageUtils.class));
        if (messageUtils.getType()==1){
            chat(messageUtils.getMessage(),webSocketSession);
        }
    }

    /**
     * 发送聊天消息
     * @param mes 内容
     */
    private void chat(String mes,WebSocketSession webSocketSession) throws IOException {
        User user = (User) webSocketSession.getAttributes().get("user");
        //存入数据库
        Chat chat=new Chat();
        chat.setStatus(0);
        chat.setMessage(mes);
        chat.setUser(user);
        chatService.add(chat);
        SimpleDateFormat sdf =   new SimpleDateFormat( " HH:mm:ss " );
        String text="{\"type\":1,\"user\":"+JSON.toJSONString(user)+",\"mes\":\""+mes+"\",\"date\":\""+sdf.format(new Date())+"\"}";
        for (WebSocketSession socketSession : webSockSession.values()) {
            User user1 = (User) socketSession.getAttributes().get("user");
            if (user1.getUserId()!=user.getUserId()){
                if (socketSession.isOpen()) {
                    socketSession.sendMessage(new TextMessage(text));
                }
            }
        }
    }

    /**
     * 出现错误调用方法
     * @param webSocketSession Session客户端唯一
     * @param throwable 错误对象
     * @throws Exception 处理错误
     */
    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {
        System.out.println("错误");
        if (webSocketSession.isOpen()) {//如果连接打开则关闭
            webSocketSession.close();
        }
    }

    /**
     * 关闭连接调用方法
     * @param webSocketSession 连接对象
     * @param closeStatus 状态
     * @throws Exception 处理错误
     */
    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {
        System.out.println("链接关闭......" + closeStatus.toString());
        User user = (User) webSocketSession.getAttributes().get("user");
        users.remove(user);
        OutPut();
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
    /**
     * 给所有在线用户发送消息
     * @param message 消息
     */
    public void sendMessageToUsers(TextMessage message) {
        for (WebSocketSession socketSession : webSockSession.values()) {
            try {
                if (socketSession.isOpen()) {
                    socketSession.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 给某个用户发送消息
     * @param userId 用户id
     * @param message 消息
     */
    public void sendMessageToUser(Integer userId, TextMessage message) {
        for (WebSocketSession socketSession : webSockSession.values()) {
            User user = (User) socketSession.getAttributes().get("user");
            if (user!=null&&user.getUserId()==userId) {
                try {
                    if (socketSession.isOpen()) {
                        socketSession.sendMessage(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
