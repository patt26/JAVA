package com.learning.employeerestdemo.Service;

import com.learning.employeerestdemo.Implementation.EmployeeImpl;
import com.learning.employeerestdemo.Model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeImpl employee;

    @Autowired
    public EmployeeService(EmployeeImpl em) {
        this.employee = em;
    }

    public List<Employees> getAllEmployees() {
        return employee.findAll();
    }

    public List<Employees> getEmployeeById(int id) {
        return employee.findById(id);
    }

    public void createEmployee(Employees emp) {
        employee.createEmployees(emp);
    }
}
