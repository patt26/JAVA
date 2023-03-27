package com.learning.employeerestdemo.Interface;

import com.learning.employeerestdemo.Model.Employees;

import java.util.List;

public interface EmployeeInterfaceDAO {

    public List<Employees> findAll();

    Employees findById(int id);

    Employees createEmployees(Employees empl);

    void deleteByID(int id);

    Employees updateById(Employees employees,int id);

}
