package com.schmuck.controller;

import com.schmuck.dto.command.UserCommand;
import com.schmuck.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserCommandController {

    private final UserService userService;

    @PostMapping
    public void createUser(@RequestBody UserCommand user){
            userService.createUser(user);
    }
}
