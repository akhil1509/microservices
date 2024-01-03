package com.ratingservice.RatingService.service;

import com.ratingservice.RatingService.exception.ResourceNotFoundException;
import com.ratingservice.RatingService.model.Rating;
import com.ratingservice.RatingService.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    public RatingRepository ratingRepository;
    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public Rating getRatingById(Long id) {
        return ratingRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No such rating:"+id));
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }
}
