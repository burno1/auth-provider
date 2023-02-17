package com.provider.auth.app.services.interfaces;

import com.provider.auth.app.model.po.UserPO;

/**
 * Author: Bruno Fernandes
 * Created at : 16/02/2023
 */
public interface IUserService {
  public UserPO saveUser(UserPO userPO);
  public boolean validateCredentials(String username, String password);
}
