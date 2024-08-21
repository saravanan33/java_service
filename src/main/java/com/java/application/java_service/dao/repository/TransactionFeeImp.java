package com.java.application.java_service.dao.repository;

import com.java.application.java_service.dao.entity.TransactionFeeDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TransactionFeeImp implements TransactionFeeDao{

    private EntityManager entityManager;

    @Autowired
    public TransactionFeeImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(TransactionFeeDetails theTransaction)
    {
        entityManager.persist(theTransaction);
    }

    @Override
    public TransactionFeeDetails findById(Integer id) {
        return entityManager.find(TransactionFeeDetails.class, id);
    }

    @Override
    public List<TransactionFeeDetails> findAll() {

        TypedQuery<TransactionFeeDetails> theQuery = entityManager.createQuery("From TransactionFeeDetails order by transactionFeeId asc",TransactionFeeDetails.class);

        return theQuery.getResultList();
    }

    @Override
    public List<TransactionFeeDetails> findByFeeId(Integer id) {

        TypedQuery <TransactionFeeDetails> theQuery = entityManager.createQuery(" From TransactionFeeDetails where transactionFeeId=:id",TransactionFeeDetails.class);

        theQuery.setParameter("id",id);

        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void updateById(TransactionFeeDetails theTransaction) {
        entityManager.merge(theTransaction);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        TransactionFeeDetails transactionFeeDetails = entityManager.find(TransactionFeeDetails.class,id);
        entityManager.remove(transactionFeeDetails);
    }
}
