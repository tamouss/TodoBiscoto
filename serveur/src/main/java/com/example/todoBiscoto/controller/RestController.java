package com.example.todoBiscoto.controller;


import com.example.todoBiscoto.model.User;
import com.example.todoBiscoto.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController

public class  RestController {
@Autowired
    private Service service;

@GetMapping("/getuserlist")
    public List<User> fetchUserList() {
        List<User> users =new ArrayList<User>();
        users = service.fetchuserList();
        return users;
    }

@PostMapping("/adduserlist")
    public User saveUser(@RequestBody User user) {
    return service.saveUserToDB(user);
    }

    @GetMapping("/getuserbyid/{id}")
    public User fetchProductById(@PathVariable int id) {
    return service.fetchUserById(id).get();
    }

@DeleteMapping("/deleteuserbyid/{id}")
    public String DeleteUserById (@PathVariable int id) {
    return service.deleteUserById(id);
    }
}
