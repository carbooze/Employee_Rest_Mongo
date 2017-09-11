package com.narraboss.service;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narraboss.Dao.EmployeeDao;
import com.narraboss.modal.Employee;

@Service
public class EmployeeServiceImpl implements Employeeservice {

	@Autowired
	EmployeeDao employeedao;

	@Override
	public List<Employee> employeelist() {

		return employeedao.findAll();
	}

	@Override
	public Employee addEmployee(Employee e) {

		employeedao.save(e);

		return employeedao.findByName(e.getName());
	}

	@Override
	public Employee DeleteEmployee(long id) {

		employeedao.delete(id);

		return null;
	}

	@Override
	public Employee UpdateEmployee(Employee e) {
		employeedao.save(e);
		return null;
	}

	@Override
	public Employee GetById(long id) {

		return employeedao.findOne(id);
	}

}
