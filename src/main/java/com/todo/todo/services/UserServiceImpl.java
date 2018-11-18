package com.todo.todo.services;

import com.todo.todo.entities.User;
import com.todo.todo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getListOfUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllByFirstNameAndLastName(String fn, String ln) {
        return userRepository.getAllByFirstNameAndLastName(fn, ln);
    }
}
