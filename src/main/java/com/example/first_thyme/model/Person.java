package com.example.first_thyme.model;

public class Person {
    private String id;
    private String password;
    private String username;
    private String name;

    public Person(String id, String password, String username, String name) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.name = name;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
