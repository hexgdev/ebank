package com.ebank.ebankapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebank.ebankapp.entities.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
