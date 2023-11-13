package com.techelevator.controller;

import com.techelevator.dao.ProfileDao;
import com.techelevator.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin
public class ProfileController {

    @Autowired
    private ProfileDao profileDao;

    public ProfileController(ProfileDao profileDao){
        this.profileDao = profileDao;
    }

    @GetMapping(path = {"/profiles"})
    public List<Profile> getAllProfiles() throws ChangeSetPersister.NotFoundException {
        return profileDao.getAllProfiles();
    }

    @GetMapping(path = {"/profiles/{id}"})
    public Profile getProfileByProfileId(@PathVariable int profileId) throws ChangeSetPersister.NotFoundException{
        return profileDao.getProfileByProfileId(profileId);
    }

    @GetMapping(path = {"/account"})
    public Profile getCurrentProfile(Principal principal) throws ChangeSetPersister.NotFoundException{
        return profileDao.getCurrentProfile(principal.getName());
    }

    @PostMapping(path = {"/profiles"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createProfile(@RequestBody Profile profile, Principal principal){
        String username = principal.getName();
        profileDao.createProfile(profile, username);
    }

}
