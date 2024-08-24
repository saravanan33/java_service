package com.java.application.java_service.dao.repository;

import com.java.application.java_service.dao.entity.BookingMaster;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
