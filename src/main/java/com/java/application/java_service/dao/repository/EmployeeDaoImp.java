package com.java.application.java_service.dao.repository;


import com.java.application.java_service.dao.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDaoImp implements EmployeeDao{

    private EntityManager entityManager;
    private TypedQuery<Employee> theQuery;
    @Autowired
    public EmployeeDaoImp(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        theQuery = entityManager.createQuery("From Employee", Employee.class);
        return theQuery.getResultList();
    }

    @Override
    public Employee findById(int Id) {
//        theQuery = entityManager.createQuery("From Employee where employeeId=:Id",Employee.class);
//        theQuery.setParameter("Id",Id);
//        return theQuery.getResultList();
            return entityManager.find(Employee.class,Id);
    }

    @Override
    @Transactional
    public void deleteById(int Id) {
        Employee employee = entityManager.find(Employee.class,Id);
        entityManager.remove(employee);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
       return entityManager.merge(employee);
    }

}
