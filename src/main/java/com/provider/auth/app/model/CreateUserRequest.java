package com.provider.auth.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
  private String username;
  private String password;
  private String email;
}
