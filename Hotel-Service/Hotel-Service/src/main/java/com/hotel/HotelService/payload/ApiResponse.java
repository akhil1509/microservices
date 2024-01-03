package com.hotel.HotelService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ApiResponse {
    private  String message;
    private  boolean success;
    private HttpStatus status;
}