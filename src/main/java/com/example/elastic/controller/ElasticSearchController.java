package com.example.elastic.controller;

import com.example.elastic.model.Customer;
import com.example.elastic.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElasticSearchController {

  @Autowired private CustomerRepository customerRepository;

  @PostMapping("/saveCustomer")
  public int saveCustomer(@RequestBody List<Customer> customerList) {
    customerRepository.saveAll(customerList);
    return customerList.size();
  }

  @GetMapping("/findAll")
  public Iterable<Customer> findAllCustomer() {
    return customerRepository.findAll();
  }

  @GetMapping("/findByFirstName/{firstName}")
  public List<Customer> findByFirstName(@PathVariable("firstName") String firstName) {
    return customerRepository.findByFirstName(firstName);
  }
}
