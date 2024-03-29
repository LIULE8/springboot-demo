package com.leo.demo.repositories;

import com.leo.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.math.BigInteger;

/**
 * @author Leo Liu
 * @create 16/09/2019
 */
public interface UserRepository
    extends JpaRepository<User, BigInteger>, JpaSpecificationExecutor<User> {}
