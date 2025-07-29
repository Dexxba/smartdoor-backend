package com.smartdoor.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoorController {

    @GetMapping("/ping")
    public String ping() {
        return "SmartDoor backend is running!";
    }
}
