package com.schmuck.dto.command;

import com.schmuck.model.User;

public record UserCommand(String name, String surmane) {
    public User toUser() {
        return User.builder().name(name).surname(surmane).build();
    }
}
