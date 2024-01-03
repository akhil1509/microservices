package com.userservice.UserService.service;

import com.userservice.UserService.controller.UserController;
import com.userservice.UserService.exceptions.ResourceNotFoundException;
import com.userservice.UserService.repository.UserRepository;
import com.userservice.UserService.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
 public UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found on this id: "+id));


    }

    @Override
    public List<User> saveUser() {
        return userRepository.findAll();
    }
}
