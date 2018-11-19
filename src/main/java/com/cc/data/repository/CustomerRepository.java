package com.cc.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cc.data.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String>{

}
