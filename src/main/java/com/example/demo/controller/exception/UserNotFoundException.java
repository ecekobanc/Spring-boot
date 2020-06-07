package com.example.demo.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND) // 404 error
public class UserNotFoundException extends RuntimeException{
  
    
public UserNotFoundException(Long id){

    super("Aradığınız id'de kullanıcı bulunamadı: "+id);
}



}