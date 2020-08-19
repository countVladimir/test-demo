package com.nnj.testdemo.service;

import com.nnj.testdemo.rest.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto findUser(Long id);
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto);
    void deleteUser(Long id);
    List<UserDto> findAllUsers();
}
