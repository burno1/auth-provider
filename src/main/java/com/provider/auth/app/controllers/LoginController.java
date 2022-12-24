package com.provider.auth.app.controllers;

import com.provider.auth.app.model.LoginRequest;
import com.provider.auth.app.services.UserValidationService;
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

  private final UserValidationService userValidationService;

  @PostMapping("/login")
  @ResponseBody
  public String login(@NotNull @RequestBody LoginRequest request) {
    // Validate the user and password combination
    if (userValidationService.validateCredentials(request.getUsername(), request.getPassword())) {
      return "Success";
    }

    return "Invalid username or password";
  }


}
