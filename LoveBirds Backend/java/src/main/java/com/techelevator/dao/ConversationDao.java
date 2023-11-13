package com.techelevator.dao;

import com.techelevator.model.Conversation;

import java.util.List;


public interface ConversationDao {

    List<Conversation> getAllUserConversations(int profileId);

    void createConversation(Conversation conversation, int conversationId);

    void deleteConversation(int conversationId);

}
