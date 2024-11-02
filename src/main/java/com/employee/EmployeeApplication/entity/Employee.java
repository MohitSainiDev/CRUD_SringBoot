package com.employee.EmployeeApplication.entity;

public class Employee {
	int empoyeeId;
	String employeeName;
	String employeeCity;

	public Employee(int empoyeeId, String employeeName, String employeeCity) {
		super();
		this.empoyeeId = empoyeeId;
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
	}

	public int getEmpoyeeId() {
		return empoyeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}


}
