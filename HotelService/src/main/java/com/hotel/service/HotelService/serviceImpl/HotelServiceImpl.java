package com.hotel.service.HotelService.serviceImpl;

import com.hotel.service.HotelService.dto.HotelDTO;
import com.hotel.service.HotelService.entity.Hotel;
import com.hotel.service.HotelService.repositories.HotelRepository;
import com.hotel.service.HotelService.service.HotelService;
import com.hotel.service.HotelService.utility.HotelUtilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Override
    public HotelDTO createHotel(HotelDTO hotelDTO) {
        Hotel hotel = HotelUtilityService.convertHotelDtoToHotel(hotelDTO,new Hotel());
        return HotelUtilityService.convertHotelToDTO(hotelRepository.save(hotel),hotelDTO);
    }

    @Override
    public List<HotelDTO> getAllHotelDetail() {
        List<Hotel> hotelList = hotelRepository.findAll();
        return hotelList.stream().map(hotel -> HotelUtilityService.convertHotelToDTO(hotel,new HotelDTO())).collect(Collectors.toList());
    }

    @Override
    public HotelDTO findById(String id) {
        return HotelUtilityService.convertHotelToDTO(hotelRepository.findById(id).orElse(new Hotel()),new HotelDTO());
    }
}
