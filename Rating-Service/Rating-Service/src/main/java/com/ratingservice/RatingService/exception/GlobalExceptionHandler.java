package com.ratingservice.RatingService.exception;

import com.ratingservice.RatingService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> getExceptionHandler(ResourceNotFoundException exception){
        String message = exception.getMessage();
        ApiResponse build = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return  new ResponseEntity<ApiResponse>(build, HttpStatus.NOT_FOUND);
    }
}
