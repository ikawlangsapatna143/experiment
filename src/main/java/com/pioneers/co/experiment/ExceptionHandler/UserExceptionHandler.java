package com.pioneers.co.experiment.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pioneers.co.experiment.NotFoundException.UserNotFoundException;

@RestControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)

    String UserNotFoundException (UserNotFoundException e){
        return e.getMessage();
    }

}
