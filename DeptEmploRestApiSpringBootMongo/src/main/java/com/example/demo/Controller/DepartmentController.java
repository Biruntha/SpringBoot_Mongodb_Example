package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Department;
import com.example.demo.Service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	private List<Department> listAllDepts() {
		return departmentService.getAllDepts();
	}
	
	@GetMapping(params = "deptId")
	private Optional<Department> getDeptById(@RequestParam Integer deptId) {
		return departmentService.getDeptById(deptId);
	}
	
	@PostMapping
	private Department createDept(@RequestBody Department department) {
		return departmentService.createDept(department);
	}
	
	@PutMapping(value = "/{id}")
	private Department updateDept(@PathVariable Integer id, @RequestBody Department department) {
		department.setId(id);
		return departmentService.updateDept(department);
	}
	
	@DeleteMapping(value = "/{id}")
	private Integer deleteDept(@PathVariable Integer id) {
		return departmentService.deleteDept(id);
	}
	
	@GetMapping(params = "deptName")
	private List<Department> listDeptByName(@RequestParam String deptName) {
		return departmentService.findDeptByName(deptName);
	}
	
	@GetMapping(params = "empName")
	private Department listDeptByEmpName(@RequestParam String empName) {
		return departmentService.findDeptByEmpName(empName);
	}
}
