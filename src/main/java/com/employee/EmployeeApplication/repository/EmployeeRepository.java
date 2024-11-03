package com.employee.EmployeeApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EmployeeApplication.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
