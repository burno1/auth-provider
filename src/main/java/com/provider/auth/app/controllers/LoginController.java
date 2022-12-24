package com.provider.auth.app.controllers;

import com.provider.auth.app.model.dto.LoginRequestDTO;
import com.provider.auth.app.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@RestController
@RequiredArgsConstructor
public class LoginController {

  private final UserService userValidationService;

  @PostMapping("/login")
  @ResponseBody
  public String login(@NotNull @RequestBody LoginRequestDTO request) {
    // Validate the user and password combination
    if (userValidationService.validateCredentials(request.username(), request.password())) {
      return "Success";
    }

    return "Invalid username or password";
  }


}
