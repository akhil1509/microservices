package com.hotel.HotelService.service;

import com.hotel.HotelService.model.Hotel;

import java.util.List;

public interface HotelService {

    public Hotel createHotel(Hotel hotel);
    public  Hotel getHotelById(Long id);
    public List<Hotel> getAllHotels();

}
