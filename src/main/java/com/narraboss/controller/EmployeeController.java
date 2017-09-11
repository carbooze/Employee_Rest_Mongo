/**
 * 
 */
package com.narraboss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.narraboss.modal.Employee;
import com.narraboss.service.Employeeservice;

/**
 * @author basanth
 *
 */
@RestController
@RequestMapping("/narraboss")
public class EmployeeController {

	@Autowired
	Employeeservice employeeservice;

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {

		emp = employeeservice.addEmployee(emp);

		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);

	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee(@RequestBody long id) {

		Employee employee = employeeservice.GetById(id);

		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);

	}
	
	
	
}
