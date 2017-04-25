package io.github.mezk.service;

import org.springframework.stereotype.Service;

import io.github.mezk.model.User;

@Service
public class UserService {

    public User getUserByid() {

        User user = new User("1", "login", "password", "Hello, Andrei");

        return user;
    }

}
