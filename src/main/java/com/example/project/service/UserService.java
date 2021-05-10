package com.example.project.service;

import com.example.project.model.User;

import java.util.List;

public interface UserService {

    User findByEmail(String email);
    void save(User user);
    void update(User user);
    List<User> findAllUser();
    void deleteUser(long userId);
    void delete(Long id);
}

