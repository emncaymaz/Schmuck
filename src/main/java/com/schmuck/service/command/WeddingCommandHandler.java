package com.schmuck.service.command;

import com.schmuck.dto.command.GuestAttactCommand;
import com.schmuck.dto.command.WeddingCreateCommand;
import com.schmuck.model.Guest;
import com.schmuck.model.Wedding;
import com.schmuck.model.WeddingGuest;
import com.schmuck.repository.GuestRepository;
import com.schmuck.repository.WeddingRepository;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.UUID;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WeddingCommandHandler {

    private final WeddingRepository weddingRepository;
    private final GuestRepository guestRepository;


    public void createWedding(WeddingCreateCommand command) {
        var weddingDate = command.weddingDate();
        var name = command.name();
        var guestAttactedCommand = command.guestAttactCommandList();
        List<WeddingGuest> weddingGuests = new ArrayList<>();

        var weddingGuestList = command.guestAttactCommandList().stream()
                .map(guestId -> guestRepository.findById(guestId).orElseThrow(() -> new RuntimeException("Guest not found")))
                .map(guest -> WeddingGuest.builder().guest(guest).build()).toList();

        //guestAttactedCommand.forEach();
        for (GuestAttactCommand guestAttactCommand : guestAttactedCommand) {
            UUID guestId = guestAttactCommand.id();
            guestRepository.findById(guestId)
                    .ifPresent(guest -> weddingGuests.add(WeddingGuest.builder().guest(guest).build()));
        }
        weddingRepository.save(Wedding.builder()
                .name(name)
                .weddingDate(weddingDate)
                .weddingGuests(weddingGuests)
                .build());


    }
}
