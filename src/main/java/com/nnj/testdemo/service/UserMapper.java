package com.nnj.testdemo.service;

import com.nnj.testdemo.repository.User;
import com.nnj.testdemo.rest.dto.UserDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toUser(UserDto userDto);

    List<UserDto> toUserDtos(List<User> users);
}
