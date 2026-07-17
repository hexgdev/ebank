package com.ebank.ebankapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebank.ebankapp.entities.CustomerEntity;
import com.ebank.ebankapp.repositories.CustomerRepository;

@RestController
@RequestMapping("/api/")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping
    public String createCustomer(@RequestBody CustomerEntity customer) {

        customerRepository.save(customer);
        return "Customer created successfully";
    }
}
