package com.example.ticketsystem.controllers;

import com.example.ticketsystem.entity.User;
import com.example.ticketsystem.entity.UserVM;
import com.example.ticketsystem.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/1.0")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/users/{id}")
    public void createUser(@RequestBody User user, @PathVariable(name = "id") long id){
        userService.save(user,id);
    }

    @GetMapping(path = "/users/{phone}")
    public User getUser(@PathVariable String phone){
       return userService.getUser(phone);
    }


}
