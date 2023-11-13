package com.techelevator.model;

public class Conversation {
    private int conversationId;
    private int profileId;
    private int receiverId;

    //getters
    public int getConversationId(){return conversationId;}
    public int getProfileId(){return profileId;}
    public int getReceiverId(){return receiverId;}

    //setters
    public void setConversationId(int conversationId){
        this.conversationId = conversationId;
    }
    public void setProfileId(int profileId){
        this.profileId = profileId;
    }
    public void setReceiverId(int receiverId){
        this.receiverId = receiverId;
    }
}
