package com.employee.EmployeeApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.EmployeeApplication.entity.Employee;
import com.employee.EmployeeApplication.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empoyeeService;

	@GetMapping("/employees")
	public List<Employee> findAllEmployees() {

		return empoyeeService.getAllEmployees();

	}
	
	@GetMapping("/employees/{id}")
	public Employee findAnEmployees(@PathVariable int id) {

		return empoyeeService.getAnEmpoyee(id);

	}

	@PostMapping("/employees")
	public void CreateAnEmployees(@RequestBody Employee emp) {

		empoyeeService.createEmployee(emp);

	}

	@PutMapping("/employees")
	public void UpdateEmployees(@RequestBody Employee emp) {

		empoyeeService.updateEmployee(emp);

	}

	@DeleteMapping("/employees/{id}")
	public List<Employee> DeleteEmployees(@PathVariable int id) {

		empoyeeService.deleteEmployee(id);
		return empoyeeService.getAllEmployees();

	}

}
