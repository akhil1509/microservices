package com.userservice.UserService.controller;

import com.userservice.UserService.UserServiceApplication;
import com.userservice.UserService.service.UserServiceImpl;
import com.userservice.UserService.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserServiceImpl userServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){

        User save = userServiceImpl.createUser(user);
        return  new ResponseEntity<User>(save, HttpStatus.CREATED);
    }


    @GetMapping("/gstd/{id}")
 public ResponseEntity<User> createUserById( @PathVariable("id") Long id){
        User userById = userServiceImpl.getUserById(id);
        return new ResponseEntity<User>(userById, HttpStatus.FOUND);
    }
@GetMapping("all")
 public ResponseEntity<List<User>> saveUser(){
    List<User> users = userServiceImpl.saveUser();
    return  new ResponseEntity<>(users, HttpStatus.OK);
}

}
