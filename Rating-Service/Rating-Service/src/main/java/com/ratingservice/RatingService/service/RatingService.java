package com.ratingservice.RatingService.service;

import com.ratingservice.RatingService.model.Rating;

import java.util.List;

public interface RatingService {
    public Rating createRating(Rating rating);
    public  Rating getRatingById(Long id);
    public List<Rating> getAllRatings();
}
