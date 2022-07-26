package com.sha.springbootvideocontentmanager.service;

import com.sha.springbootvideocontentmanager.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
