package com.example.hotelreservation.repository;

import com.example.hotelreservation.model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {
    private List<Reservation> reservations;

    public ReservationRepository() {
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    // Inne metody do zarządzania rezerwacjami

    public List<Reservation> getAllReservations() {
        return reservations;
    }
}

