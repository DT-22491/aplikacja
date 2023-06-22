package com.example.hotelreservation.repository;

import com.example.hotelreservation.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository {
    private List<Room> rooms;

    public RoomRepository() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    // Inne metody do zarządzania pokojami

    public List<Room> getAllRooms() {
        return rooms;
    }
}

