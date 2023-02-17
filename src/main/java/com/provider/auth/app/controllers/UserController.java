package com.provider.auth.app.controllers;

import com.provider.auth.app.mappers.UserMapper;
import com.provider.auth.app.model.dto.UserDTO;
import com.provider.auth.app.model.po.UserPO;
import com.provider.auth.app.services.UserService;
import com.provider.auth.app.services.interfaces.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

  private final IUserService userService;
  private final UserMapper userMapper;

  @PostMapping("users")
  public UserDTO createUser(@RequestBody UserDTO request) {

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
    UserPO userPO = UserPO.builder()
            .username(request.getUsername())
            .password(encoder.encode(request.getPassword()))
            .email(request.getEmail())
            .build();

    return userMapper.DTOToPo(userService.saveUser(userPO));
  }
}
