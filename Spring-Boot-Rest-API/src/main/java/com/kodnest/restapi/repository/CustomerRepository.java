package com.kodnest.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.restapi.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
