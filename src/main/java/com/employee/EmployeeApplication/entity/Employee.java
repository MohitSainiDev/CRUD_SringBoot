package com.employee.EmployeeApplication.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empoyeeId;
	String employeeName;
	String employeeCity;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_spouse")
	private Spouse spouse;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses;


	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_project", joinColumns = @JoinColumn(name = "fk_employee"), inverseJoinColumns = @JoinColumn(name = "fk_project"))
	private List<Project> projects;

	public Employee() {
		super();
	}

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

	public Spouse getSpouse() {
		return spouse;
	}

	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
