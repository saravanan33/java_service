package com.java.application.java_service.dao.repository;

import com.java.application.java_service.dao.entity.BookingMaster;
import com.java.application.java_service.dao.entity.FlightItinerary;

import java.util.List;

public interface BookingMasterDao {

    BookingMaster findById(int id);

    List<FlightItinerary> findFlightItineraryByBookingMasterId(int id);

    void getLog();
}
