package com.learning.employeerestdemo.Controller;

import com.learning.employeerestdemo.Model.Employees;
import com.learning.employeerestdemo.Service.EmployeeService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public Employees findById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/NewEmployees")
    public ResponseEntity<Employees> createEmployees(@RequestBody Employees empl) {
          Employees db = employeeService.createEmployee(empl);
          return ResponseEntity.ok(db);
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable int id){
        employeeService.DeleteEmployee(id);
    }

    // Update is remaining
    @PutMapping("/employees/{id}")
    public Employees UpdateById(@RequestBody Employees emp, @PathVariable(value = "id") int id){
        Employees db=employeeService.createEmployee(emp);
        db.setEmail(db.getEmail());
        db.setFirstName(db.getFirstName());
        db.setLastName(db.getLastName());
        db.setId(id);
        return db;
    }
}
