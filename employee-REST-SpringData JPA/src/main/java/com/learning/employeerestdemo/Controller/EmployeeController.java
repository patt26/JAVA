package com.learning.employeerestdemo.Controller;

import com.learning.employeerestdemo.Model.Employee;
import com.learning.employeerestdemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Employee> find() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/NewEmployees")
    public ResponseEntity<Employee> createEmployees(@RequestBody Employee empl) {
          Employee db = employeeService.createEmployee(empl);
          return ResponseEntity.ok(db);
    }

    @PostMapping("/Bulkemployees")
    public ResponseEntity<List<Employee>> createMultiples(@RequestBody List<Employee> empl){
        List<Employee> empl1=employeeService.createMultiple(empl);
        return ResponseEntity.ok(empl1);
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable int id){
        employeeService.DeleteEmployee(id);
    }

    // Update is remaining
    @PutMapping("/employees/{id}")
    public Employee UpdateById(@RequestBody Employee emp, @PathVariable(value = "id") int id){
        Employee db=employeeService.createEmployee(emp);
        db.setEmail(db.getEmail());
        db.setFirstName(db.getFirstName());
        db.setLastName(db.getLastName());
        db.setId(id);
        return db;
    }
}
