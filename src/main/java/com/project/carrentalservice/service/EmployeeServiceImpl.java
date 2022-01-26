package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.Employee;
import com.project.carrentalservice.exception.EntityNotFoundException;
import com.project.carrentalservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) throws EntityNotFoundException {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }
        throw new EntityNotFoundException(String.format("The object with id %s doesn't exist in the database", id));
    }

    @Override
    public void deleteEmployeeById(int id) throws EntityNotFoundException {
        employeeRepository.deleteById(id);
    }
}