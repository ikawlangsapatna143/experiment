package com.pioneers.co.experiment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String email;
    private String password;
    
    User(){}
    //constructor
   public User(String name,String email, String password){
        this.name = name;
        this.email = email;
        this.email = password;
    }
    //getters
    public Long getId(){
        return id;
    }
    public  String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }public void setPassword(String password){
        this.password = password;
    }
}