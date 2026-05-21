package com.lcwd.user.service.UserService.controller;

import com.lcwd.user.service.UserService.dto.RatingDTO;
import com.lcwd.user.service.UserService.dto.UserDTO;
import com.lcwd.user.service.UserService.entites.User;
import com.lcwd.user.service.UserService.feignclient.RatingClient;
import com.lcwd.user.service.UserService.responce.ApiResponse;
import com.lcwd.user.service.UserService.services.UserServices;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "users")
@RequiredArgsConstructor
public class UserServiceRestController {

    private final UserServices userServices;
    private final RestTemplate restTemplate;
    private final String url = "http://";
    private final String ratingServiceName = "RATINGSERVICE"+"/rating";
    private final String hotelServiceName = "HOTELSERVICE";
    private final RatingClient ratingClient;

    @PostMapping(path = "save")
    public ApiResponse<UserDTO> createUser(@RequestBody UserDTO userDTO){
       UserDTO user = userServices.createNewUser(userDTO);
       return new ApiResponse<>(user);
    }

    @GetMapping(path = "list")
    public ApiResponse<List<UserDTO>> fetchAllData(){
        List<UserDTO> userDTOList = userServices.getAllUser();
        return new ApiResponse<>(userDTOList);
    }

    @GetMapping(path = "user/{userId}")
   // @Retry(name = "ratingClient", fallbackMethod = "ratingFallback")
    @RateLimiter(name = "userRateLimiter",fallbackMethod = "ratingFallBack")
    @CircuitBreaker(name = "ratingService", fallbackMethod = "ratingFallback")
    public ApiResponse<UserDTO> findUsersRatingsData(@PathVariable("userId") String userId){
        UserDTO userDTO = userServices.findUserById(userId);
        // communicate another service useing Rest Api with RestTemplate
        /*String ratingUtl = url+ratingServiceName+"/user/"+userDTO.getUserId();
        final ApiResponse ratingResponse = restTemplate.getForObject(ratingUtl, ApiResponse.class);
        */

        // communicate another service useing Rest Api with Feign client
        final ApiResponse<List<RatingDTO>> ratingResponse = ratingClient.getUserRatings(userDTO.getUserId());
        if(Objects.equals(ratingResponse.getStatus(),HttpStatus.OK)){
            List<RatingDTO> ratingDTOS = ratingResponse.getData();
            userDTO.setRatingList(ratingDTOS);
        }
        return new ApiResponse<>(userDTO);
    }

    public ApiResponse<List<RatingDTO>> ratingFallback(String userId, Throwable t){
        System.out.println("fall callback in run");
        return  new ApiResponse<>(Collections.emptyList());
    }

    @PostMapping("full/info/save")
    public ApiResponse<UserDTO> createNewUserWithRating(@RequestBody UserDTO userDTO){
        UserDTO user = userServices.createNewUser(userDTO);
        RatingDTO ratingDTO = new RatingDTO();
        ratingDTO.setUserId(user.getUserId());
        ratingDTO.setDescription(userDTO.getAbout());
        ApiResponse<RatingDTO> ratingDTOApiResponse = ratingClient.saveNewRating(ratingDTO);
        userDTO.setRatingList(Arrays.asList(ratingDTOApiResponse.getData()));
        return new ApiResponse<>(userDTO);
    }

}
