package com.spring.scratch.repository;

import com.spring.scratch.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CustomersRepository extends JpaRepository<CustomerEntity, Integer> {
}