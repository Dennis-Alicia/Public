package com.techelevator.dao;

import com.techelevator.model.Like;

import java.util.List;

public interface LikeDao {

    List<Like> getAllRelevantLikes(int profileId);

    void createLike(Like like, int id);

    void deleteLike(int id);

}
