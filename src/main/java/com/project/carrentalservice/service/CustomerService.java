package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.Customer;
import com.project.carrentalservice.exception.EntityNotFoundException;
import java.util.List;

public interface CustomerService {

    void createCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(int id) throws EntityNotFoundException;

    void deleteCustomerById(int id);
}
