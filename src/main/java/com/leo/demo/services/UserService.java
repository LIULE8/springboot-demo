package com.leo.demo.services;

import com.leo.demo.params.UserParam;
import com.leo.demo.results.UserResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
public interface UserService {

    void createUser(UserParam userParam);

    Page<UserResult> searchByCriteria(Pageable pageable, UserParam userParam);
}
