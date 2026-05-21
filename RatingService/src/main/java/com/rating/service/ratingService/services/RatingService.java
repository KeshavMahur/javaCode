package com.rating.service.ratingService.services;


import com.rating.service.ratingService.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating saveRating(Rating rating);
    List<Rating> getRatingByUserId(String userId);
    List<Rating> getRatingByHotelId(String hotelId);
    List<Rating> findAllRating();
    Rating findByRatingById(String id);
}
