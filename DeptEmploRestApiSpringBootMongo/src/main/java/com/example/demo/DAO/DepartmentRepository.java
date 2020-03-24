package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Integer>{
	
	List<Department> findDepartmentByName(String name);

	@Query(value = "{'employees.name' : ?0}", fields = "{'employees' : 0}")
	Department findDepartmentByEmployeeName(String empName);
}
