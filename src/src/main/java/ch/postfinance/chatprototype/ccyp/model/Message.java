package ch.postfinance.chatprototype.ccyp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Setter
@Getter
public class Message {
    private Long id;
    private String content;
    private String sender;
    private MessageType type;
    private Date createdAt;
    private Date updatedAt;
    private MessageStatus status;
    private Map<String, Integer> reactions;
    private Long replyToMessageId;
    private boolean isEdited;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    public enum MessageStatus {
        SENT,
        DELIVERED,
        READ
    }
}
