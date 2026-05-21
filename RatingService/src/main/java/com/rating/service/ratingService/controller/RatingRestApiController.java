package com.rating.service.ratingService.controller;

import com.hotel.service.HotelService.reponse.ApiResponse;
import com.rating.service.ratingService.dtos.RatingDTO;
import com.rating.service.ratingService.services.RatingApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping(path = "rating")
@RequiredArgsConstructor
public class RatingRestApiController {

    private final RatingApiService ratingApiService;

    @PostMapping(path = "save")
    public ApiResponse<RatingDTO> ratingSaveDataHandler(@RequestBody RatingDTO ratingDTO){
        return ratingApiService.ratingSaveDataHandlerResponse(ratingDTO);
    }

    @GetMapping(path = "list")
    public ApiResponse<List<RatingDTO>> getAllRatingDataHandler(){
        return  ratingApiService.generateAllRatingDataHandlerResponse();
    }

    @GetMapping(path = "user/{userId}")
    public ApiResponse<List<RatingDTO>> getRatingByUserDataHandler(@PathVariable("userId") String userId){
        return ratingApiService.generateRatingByUserDataHandlerResponse(userId);
    }

    @GetMapping(path = "hotel/{hotelId}")
    public ApiResponse<List<RatingDTO>> getRatingByHotelDataHandler(@PathVariable("hotelId") String hotelId){
        return ratingApiService.generateRatingByHotelDataHandlerResponse(hotelId);
    }
}
