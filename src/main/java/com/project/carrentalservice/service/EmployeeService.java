package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.Employee;
import com.project.carrentalservice.exception.EntityNotFoundException;
import java.util.List;

public interface EmployeeService {

    void createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id) throws EntityNotFoundException;

    void deleteEmployeeById(int id) throws EntityNotFoundException;

}
