package com.java.application.java_service.dao.repository;

import com.java.application.java_service.dao.entity.TransactionFeeDetails;

import java.util.List;

public interface TransactionFeeDao {

    void save(TransactionFeeDetails theTransaction);

    TransactionFeeDetails findById(Integer id);

    List<TransactionFeeDetails> findAll();

    List<TransactionFeeDetails> findByFeeId(Integer id);

    void updateById(TransactionFeeDetails theTransaction);

    void deleteById(Integer id);
}
