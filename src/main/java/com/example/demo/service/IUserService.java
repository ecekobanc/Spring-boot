package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.User;

public interface IUserService {
    
User save(User user);
Optional<User>findById(Long id);
Iterable<User>findAll();

}