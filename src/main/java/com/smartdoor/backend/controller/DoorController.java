package com.smartdoor.backend.controller;

import com.smartdoor.backend.model.Door;
import com.smartdoor.backend.service.DoorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class DoorController {

    @GetMapping("/ping")
    public String ping() {
        return "SmartDoor backend is running!";
    }

    private final DoorService doorService;

    public DoorController(DoorService doorService) {
        this.doorService = doorService;
    }

    @GetMapping("/doors")
    public List<Door> getAllDoors() {
        return doorService.getAllDoors();
    }
}
