package com.rating.service.ratingService.utility;

import com.rating.service.ratingService.dtos.RatingDTO;
import com.rating.service.ratingService.entity.Rating;

public interface RatingUtilityService {

    static RatingDTO convertRatingToDTO(Rating rating, RatingDTO ratingDTO) {
        ratingDTO.setId(rating.getId());
        ratingDTO.setDescription(rating.getDescription());
        ratingDTO.setUserId(rating.getUserId());
        ratingDTO.setHotelId(rating.getHotelId());
        ratingDTO.setAdded(rating.getAdded());
        return ratingDTO;
    }

    static Rating convertDtoToRating(RatingDTO ratingDTO, Rating rating) {
        rating.setId(ratingDTO.getId());
        rating.setAdded(ratingDTO.getAdded());
        rating.setUserId(ratingDTO.getUserId());
        rating.setHotelId(ratingDTO.getHotelId());
        rating.setDescription(ratingDTO.getDescription());
        return rating;
    }
}
