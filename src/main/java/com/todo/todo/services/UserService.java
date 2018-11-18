package com.todo.todo.services;

import com.todo.todo.entities.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getListOfUsers();
    List<User> getAllByFirstNameAndLastName(String fn, String ln);
}
