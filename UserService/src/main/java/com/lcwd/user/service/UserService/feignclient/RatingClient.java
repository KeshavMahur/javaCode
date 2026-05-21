package com.lcwd.user.service.UserService.feignclient;

import com.lcwd.user.service.UserService.dto.RatingDTO;
import com.lcwd.user.service.UserService.responce.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "RATINGSERVICE")
public interface RatingClient {

    @GetMapping(path = "rating/user/{userId}")

    ApiResponse<List<RatingDTO>> getUserRatings(@PathVariable("userId") String userId);

    @PostMapping(path = "rating/save")
    ApiResponse<RatingDTO> saveNewRating(@RequestBody RatingDTO ratingDTO);
}
