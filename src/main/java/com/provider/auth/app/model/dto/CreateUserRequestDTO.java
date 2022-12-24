package com.provider.auth.app.model.dto;

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
public class CreateUserRequestDTO {
  private String username;
  private String password;
  private String email;
}
