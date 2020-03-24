package com.spring.scratch.repository;

import com.spring.scratch.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CustomersRepository extends CrudRepository<CustomerEntity, Integer> {
}