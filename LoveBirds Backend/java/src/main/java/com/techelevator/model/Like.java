package com.techelevator.model;

public class Like {
    private int id;
    private int profileId;
    private int likedProfileId;

    //getters
    public int getId(){return id;}
    public int getProfileId(){return profileId;}
    public int getLikedProfileId(){return likedProfileId;}

    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setProfileId(int profileId){
        this.profileId = profileId;
    }
    public void setLikedProfileId(int likedProfileId){
        this.likedProfileId = likedProfileId;
    }
}
