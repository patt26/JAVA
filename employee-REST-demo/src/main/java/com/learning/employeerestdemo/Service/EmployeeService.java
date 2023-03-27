package com.learning.employeerestdemo.Service;

import com.learning.employeerestdemo.Implementation.EmployeeImpl;
import com.learning.employeerestdemo.Model.Employees;
import jakarta.transaction.Transactional;
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

    public Employees getEmployeeById(int id) {
        return employee.findById(id);
    }

    @Transactional
    public Employees createEmployee(Employees emp) {
        return employee.createEmployees(emp);
    }

    @Transactional
    public void DeleteEmployee(int id){
        employee.deleteByID(id);
    }

   /* @Transactional
    //Update is remaining
    public Employees UpdateById(Employees emp,int id){
        return employee.updateById(emp,id);
    }*/
}
