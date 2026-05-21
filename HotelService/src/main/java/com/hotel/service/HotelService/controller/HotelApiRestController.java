package com.hotel.service.HotelService.controller;

import com.hotel.service.HotelService.dto.HotelDTO;
import com.hotel.service.HotelService.entity.Hotel;
import com.hotel.service.HotelService.reponse.ApiResponse;
import com.hotel.service.HotelService.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "hotel")
@RequiredArgsConstructor
public class HotelApiRestController {

    private final HotelService hotelService;

    @PostMapping(path = "save")
    public ApiResponse<HotelDTO> saveNewHotelDataHandler(@RequestBody HotelDTO hotelDTO){
        return new ApiResponse<>(hotelService.createHotel(hotelDTO));
    }

    @GetMapping(path = "list")
    public ApiResponse<List<HotelDTO>> listHotelDataHandler(){
        return new ApiResponse<>(hotelService.getAllHotelDetail());
    }

    @GetMapping(path = "/hotel/{id}")
    public ApiResponse<HotelDTO> findHotelById(@PathVariable("id") String id){
        return new ApiResponse<>(hotelService.findById(id));
    }

}
