package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Profile;

public interface ProfileDao {

    List<Profile> getAllProfiles();

    Profile getProfileByProfileId(int profileId);

    Profile getProfileByUserId(int userId);

    Profile getCurrentProfile(String username);

    void createProfile(Profile profile, String username);

    void updateProfile(Profile profile, int profileId);

    String getUsernameByProfileId(int profileId);

}
