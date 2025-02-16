package com.schmuck.dto.command;

import org.hibernate.validator.constraints.UUID;

public record GuestAttactCommand(
        UUID id
) implements UUID {
}
