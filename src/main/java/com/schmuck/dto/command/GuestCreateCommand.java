package com.schmuck.dto.command;

import com.schmuck.model.Guest;

public record GuestCreateCommand(
        String name,
        String surname
) {

    public Guest toGuest() {
        return Guest.builder().name(name).surname(surname).build();
    }
}
