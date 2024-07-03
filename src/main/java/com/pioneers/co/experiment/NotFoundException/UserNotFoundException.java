package com.pioneers.co.experiment.NotFoundException;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("could not found user with" + id);
    } 

}
