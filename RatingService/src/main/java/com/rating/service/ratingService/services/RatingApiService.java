package com.rating.service.ratingService.services;

import com.hotel.service.HotelService.reponse.ApiResponse;
import com.rating.service.ratingService.dtos.RatingDTO;

import java.util.List;

public interface RatingApiService {

    ApiResponse<RatingDTO> ratingSaveDataHandlerResponse(RatingDTO ratingDTO);

    ApiResponse<List<RatingDTO>> generateAllRatingDataHandlerResponse();

    ApiResponse<List<RatingDTO>> generateRatingByUserDataHandlerResponse(String userId);

    ApiResponse<List<RatingDTO>> generateRatingByHotelDataHandlerResponse(String hotelId);
}
