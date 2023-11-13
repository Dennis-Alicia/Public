package com.techelevator.dao;

import com.techelevator.model.Conversation;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;


@Component
public class JdbcConversationDao implements ConversationDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcConversationDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Conversation> getAllUserConversations(int profileId){
        List<Conversation> conversations = new ArrayList<>();

        String sql = "SELECT * " +
                "FROM conversations " +
                "WHERE profile_id OR receiver_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, profileId);
        while(results.next()){
            Conversation conversation = mapRowToConversation(results);
            conversations.add(conversation);
        }
        return conversations;
    }

    @Override
    public void createConversation(Conversation conversation, int conversationId){

        String sql = "INSERT INTO conversations (conversation_id, profile_id, receiver_id) " +
                "VALUES (?,?,?);";

        jdbcTemplate.update(sql,conversationId, conversation.getProfileId(), conversation.getReceiverId());
    }

    @Override
    public void deleteConversation(int conversationId){

        String sql = "DELETE * " +
                "FROM conversations " +
                "WHERE conversation_id = ?;";

        jdbcTemplate.update(sql, conversationId);
    }


    private Conversation mapRowToConversation(SqlRowSet rowSet){
        Conversation newConversation = new Conversation();
        newConversation.setConversationId(rowSet.getInt("conversation_id"));
        newConversation.setProfileId(rowSet.getInt("profile_id"));
        newConversation.setReceiverId(rowSet.getInt("receiver_id"));

        return newConversation;
    }


}
