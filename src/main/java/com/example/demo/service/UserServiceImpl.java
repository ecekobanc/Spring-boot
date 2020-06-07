package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
@Component("userService")
public class UserServiceImpl implements IUserService {




    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository){
           
        this.userRepository=userRepository;

    }

    @Override
    public User save(User user) {
        
        return this.userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {

        return this.userRepository.findById(id);
    }

    @Override
    public Iterable<User> findAll() {

       return this.userRepository.findAll();
    }
    


}