package com.schmuck.service.command;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequiredArgsConstructor
public class WeddingAttachComandHandler {

    private final WeddingQueryHandler weddingQueryHandler;

}
