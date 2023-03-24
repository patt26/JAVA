package com.learning.employeerestdemo.Controller;

import com.learning.employeerestdemo.Model.Employees;
import com.learning.employeerestdemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService empl) {
        this.employeeService = empl;
    }

    @GetMapping("/employees")
    public List<Employees> find() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public List<Employees> findById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/NewEmployees")
    public void createEmployees() {
        boolean flag = true;
        Employees emp1 = new Employees("Zack", "Lister", "zackList@yahoo.com");
        Employees emp2 = new Employees("Jack", "Dorothy", "jack23@hotmail.com");
        employeeService.createEmployee(emp1);
        employeeService.createEmployee(emp2);

    }
}
