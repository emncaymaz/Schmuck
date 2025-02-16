package com.schmuck.dto.command;

import java.time.LocalDateTime;
import java.util.List;

public record WeddingCreateCommand(
        String name,
        LocalDateTime weddingDate,
        List<GuestAttactCommand> guestAttactCommandList
) {
}
