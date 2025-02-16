package com.schmuck.service;

import com.schmuck.dto.command.UserCommand;
import com.schmuck.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserCommand user) {
        userRepository.save(user.toUser());
    }
}
