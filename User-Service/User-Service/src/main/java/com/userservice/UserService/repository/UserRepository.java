package com.userservice.UserService.repository;

import com.userservice.UserService.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
