package com.learning.employeerestdemo.Service;


import com.learning.employeerestdemo.Interface.EmployeeRepository;
import com.learning.employeerestdemo.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository em) {
        this.employeeRepository = em;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        Optional<Employee> op = employeeRepository.findById(id);

        Employee emp = null;
        if (op.isPresent()) {
            emp = op.get();
        }
        return emp;
    }


    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    public List<Employee> createMultiple(List<Employee> emp) {
        return employeeRepository.saveAll(emp);
    }


    public void DeleteEmployee(int id) {
        employeeRepository.deleteById(id);

    }


//public Employees UpdateById(Employees emp, int id) {
//        Optional<Employees> empl = employeeRepository.findById(id);
//        if (employeeRepository.existsById(id))
//            emp.setFirstName(emp.getFirstName());
//        emp.setLastName(emp.getLastName());
//        emp.setEmail(emp.getEmail());
//        return empl;



    }



