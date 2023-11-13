package com.techelevator.controller;

import com.techelevator.dao.ConversationDao;
import com.techelevator.model.Conversation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ConversationController {

    @Autowired
    private ConversationDao conversationDao;

    public ConversationController(ConversationDao conversationDao){
        this.conversationDao = conversationDao;
    }

    @GetMapping(path = {"/conversations"})
    public List<Conversation> getAllUserConversations(@PathVariable int profileId) throws ChangeSetPersister.NotFoundException{
        return conversationDao.getAllUserConversations(profileId);
    }

    @PostMapping(path = {"/conversations"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createConversation(@RequestBody Conversation conversation, @PathVariable int conversationId){
        conversationDao.createConversation(conversation, conversationId);
    }

    @DeleteMapping(path = {"/conversations"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteConversation(@PathVariable int conversationId){
        conversationDao.deleteConversation(conversationId);
    }

}
