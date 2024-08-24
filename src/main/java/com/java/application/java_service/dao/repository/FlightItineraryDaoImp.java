package com.java.application.java_service.dao.repository;

import com.java.application.java_service.dao.entity.FlightItinerary;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FlightItineraryDaoImp implements FlightItineraryDao{

    private EntityManager entityManager;
    @Autowired
    public FlightItineraryDaoImp(EntityManager myEntityManager) {
        entityManager = myEntityManager;
    }

    @Override
    public FlightItinerary findById(int id) {
        return entityManager.find(FlightItinerary.class,id);
    }
}
