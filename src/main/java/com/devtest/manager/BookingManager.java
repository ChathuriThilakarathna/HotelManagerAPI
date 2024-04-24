package com.devtest.manager;

import java.time.LocalDate;
import java.util.List;

import com.devtest.dto.Booking;

public interface BookingManager {

    void storeBooking(String guestName, int roomNumber, LocalDate date) throws Exception;
    List<Integer> findAvailableRooms(LocalDate date) throws Exception;
    List<Booking> findBookingsByGuest(String guestName) throws Exception;

}
