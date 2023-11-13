package com.techelevator.controller;

import com.techelevator.dao.LikeDao;
import com.techelevator.model.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LikeController {

    @Autowired
    private LikeDao likeDao;

    public LikeController(LikeDao likeDao){
        this.likeDao = likeDao;
    }

    @GetMapping(path = {"/likes"})
    public List<Like> getAllRelevantLikes(@PathVariable int profileId) throws ChangeSetPersister.NotFoundException{
        return likeDao.getAllRelevantLikes(profileId);
    }

    @PostMapping(path = {"/likes"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createLike(@RequestBody Like like, @PathVariable int id){
        likeDao.createLike(like, id);
    }

    @DeleteMapping(path = {"/likes"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteLike(@PathVariable int id){
        likeDao.deleteLike(id);
    }
}
