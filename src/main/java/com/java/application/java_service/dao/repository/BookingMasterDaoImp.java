package com.java.application.java_service.dao.repository;

import com.java.application.java_service.dao.entity.BookingMaster;
import com.java.application.java_service.dao.entity.FlightItinerary;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingMasterDaoImp implements BookingMasterDao{

    private EntityManager entityManager;

    @Autowired
    public BookingMasterDaoImp(EntityManager myEntityManager) {
        this.entityManager = myEntityManager;
    }

    @Override
    public BookingMaster findById(int id) {
        return entityManager.find(BookingMaster.class,id);
    }

    @Override
    public List<FlightItinerary> findFlightItineraryByBookingMasterId(int id) {

        TypedQuery<FlightItinerary> query = entityManager.createQuery("from FlightItinerary where bookingMaster.id = :data", FlightItinerary.class);
        query.setParameter("data",id);

        List<FlightItinerary> flightItineraries = query.getResultList();
        return flightItineraries;
    }

    @Override
    public void getLog() {
        System.out.println("test method executed");

    }
}
