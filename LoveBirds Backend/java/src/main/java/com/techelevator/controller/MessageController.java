package com.techelevator.controller;

import com.techelevator.dao.MessageDao;
import com.techelevator.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MessageController {

    @Autowired
    private MessageDao messageDao;

    public MessageController(MessageDao messageDao){
        this.messageDao = messageDao;
    }

    @GetMapping(path = {"/conversations/{id}"})
    public List<Message> getMessagesByConversationId(@PathVariable int conversationId) throws ChangeSetPersister.NotFoundException{
        return messageDao.getMessagesByConversationId(conversationId);
    }

    @PostMapping(path = {"/conversations/{id}"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createMessage(@RequestBody Message message, @PathVariable int messageId){
        messageDao.createMessage(message, messageId);
    }

    @DeleteMapping(path = {"/conversations/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteMessage(@PathVariable int messageId){
        messageDao.deleteMessage(messageId);
    }

}
