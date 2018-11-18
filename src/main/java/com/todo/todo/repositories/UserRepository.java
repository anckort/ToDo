package com.todo.todo.repositories;

import com.todo.todo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{
    List<User> getAllByFirstNameAndLastName(String firsname, String lastname);
}
