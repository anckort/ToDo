package com.todo.todo.controllers;


import com.todo.todo.Connector;
import com.todo.todo.entities.User;
import com.todo.todo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("ALL")
@Controller("/users")
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/getAllUsers")
    public @ResponseBody
    String getAllUsers(){
        return userService.getListOfUsers().toString();
    }

    @PostMapping(value = "/saveUser")
    public @ResponseBody
    String saveUser (@RequestParam(name = "username") String username,
                     @RequestParam(name = "first_name") String first_name,
                     @RequestParam(name = "last_name") String last_name,
                     @RequestParam(name = "password") String password) throws SQLException {
        User user = new User();
        user.setUsername(username);
        user.setFirstName(first_name);
        user.setLastName(last_name);
        user.setPassword(password);
        userService.saveUser(user);
        return "ok";
    }
}
