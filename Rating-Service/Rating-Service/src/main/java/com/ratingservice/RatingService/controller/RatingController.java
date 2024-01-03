package com.ratingservice.RatingService.controller;

import com.ratingservice.RatingService.model.Rating;
import com.ratingservice.RatingService.service.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    public RatingServiceImpl ratingServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating rating1 = ratingServiceImpl.createRating(rating);
        return  new ResponseEntity<Rating>(rating1, HttpStatus.CREATED);
    }

@GetMapping("/create/{id}")
    public ResponseEntity<Rating> getRqatingById(@PathVariable Long id) {
        Rating ratingById = ratingServiceImpl.getRatingById(id);
        return  new ResponseEntity<Rating>(ratingById, HttpStatus.FOUND);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Rating>> getAllRatings(){
        List<Rating> allRatings = ratingServiceImpl.getAllRatings();
        return  new ResponseEntity<List<Rating>>(allRatings,HttpStatus.OK);
    }

}
