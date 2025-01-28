package ch.postfinance.chatprototype.ccyp.web.rest;

import ch.postfinance.chatprototype.ccyp.model.Message;
import ch.postfinance.chatprototype.ccyp.model.enums.MessageType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import java.util.Objects;

@Slf4j
@Controller
public class ChatController {
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public Message sendMessage(Message chatMessage) {
        chatMessage.setType(MessageType.CHAT);
        log.info("Message with id: '{}' and content: '{}' was sent", chatMessage.getId(), chatMessage.getContent());
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public Message addUser(Message chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        Objects.requireNonNull(headerAccessor.getSessionAttributes()).put("username", chatMessage.getSender());
        chatMessage.setType(MessageType.JOIN);
        chatMessage.setContent(chatMessage.getSender() + " joined the chat");
        log.info("User '{}' joined the chat", chatMessage.getSender());
        return chatMessage;
    }

    @MessageMapping("/chat.leaveUser")
    @SendTo("/topic/public")
    public Message leaveUser(Message chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        Objects.requireNonNull(headerAccessor.getSessionAttributes()).put("username", chatMessage.getSender());
        chatMessage.setType(MessageType.LEAVE);
        chatMessage.setContent(chatMessage.getSender() + " left the chat");
        log.info("User '{}' left the chat", chatMessage.getSender());
        return chatMessage;
    }
}
