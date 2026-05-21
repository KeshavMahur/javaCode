package com.hotel.service.HotelService.service;

import com.hotel.service.HotelService.dto.HotelDTO;
import com.hotel.service.HotelService.entity.Hotel;

import java.util.List;

public interface HotelService {
    HotelDTO createHotel(HotelDTO hotelDTO);
    List<HotelDTO> getAllHotelDetail();
    HotelDTO findById(String id);
}
