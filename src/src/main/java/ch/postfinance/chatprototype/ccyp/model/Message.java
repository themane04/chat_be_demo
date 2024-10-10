package ch.postfinance.chatprototype.ccyp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {
    private String content;
    private String sender;
    private MessageType type;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
