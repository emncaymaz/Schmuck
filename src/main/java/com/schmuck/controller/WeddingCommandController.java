package com.schmuck.controller;

import com.schmuck.dto.command.WeddingCreateCommand;
import com.schmuck.service.command.WeddingCommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("wedding/")
@RequiredArgsConstructor
public class WeddingCommandController {

    private final WeddingCommandHandler weddingCommandHandler;

    @PostMapping
    public void createWedding(@RequestBody WeddingCreateCommand weddingCreateCommand) {

    }

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
