package com.narraboss.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.narraboss.modal.Employee;

@Repository 
public interface EmployeeDao extends JpaRepository<Employee, Long>{

	Employee findByName( String name);
	


	

}
