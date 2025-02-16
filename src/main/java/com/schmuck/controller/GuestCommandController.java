package com.schmuck.controller;

import com.schmuck.dto.command.GuestCreateCommand;
import com.schmuck.service.command.GuestCommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/guest")
@RequiredArgsConstructor
public class GuestCommandController {

    private final GuestCommandHandler guestCommandHandler;
    @PostMapping("")
    public void createGuest(@RequestBody GuestCreateCommand command){
        guestCommandHandler.createGuest(command);
    }
}
