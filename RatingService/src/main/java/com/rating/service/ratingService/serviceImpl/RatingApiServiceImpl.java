package com.rating.service.ratingService.serviceImpl;

import com.hotel.service.HotelService.reponse.ApiResponse;
import com.rating.service.ratingService.dtos.RatingDTO;
import com.rating.service.ratingService.entity.Rating;
import com.rating.service.ratingService.repository.RatingRepository;
import com.rating.service.ratingService.services.RatingApiService;
import com.rating.service.ratingService.utility.RatingUtilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RatingApiServiceImpl implements RatingApiService {

    private final RatingRepository ratingRepository;

    @Override
    public ApiResponse<RatingDTO> ratingSaveDataHandlerResponse(RatingDTO ratingDTO) {
        Rating rating = RatingUtilityService.convertDtoToRating(ratingDTO, new Rating());
        return new ApiResponse<>(RatingUtilityService.convertRatingToDTO(ratingRepository.save(rating), ratingDTO));
    }

    @Override
    public ApiResponse<List<RatingDTO>> generateAllRatingDataHandlerResponse() {
        List<Rating> ratingList = ratingRepository.findAll();
        List<RatingDTO> ratingDTOS = ratingList.stream().map(rating -> RatingUtilityService.convertRatingToDTO(rating, new RatingDTO())).collect(Collectors.toList());
        return new ApiResponse<>(ratingDTOS);
    }

    @Override
    public ApiResponse<List<RatingDTO>> generateRatingByUserDataHandlerResponse(String userId) {
        List<Rating> ratingList = ratingRepository.findByUserId(userId);
        List<RatingDTO> ratingDTOS = ratingList.stream().map(rating -> RatingUtilityService.convertRatingToDTO(rating, new RatingDTO())).collect(Collectors.toList());
        return new ApiResponse<>(ratingDTOS);
    }

    @Override
    public ApiResponse<List<RatingDTO>> generateRatingByHotelDataHandlerResponse(String hotelId) {
        List<Rating> ratingList = ratingRepository.findByHotelId(hotelId);
        List<RatingDTO> ratingDTOS = ratingList.stream().map(rating -> RatingUtilityService.convertRatingToDTO(rating, new RatingDTO())).collect(Collectors.toList());
        return new ApiResponse<>(ratingDTOS);
    }
}
