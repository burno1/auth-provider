package com.provider.auth.app.services;

import com.provider.auth.app.model.po.UserPO;
import com.provider.auth.app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public UserPO saveUser(UserPO userPO) {
    return userRepository.save(userPO);
  }
  public boolean validateCredentials(String username, String password) {
    return !userRepository.findByUsername(username).isEmpty();
  }
}
