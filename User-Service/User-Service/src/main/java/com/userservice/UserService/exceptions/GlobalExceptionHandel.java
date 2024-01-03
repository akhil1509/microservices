package com.userservice.UserService.exceptions;

import com.userservice.UserService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandel {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResponseNotFoundException(ResourceNotFoundException exception){
        String message = exception.getMessage();
        ApiResponse build = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return  new ResponseEntity<>(build, HttpStatus.NOT_FOUND);

    }
}
