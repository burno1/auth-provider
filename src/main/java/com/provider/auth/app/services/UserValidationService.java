package com.provider.auth.app.services;

import org.springframework.stereotype.Service;

/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@Service
public class UserValidationService {
  public boolean validateCredentials(String username, String password) {
    return true;
  }
}
