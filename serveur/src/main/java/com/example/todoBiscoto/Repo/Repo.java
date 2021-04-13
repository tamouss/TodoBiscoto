package com.example.todoBiscoto.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todoBiscoto.model.User;

public interface Repo extends JpaRepository<User, Integer> {
}
