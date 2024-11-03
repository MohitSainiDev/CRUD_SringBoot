package com.employee.EmployeeApplication.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeApplication.entity.Address;
import com.employee.EmployeeApplication.entity.Employee;
import com.employee.EmployeeApplication.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	List<Employee> employeeList = new ArrayList<>(Arrays.asList(new Employee(1, "First Employee", "Panchkula"),
			new Employee(2, "Second Employee", "Chandigarh")));

	public List<Employee> getAllEmployees() {
//		return employeeList;
		return employeeRepository.findAll();
	}

	public Employee getAnEmpoyee(int id) {
//		for (Employee e : employeeList) {
//			if (e.getEmpoyeeId() == id)
//				return e;
//		}
//		return null;
		return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException());
	}


	public void createEmployee(Employee employee) {
//		employeeList.add(employee);
		ArrayList<Address> addressArrayList = new ArrayList<>();

		for (Address address : employee.getAddresses()) {
			addressArrayList.add(new Address(address.getLine1(), address.getLine2(), address.getZipCode(),
					address.getCity(), address.getState(), address.getCountry(), employee));
		}
		employee.setAddresses(addressArrayList);
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employee emp) {
//		int id = emp.getEmpoyeeId();
//		for (Employee e : employeeList) {
//			if (e.getEmpoyeeId() == id) {
//				e.setEmployeeName(emp.getEmployeeName());
//				e.setEmployeeCity(emp.getEmployeeCity());
//
//				break;
//			}
//		}
		employeeRepository.save(emp);

	}

	public void deleteEmployee(int id) {

//		if (getAnEmpoyee(id) != null) {
//			employeeList.remove(getAnEmpoyee(id));
//		}
		employeeRepository.delete(employeeRepository.getById(id));

	}

}
