package com.example.coursemanager.user.controller;

import com.example.coursemanager.user.UserRepository;
import com.example.coursemanager.user.dto.UserDto;
import com.example.coursemanager.user.dto.UserDtoMapper;
import com.example.coursemanager.user.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<UserDto> getUsersList() {
        return UserDtoMapper.mapToUserDtos(userRepository.findAll());
    }

    @GetMapping("/users/{id}")
    public UserDto getUserById(@PathVariable Long id) {
        return UserDtoMapper.mapToUserDto(userRepository.findById(id).get());
    }


}
