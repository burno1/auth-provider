package com.provider.auth.app.services;

import com.provider.auth.app.model.po.UserPO;
import com.provider.auth.app.repository.interfaces.IUserRepository;
import com.provider.auth.app.services.interfaces.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
  private final IUserRepository IUserRepository;

  public UserPO saveUser(UserPO userPO) {
    return IUserRepository.save(userPO);
  }
  public boolean validateCredentials(String username, String password) {
    return !IUserRepository.findByUsername(username).isEmpty();
  }
}
