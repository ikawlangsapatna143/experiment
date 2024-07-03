package com.pioneers.co.experiment.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pioneers.co.experiment.Model.User;
import com.pioneers.co.experiment.NotFoundException.UserNotFoundException;
import com.pioneers.co.experiment.Repository.UserRepository;

@RestController
public class UserController {

     UserRepository repo;

    public UserController(UserRepository userRepository) {
        this.repo = userRepository;
    }

    // Get all users
    @GetMapping("/users")
    public List<User> getUsers() {
        return repo.findAll();
    }

    // Get a single user by id
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    // Create a new user
    @PostMapping("/user/new")
    public String addUser(@RequestBody User newUser) {
        repo.save(newUser);
        return "A new user is added.";
    }

    // Update a user
    @PutMapping("/user/edit/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User newUser) {
        return repo.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());
                    return repo.save(user);
                }).orElseGet(()-> {
                    return repo.save(newUser);
                });
    }

    // Delete a user
    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        repo.deleteById(id);
        return "User Deleted";
    }
}
