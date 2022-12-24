package com.provider.auth.app.services;

import com.provider.auth.app.model.User;
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

  public User saveUser(User user) {
    return userRepository.save(user);
  }
}
