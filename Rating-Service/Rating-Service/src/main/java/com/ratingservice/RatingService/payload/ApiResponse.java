package com.ratingservice.RatingService.payload;

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
    private  Boolean success;
    private HttpStatus status;
}
