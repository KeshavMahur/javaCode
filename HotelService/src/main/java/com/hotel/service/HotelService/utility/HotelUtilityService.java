package com.hotel.service.HotelService.utility;


import com.hotel.service.HotelService.dto.HotelDTO;
import com.hotel.service.HotelService.entity.Hotel;

public interface HotelUtilityService {

    static HotelDTO convertHotelToDTO(Hotel hotel,HotelDTO hotelDTO){
        hotelDTO.setId(hotel.getId());
        hotelDTO.setName(hotel.getName());
        hotelDTO.setAddress(hotel.getAddress());
        hotelDTO.setAbout(hotel.getAbout());
        return hotelDTO;
    }

    static Hotel convertHotelDtoToHotel(HotelDTO hotelDTO,Hotel hotel){
        hotel.setId(hotelDTO.getId());
        hotel.setName(hotelDTO.getName());
        hotel.setAddress(hotelDTO.getAddress());
        hotel.setAbout(hotelDTO.getAbout());
        return hotel;
    }
}
