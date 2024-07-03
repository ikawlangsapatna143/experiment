package com.pioneers.co.experiment.NotFoundException;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(Long id){
        super("Could not Find Order" + id);
    }
}
