package com.project.carrentalservice.controller;

import com.project.carrentalservice.domain.Employee;
import com.project.carrentalservice.exception.EntityNotFoundException;
import com.project.carrentalservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) throws EntityNotFoundException {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee/create")
    public void createEmployee(Employee employee){
        employeeService.createEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployeeById(int id) throws EntityNotFoundException {
        employeeService.deleteEmployeeById(id);
    }

}
