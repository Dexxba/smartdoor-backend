package com.smartdoor.backend.service;

import com.smartdoor.backend.model.Door;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoorService {
    private final List<Door> doors = new ArrayList<>();

    public DoorService() {
        doors.add(new Door(1L, "Main Entrance", "CLOSED"));
        doors.add(new Door(2L, "Back Door", "OPEN"));
    }

    public List<Door> getAllDoors() {
        return doors;
    }
}
