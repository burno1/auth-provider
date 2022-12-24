package com.provider.auth.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@RequiredArgsConstructor
@Data
public class LoginRequest {
  private final String username;
  private final String password;
}
