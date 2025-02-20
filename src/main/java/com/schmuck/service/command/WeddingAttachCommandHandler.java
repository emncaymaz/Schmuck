package com.schmuck.service.command;

import com.schmuck.dto.command.WeddingAttachCreateCommand;
import com.schmuck.model.Gift;
import com.schmuck.model.Wedding;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WeddingAttachCommandHandler {

    private final WeddingQueryHandler weddingQueryHandler;
    private final GiftQueryHandler giftQueryHandler;

    public void createWeddingAttach(WeddingAttachCreateCommand weddingAttachCreateCommand){
        UUID weddingId= weddingAttachCreateCommand.weddingId();
        UUID guestId= weddingAttachCreateCommand.guestId();
        UUID giftId= weddingAttachCreateCommand.giftId();

        var wedding = weddingQueryHandler.getWeddingById(weddingId).orElseThrow(() -> new RuntimeException(""));
        wedding.getWeddingGuests().stream()
                .filter(weddingGuest -> weddingGuest.getGuest().getId())
                .findFirst()
                .ifPresent(weddingGuest -> {
                    var giftById = giftQueryHandler.getGiftById(giftId).orElseThrow(()-> new RuntimeException(""));
                });
    }
}
