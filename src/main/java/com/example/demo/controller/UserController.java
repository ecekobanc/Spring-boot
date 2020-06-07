package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collection;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user") //kabul etmek istediğin dosya yolu

public class UserController {
  @Autowired  
  private UserServiceImpl userService; 

  /*  @RequestMapping(path={"","/"},method = RequestMethod.GET)
    public String test(){
        return "test";
    }*/

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping
    public Collection<User>findAll(){
        Iterable<User>userIt=null;
        Collection<User>users=new ArrayList<>();
        
        userIt=userService.findAll();
        for(User user : userIt){
            users.add(user);
        }
        return users;
    }

    @GetMapping(value="/{id}")
    public User searchUser(@PathVariable Long id){
        User user=userService.findById(id).orElseThrow(()->new IllegalArgumentException());
        return user;
    }
}