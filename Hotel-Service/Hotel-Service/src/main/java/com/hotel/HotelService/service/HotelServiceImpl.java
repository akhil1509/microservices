package com.hotel.HotelService.service;

import com.hotel.HotelService.exception.ResourceNotFoundException;
import com.hotel.HotelService.model.Hotel;
import com.hotel.HotelService.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
   public HotelRepository hotelRepository;
    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelById(Long id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Could not find hotel: " + id));
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
