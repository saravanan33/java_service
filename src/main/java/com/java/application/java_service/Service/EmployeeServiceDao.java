package com.java.application.java_service.Service;

import com.java.application.java_service.dao.entity.Employee;

import java.util.List;

public interface EmployeeServiceDao {

    Employee save(Employee employee);

    List<Employee> findAll();

    Employee findById(int Id);

    void deleteById(int id);
}
