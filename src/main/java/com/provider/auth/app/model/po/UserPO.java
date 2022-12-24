package com.provider.auth.app.model.po;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@Data
@Entity
@Builder
@Table(name = "\"user\"")
@NoArgsConstructor
@AllArgsConstructor
public class UserPO {
  @Id
  @GeneratedValue
  private Long id;

  private String email;
  private String username;
  private String password;

}
