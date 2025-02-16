package com.schmuck.service.command;

import com.schmuck.dto.command.GuestCreateCommand;
import com.schmuck.repository.GuestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GuestCommandHandler {

    private final GuestRepository guestRepository;

    public void createGuest(GuestCreateCommand command){
        guestRepository.save(command.toGuest());
    }
}
