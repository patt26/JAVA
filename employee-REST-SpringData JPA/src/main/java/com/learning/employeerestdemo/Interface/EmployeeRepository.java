package com.learning.employeerestdemo.Interface;

import com.learning.employeerestdemo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
