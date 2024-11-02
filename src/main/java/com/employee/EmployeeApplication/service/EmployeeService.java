package com.employee.EmployeeApplication.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.EmployeeApplication.entity.Employee;

@Service
public class EmployeeService {

	List<Employee> employeeList = new ArrayList<>(Arrays.asList(new Employee(1, "First Employee", "Panchkula"),
			new Employee(2, "Second Employee", "Chandigarh")));

	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	public Employee getAnEmpoyee(int id) {
		for (Employee e : employeeList) {
			if (e.getEmpoyeeId() == id)
				return e;
		}
		return null;
	}

	public void createEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void updateEmployee(Employee emp) {
		int id = emp.getEmpoyeeId();
		for (Employee e : employeeList) {
			if (e.getEmpoyeeId() == id) {
				e.setEmployeeName(emp.getEmployeeName());
				e.setEmployeeCity(emp.getEmployeeCity());

				break;
			}
		}

	}

	public void deleteEmployee(int id) {

		if (getAnEmpoyee(id) != null) {
			employeeList.remove(getAnEmpoyee(id));
		}

	}

}
