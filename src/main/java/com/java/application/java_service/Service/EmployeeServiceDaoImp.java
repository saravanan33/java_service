package com.java.application.java_service.Service;


import com.java.application.java_service.dao.entity.Employee;
import com.java.application.java_service.dao.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeServiceDaoImp implements EmployeeServiceDao{

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceDaoImp(EmployeeDao theEmployeeDao) {
        employeeDao = theEmployeeDao;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(int Id) {
        return employeeDao.findById(Id);
    }

    @Override
    public void deleteById(int Id) {
        employeeDao.deleteById(Id);
    }

}
