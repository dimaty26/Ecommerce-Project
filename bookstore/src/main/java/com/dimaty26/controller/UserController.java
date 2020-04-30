package com.dimaty26.controller;

import com.dimaty26.model.User;
import com.dimaty26.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.save(user);
    }
}
