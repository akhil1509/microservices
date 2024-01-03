package com.userservice.UserService.service;

import com.userservice.UserService.user.User;

import java.util.List;

public interface UserService {

     public User createUser(User user);
     public  User getUserById(Long id);
     public List<User> saveUser();



}
