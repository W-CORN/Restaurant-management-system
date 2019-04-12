package team.ruike.cim.websocket;

/**
 * 消息辅助类
 */
public class MessageUtils {
    private Integer type;//类型
    private Integer userId;//接收人0：所有人
    private String date;//发送时间
    private Integer senderUserId;//发送人0：系统
    private String message;//消息信息

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(Integer senderUserId) {
        this.senderUserId = senderUserId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
