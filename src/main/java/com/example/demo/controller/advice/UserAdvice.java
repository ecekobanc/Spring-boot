package com.example.demo.controller.advice;

import java.util.HashMap;

import com.example.demo.controller.error.ApiError;
import com.example.demo.controller.exception.IdFormatException;
import com.example.demo.controller.exception.UserNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserAdvice {
    
    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex){
        return buildReponseEntity(new ApiError(HttpStatus.NOT_FOUND, "İstenen veri bulunamadı!", ex));
    }

    @ExceptionHandler(value = IdFormatException.class)
    public ResponseEntity<Object> handleIdFormatException(IdFormatException ex){
        return buildReponseEntity(new ApiError(HttpStatus.BAD_REQUEST, "Id integer tipinde olmalıdır!", ex));
    }

    private ResponseEntity<Object> buildReponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}