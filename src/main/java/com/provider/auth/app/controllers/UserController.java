package com.provider.auth.app.controllers;

import com.provider.auth.app.model.CreateUserRequest;
import com.provider.auth.app.model.User;
import com.provider.auth.app.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@RestController
@RequiredArgsConstructor
public class UserController {

  @Autowired
  private final UserService userService;

  @PostMapping("users")
  public User createUser(@RequestBody CreateUserRequest request) {

    User user = User.builder()
            .username(request.getUsername())
            .password(request.getPassword())
            .email(request.getEmail())
            .build();


    return userService.saveUser(user);
  }
}
