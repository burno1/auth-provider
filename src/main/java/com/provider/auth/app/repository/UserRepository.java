package com.provider.auth.app.repository;

import com.provider.auth.app.model.po.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@Repository
public interface UserRepository extends JpaRepository<UserPO,Long> {
  List<UserPO> findByUsername(String username);


}
