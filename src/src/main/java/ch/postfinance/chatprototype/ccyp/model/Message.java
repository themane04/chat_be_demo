package ch.postfinance.chatprototype.ccyp.model;

import ch.postfinance.chatprototype.ccyp.model.enums.MessageStatus;
import ch.postfinance.chatprototype.ccyp.model.enums.MessageType;
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
}
