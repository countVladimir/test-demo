package com.nnj.testdemo.rest;

import com.nnj.testdemo.rest.dto.UserDto;
import com.nnj.testdemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<UserDto> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping
    public UserDto findUser(Long id) {
        System.out.println("Here again we have some useless line");
        return userService.findUser(id);
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @PutMapping
    public UserDto updateUser(UserDto userDto) {
        return userService.updateUser(userDto);
    }

    @DeleteMapping
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
