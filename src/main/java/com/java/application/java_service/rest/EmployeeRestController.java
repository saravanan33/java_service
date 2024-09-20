package com.java.application.java_service.rest;


import com.java.application.java_service.Service.EmployeeServiceDao;
import com.java.application.java_service.dao.entity.Employee;
import com.java.application.java_service.dao.repository.EmployeeDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class EmployeeRestController {

    private EmployeeServiceDao employeeDao;
    private Employee employee;

    public EmployeeRestController(EmployeeServiceDao theEmployeeDao) {
        employeeDao = theEmployeeDao;
//        employee = new Employee("saravanan", "viswa", "saravana@gmail.com");
//        System.out.println(employeeDao.save(employee));
    }

    @GetMapping("/list")
    public List<Employee> getAllListData() {
        return employeeDao.findAll();

    }

    @GetMapping("/{id}")
    public Employee getDataById(@PathVariable int id) {
        return  employeeDao.findById(id);
    }

    @PostMapping("/store")
    public Employee insertData(@RequestBody Employee theEmployee) {

        theEmployee.setEmployeeId(0);
        Employee savedEmployee = employeeDao.save(theEmployee);
        return savedEmployee;
    }

    @PutMapping("/update")
    public Employee updateData(@RequestBody Employee theEmployee) {

        employee = employeeDao.save(theEmployee);
        return employee;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {

        Employee employee = employeeDao.findById(id);
        employeeDao.deleteById(id);
        return "Employee deleted successfully :"+ id;
    }
}
