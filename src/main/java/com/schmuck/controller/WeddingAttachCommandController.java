package com.schmuck.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class WeddingAttachCommandController {

    private final WeddingAttachCommandController weddingAttachCommandController;

    @PostMapping("")
    public void createWeddingAttach(@RequestBody WeddingAttachCommandController weddingAttachCommandController){
        weddingAttachCommandController.createWeddingAttach(weddingAttachCommandController);
    }
}
