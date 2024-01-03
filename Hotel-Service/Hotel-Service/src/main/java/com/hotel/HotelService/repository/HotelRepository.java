package com.hotel.HotelService.repository;

import com.hotel.HotelService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
