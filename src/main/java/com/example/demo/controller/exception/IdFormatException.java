package com.example.demo.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class IdFormatException extends RuntimeException{
    
    public IdFormatException(Object id){
        super("Girdiğiniz id uygun değil: " + id);
    }
}