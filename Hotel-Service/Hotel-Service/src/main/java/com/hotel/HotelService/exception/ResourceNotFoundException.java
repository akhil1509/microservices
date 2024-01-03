package com.hotel.HotelService.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException()
    {
        super("Resource not found in hotel");
    }
    public  ResourceNotFoundException(String message){
        super(message);
    }
}
