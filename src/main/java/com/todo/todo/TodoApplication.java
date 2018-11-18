package com.todo.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
//        Connector.setConnection();
        SpringApplication.run(TodoApplication.class, args);
        System.err.println("-----------------------------------------------------Server started--------------------------------------------");
    }
}
