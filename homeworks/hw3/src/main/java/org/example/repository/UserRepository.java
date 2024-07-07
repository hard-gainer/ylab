package org.example.repository;

import org.example.entity.User;

import java.util.Map;

public interface UserRepository {

    User save(String username, String password);

    User findByUsername(String username);

    User findById(Integer userId);

    Map<String, User> findAll();
}