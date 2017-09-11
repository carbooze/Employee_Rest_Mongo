package com.narraboss.service;

import java.util.List;

import com.narraboss.modal.Employee;

public interface Employeeservice {
	
	public List<Employee> employeelist();
	
	public Employee addEmployee( Employee e);

	public Employee DeleteEmployee(long id);

	public Employee UpdateEmployee(Employee e);

}
