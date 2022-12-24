package com.provider.auth.app.controllers;

import com.provider.auth.app.model.dto.CreateUserRequestDTO;
import com.provider.auth.app.model.po.UserPO;
import com.provider.auth.app.services.UserService;
import lombok.RequiredArgsConstructor;
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

  private final UserService userService;

  @PostMapping("users")
  public UserPO createUser(@RequestBody CreateUserRequestDTO request) {

    UserPO userPO = UserPO.builder()
            .username(request.getUsername())
            .password(request.getPassword())
            .email(request.getEmail())
            .build();


    return userService.saveUser(userPO);
  }
}
