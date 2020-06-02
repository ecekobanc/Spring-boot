package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user") //kabul etmek istediğin dosya yolu

public class UserController {
    @RequestMapping(path={"","/"},method = RequestMethod.GET)
public String test(){
    return "test";
}



}