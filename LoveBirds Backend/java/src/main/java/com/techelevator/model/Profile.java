package com.techelevator.model;

public class Profile {
    private int profileId;
    private int userId;
    private String firstName;
    private String lastName;
    private int age;
    private boolean sex;
    private String location;
    private String biography;
    private String favoriteFood;
    private String profileImage;

    //getters
    public int getProfileId(){return profileId;}
    public int getUserId(){return userId;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getAge(){return age;}
    public String getLocation(){return location;}
    public boolean getSex(){return sex;}
    public String getBiography(){return biography;}
    public String getFavoriteFood(){return favoriteFood;}
    public String getProfileImage(){return profileImage;}

    //setters
    public void setProfileId(int profileId){
        this.profileId = profileId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setSex(boolean sex){
        this.sex = sex;
    }
    public void setBiography(String biography){
        this.biography = biography;
    }
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }
    public void setProfileImage(String profileImage){
        this.profileImage = profileImage;
    }
}
