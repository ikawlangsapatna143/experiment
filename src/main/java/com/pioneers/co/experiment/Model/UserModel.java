package com.pioneers.co.experiment.Model;

public class UserModel {
    private int id;
    private String name;
    private String email;
    private String password;
    
    //constructor
   public UserModel(int id,String name,String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.email = password;
    }
    //getters
    public int getId(){
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
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }public void setPassword(String password){
        this.password = password;
    }
}