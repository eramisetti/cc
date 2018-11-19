package com.cc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.aspect.Loggable;
import com.cc.data.entity.Customer;
import com.cc.data.repository.CustomerRepository;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Loggable
    public List<Customer> getAll(){
        return (List<Customer>) this.customerRepository.findAll();
    }

    @Loggable
    public Customer findOne(String id){
        return this.customerRepository.findOne(id);
    }
}
