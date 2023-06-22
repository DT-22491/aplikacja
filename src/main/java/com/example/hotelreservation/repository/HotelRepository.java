package com.example.hotelreservation.repository;

import com.example.hotelreservation.model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelRepository {
    private List<Hotel> hotels;

    public HotelRepository() {
        this.hotels = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public void removeHotel(Hotel hotel) {
        hotels.remove(hotel);
    }

    // Inne metody do zarządzania hotelami

    public List<Hotel> getAllHotels() {
        return hotels;
    }
}

