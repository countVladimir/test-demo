package com.nnj.testdemo.rest.dto;

public class UserDto {
    private Long id;
    private String name;
    private String lastName;
    private String email;

    public Long getId() {
        System.out.println("good");
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDto() {

    }
}
