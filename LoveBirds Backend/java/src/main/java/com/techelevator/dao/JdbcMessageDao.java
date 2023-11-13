package com.techelevator.dao;

import com.techelevator.model.Message;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;


@Component
public class JdbcMessageDao implements MessageDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcMessageDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Message> getAllUserMessages(int profileId){
        List<Message> messages = new ArrayList<>();

        String sql = "SELECT * " +
                "FROM messages m " +
                "JOIN conversations c ON m.conversation_id = c.conversation_id " +
                "WHERE c.profile_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, profileId);
        while(results.next()){
            Message message = mapRowToMessages(results);
            messages.add(message);
        }
        return messages;
    }

    @Override
    public List<Message> getMessagesByConversationId(int conversationId){
        List<Message> messages = new ArrayList<>();

        String sql = "SELECT * " +
                "FROM messages m " +
                "JOIN conversations c ON m.conversation_id = c.conversation_id " +
                "WHERE c.conversation_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, conversationId);
        while(results.next()){
            Message message = mapRowToMessages(results);
            messages.add(message);
        }
        return messages;
    }

    @Override
    public void createMessage(Message message, int messageId){

        String sql = "INSERT INTO messages (message_id, conversation_id, message_content) " +
                "VALUES (?,?,?);";

        jdbcTemplate.update(sql, messageId, message.getConversationId(), message.getMessageContent());
    }

    @Override
    public void deleteMessage(int messageId){

        String sql = "DELETE * " +
                "FROM messages " +
                "WHERE message_id = ?;";

        jdbcTemplate.update(sql, messageId);
    }


    private Message mapRowToMessages(SqlRowSet rowSet){
        Message newMessage = new Message();
        newMessage.setMessageId(rowSet.getInt("message_id"));
        newMessage.setConversationId(rowSet.getInt("conversation_id"));
        newMessage.setMessageContent(rowSet.getString("message_content"));

        return newMessage;
    }

}
