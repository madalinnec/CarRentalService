package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.Customer;
import com.project.carrentalservice.exception.EntityNotFoundException;
import com.project.carrentalservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(int id) throws EntityNotFoundException {
        Optional<Customer> optional = customerRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        throw new EntityNotFoundException(String.format("The object with id %s doesn't exist in the database", id));
    }

    @Override
    public void deleteCustomerById(int id) {
        customerRepository.deleteById(id);
    }
}