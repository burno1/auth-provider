package com.provider.auth.app.mappers;

import com.provider.auth.app.model.dto.UserDTO;
import com.provider.auth.app.model.po.UserPO;
import org.springframework.stereotype.Service;

/**
 * Author: Bruno Fernandes
 * Created at : 16/02/2023
 */
@Service
public class UserMapper {

  public UserDTO DTOToPo(UserPO userPO){
    return UserDTO.builder()
            .username(userPO.getUsername())
            .email(userPO.getEmail()).build();
  }
}
