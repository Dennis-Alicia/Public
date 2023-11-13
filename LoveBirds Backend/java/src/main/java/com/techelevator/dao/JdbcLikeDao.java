package com.techelevator.dao;


import com.techelevator.model.Like;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcLikeDao implements LikeDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcLikeDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Like> getAllRelevantLikes(int profileId){
        List<Like> likes = new ArrayList<>();

        String sql = "SELECT * " +
                "FROM likes " +
                "WHERE profile_id OR liked_profile_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, profileId);
        while(results.next()){
            Like like = mapRowToLike(results);
            likes.add(like);
        }
        return likes;
    }

    @Override
    public void createLike(Like like, int id){

        String sql = "INSERT INTO likes (profile_id, liked_profile_id ) " +
                "VALUES (?,?);";

        jdbcTemplate.update(sql, id, like.getProfileId(), like.getLikedProfileId());
    }

    @Override
    public void deleteLike(int id){

        String sql = "DELETE * " +
                "FROM likes " +
                "WHERE id = ?;";

        jdbcTemplate.update(sql, id);
    }


    private Like mapRowToLike(SqlRowSet rowSet){
        Like newLike = new Like();
        newLike.setId(rowSet.getInt("id"));
        newLike.setProfileId(rowSet.getInt("profile_id"));
        newLike.setLikedProfileId(rowSet.getInt("liked_profile_id"));

        return newLike;
    }
}
