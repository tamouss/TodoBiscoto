package com.example.todoBiscoto.services;

import com.example.todoBiscoto.Repo.Repo;
import com.example.todoBiscoto.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service

public class Service {
@Autowired
    private Repo repo;
    public List<User> fetchuserList() {
    return repo.findAll();
    }

    public User saveUserToDB(User user) {
      return repo.save(user);
    }

    public Optional<User> fetchUserById(int id) {
        return repo.findById(id);
    }

    public String deleteUserById(int id) {
        String result;
        try {
            repo.deleteById(id);
            result = "user succesfully deleted";

        }catch (Exception e) {
            result = "user with id unsuccesfully deleted";
        }
        return result;
    }



}
