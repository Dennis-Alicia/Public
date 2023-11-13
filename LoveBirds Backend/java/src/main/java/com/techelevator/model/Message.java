package com.techelevator.model;

public class Message {
    private int messageId;
    private int conversationId;
    private String messageContent;

    //getters
    public int getMessageId(){return messageId;}
    public int getConversationId(){return conversationId;}
    public String getMessageContent(){return messageContent;}

    //setters
    public void setMessageId(int messageId){this.messageId = messageId;}
    public void setConversationId(int conversationId){this.conversationId = conversationId;}
    public void setMessageContent(String messageContent){this.messageContent = messageContent;}
}
