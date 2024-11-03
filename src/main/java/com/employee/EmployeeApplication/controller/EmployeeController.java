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
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> findAllEmployees() {

		return employeeService.getAllEmployees();

	}
	
	@GetMapping("/employees/{id}")
	public Employee findAnEmployees(@PathVariable int id) {

		return employeeService.getAnEmpoyee(id);

	}

	@PostMapping("/employees")
	public void CreateAnEmployees(@RequestBody Employee emp) {

		employeeService.createEmployee(emp);

	}

	@PutMapping("/employees")
	public void UpdateEmployees(@RequestBody Employee emp) {

		employeeService.updateEmployee(emp);

	}

	@DeleteMapping("/employees/{id}")
	public List<Employee> DeleteEmployees(@PathVariable int id) {

		employeeService.deleteEmployee(id);
		return employeeService.getAllEmployees();

	}

}
