package com.provider.auth.app.repository;

import com.provider.auth.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Bruno Fernandes
 * Created at : 23/12/2022
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {}
