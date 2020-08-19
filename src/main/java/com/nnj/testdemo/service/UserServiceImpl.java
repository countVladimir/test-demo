package com.nnj.testdemo.service;

import com.nnj.testdemo.repository.User;
import com.nnj.testdemo.repository.UserJpaRepository;
import com.nnj.testdemo.rest.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserJpaRepository userJpaRepository;
    private UserMapper userMapper;


    @Autowired
    public UserServiceImpl(UserJpaRepository userJpaRepository, UserMapper userMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> findAllUsers() {
        List<User> users = userJpaRepository.findAll();
        List<UserDto> returnList = userMapper.toUserDtos(users);
        return returnList;
    }

    @Override
    public UserDto findUser(Long id) {
        User user = userJpaRepository.findById(id).get();
        UserDto userDto = userMapper.toDto(user);
        return userDto;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.toUser(userDto);
        user = userJpaRepository.save(user);
        UserDto returnDto = userMapper.toDto(user);
        return returnDto;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User user = userJpaRepository.findById(userDto.getId()).get();
        user = userJpaRepository.save(user);
        return userMapper.toDto(user);

    }

    @Override
    public void deleteUser(Long id) {
        userJpaRepository.deleteById(id);
    }


    public UserJpaRepository getUserJpaRepository() {
        return userJpaRepository;
    }

    public void setUserJpaRepository(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
