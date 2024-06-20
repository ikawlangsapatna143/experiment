package com.pioneers.co.experiment.Controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pioneers.co.experiment.Model.UserModel;

@RestController
public class UserController {
    
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1,"jeven 11","jeven.11@email.com","password");
    }
    
    @GetMapping("users")
    public List<UserModel>getUsers(){
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(1,"Mario","mario@email.com","password"));
        users.add(new UserModel(2,"Luigi","luigi@email.com","password"));
        users.add(new UserModel(3,"Yoshi","yoshi@email.com","password"));
        return users;
    }

    @GetMapping("user/{name}")
    public UserModel getUserFromName( @PathVariable("name") String name){
        return new UserModel(1,"Gaylord","gaylord@email.com","password");
    }
}
