package com.learning.employeerestdemo.Interface;

import com.learning.employeerestdemo.Model.Employees;

import java.util.List;

public interface EmployeeInterfaceDAO {

    public List<Employees> findAll();

    List<Employees> findById(int id);

    void createEmployees(Employees empl);
}
