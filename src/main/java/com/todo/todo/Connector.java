package com.todo.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static void setConnection() {
        Connection connection = null;
        try {
            String userName = "anckort";
            String password = "1234";
            String url = "jdbc:mysql://localhost/todo";
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
            try {
                connection = DriverManager.getConnection(url, userName, password);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("Database connection established");
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                System.out.println("Database connection terminated");
            } catch (Exception e2) {
            }
        }
    }
}


