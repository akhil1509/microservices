package com.hotel.HotelService.controller;

import com.hotel.HotelService.model.Hotel;
import com.hotel.HotelService.service.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    public HotelServiceImpl hotelServiceImpl;
    @PostMapping("/create")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelServiceImpl.createHotel(hotel);
        return  new ResponseEntity<Hotel>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public  ResponseEntity<Hotel> getHotelById( @PathVariable Long id){
        Hotel hotelById = hotelServiceImpl.getHotelById(id);
        return  new ResponseEntity<Hotel>(hotelById, HttpStatus.FOUND);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> allHotels = hotelServiceImpl.getAllHotels();
        return  new ResponseEntity<>(allHotels, HttpStatus.NOT_FOUND);
    }
}
