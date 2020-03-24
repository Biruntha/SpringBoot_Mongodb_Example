package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.DepartmentRepository;
import com.example.demo.Entity.Department;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepts() {
		return departmentRepository.findAll();
	}

	public Department createDept(Department department) {
		return departmentRepository.insert(department);
	}

	public Optional<Department> getDeptById(Integer id) {
		return departmentRepository.findById(id);
	}

	public Department updateDept(Department department) {
		return departmentRepository.save(department);
	}

	public Integer deleteDept(Integer id) {
		departmentRepository.deleteById(id);
		return id;
	}

	public List<Department> findDeptByName(String deptName) {
		return departmentRepository.findDepartmentByName(deptName);
	}

	public Department findDeptByEmpName(String empName) {
		return departmentRepository.findDepartmentByEmployeeName(empName);
	}

}
