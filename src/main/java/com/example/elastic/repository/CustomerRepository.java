package com.example.elastic.repository;

import com.example.elastic.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.List;

public interface CustomerRepository extends ElasticsearchCrudRepository<Customer, String> {
	List<Customer> findByFirstName(String firstName);
}
