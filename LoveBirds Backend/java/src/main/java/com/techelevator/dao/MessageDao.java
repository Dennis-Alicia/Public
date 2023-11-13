package com.techelevator.dao;

import com.techelevator.model.Message;

import java.util.List;


public interface MessageDao {

    //getAllUserMessages currently not in use.
    List<Message> getAllUserMessages(int profileId);

    List<Message> getMessagesByConversationId(int conversationId);

    void createMessage(Message message, int messageId);

    void deleteMessage(int messageId);
}
