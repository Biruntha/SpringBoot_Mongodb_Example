package com.example.demo.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
