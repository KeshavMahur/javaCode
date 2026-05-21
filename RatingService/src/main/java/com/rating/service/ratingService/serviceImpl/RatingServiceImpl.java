package com.rating.service.ratingService.serviceImpl;

import com.rating.service.ratingService.entity.Rating;
import com.rating.service.ratingService.repository.RatingRepository;
import com.rating.service.ratingService.services.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService {

    private final RatingRepository ratingRepository;

    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

    @Override
    public List<Rating> findAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating findByRatingById(String id) {
        return ratingRepository.findById(id).orElse(new Rating());
    }
}
