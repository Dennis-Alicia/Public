package com.techelevator.dao;

import com.techelevator.model.Profile;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProfileDao implements ProfileDao{

    private JdbcTemplate jdbcTemplate;
    private UserDao userDao;

    public JdbcProfileDao(JdbcTemplate jdbcTemplate, UserDao userDao){
        this.jdbcTemplate = jdbcTemplate;
        this.userDao = userDao;
    }

    @Override
    public List<Profile> getAllProfiles(){
        List<Profile> profiles = new ArrayList<>();

        String sql = "SELECT * " +
                "FROM profiles;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Profile profile = mapRowToProfile(results);
            profiles.add(profile);
        }
        return profiles;
    }

    @Override
    public Profile getProfileByProfileId(int profileId){
        Profile profile = new Profile();

        String sql = "SELECT * " +
                "FROM profiles " +
                "WHERE profile_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, profileId);
        if(results.next()){
            profile = mapRowToProfile(results);
        }
        return profile;
    }

    @Override
    public Profile getProfileByUserId(int userId){
        Profile profile = new Profile();

        String sql = "SELECT * " +
                "FROM profiles " +
                "WHERE user_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        if(results.next()){
            profile = mapRowToProfile(results);
        }
        return profile;
    }

    @Override
    public Profile getCurrentProfile(String username){
        Profile currentProfile = new Profile();

        String sql = "SELECT * " +
                "FROM profiles p " +
                "JOIN users u ON p.user_id = u.user_id " +
                "WHERE u.username = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, username);
        if(results.next()){
            currentProfile = mapRowToProfile(results);
        }
        return currentProfile;
    }

    @Override
    public String getUsernameByProfileId(int profileId){
        String username;

        username = jdbcTemplate.queryForObject("SELECT username " +
                    "FROM users u " +
                    "JOIN profiles p ON u.user_id = p.user_id " +
                    "WHERE p.profile_id = ?;", String.class);
        return username;
    }

    public void createProfile(Profile profile, String username){
        int id = userDao.findIdByUsername(username);

        String sql = "INSERT INTO profiles (user_id, first_name, last_name, age, location, sex, biography, favorite_food, profile_image) " +
                "VALUES (?,?,?,?,?,?,?,?,?);";

        jdbcTemplate.update(sql, profile.getUserId(), profile.getFirstName(), profile.getLastName(), profile.getAge(), profile.getSex(), profile.getLocation(), profile.getBiography(), profile.getFavoriteFood(), profile.getProfileImage());
    }

    @Override
    public void updateProfile(Profile profile, int profileId){

        String sql = "UPDATE profile " +
                "SET fist_name = ?, last_name = ?, age = ?, location = ?, sex = ?, biography = ?, favorite_food = ?, profile_image = ? " +
                "WHERE profile_id = ?;";

        jdbcTemplate.update(sql, profile.getFirstName(), profile.getLastName(), profile.getAge(), profile.getLocation(), profile.getSex(), profile.getBiography(), profile.getFavoriteFood(), profile.getProfileImage(), profileId);
    }


    private Profile mapRowToProfile(SqlRowSet rowSet) {
        Profile newProfile = new Profile();
        newProfile.setProfileId(rowSet.getInt("profile_id"));
        newProfile.setUserId(rowSet.getInt("user_id"));
        newProfile.setFirstName(rowSet.getString("first_name"));
        newProfile.setLastName(rowSet.getString("last_name"));
        newProfile.setAge(rowSet.getInt("age"));
        newProfile.setLocation(rowSet.getString("location"));
        newProfile.setSex(rowSet.getBoolean("sex"));
        newProfile.setBiography(rowSet.getString("biography"));
        newProfile.setFavoriteFood(rowSet.getString("favorite_food"));
        newProfile.setProfileImage(rowSet.getString("profile_image"));

        return newProfile;
    }
}
