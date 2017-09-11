/**
 * 
 */
package com.narraboss.modal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 * @author basanth
 *
 */
@TableGenerator(name = "tab", initialValue = 0, allocationSize = 50)
@Entity
public class Employee implements Serializable {

	@GeneratedValue(strategy = GenerationType.TABLE, generator = "tab")
	@Id
	private long id;
	private String Name;
	private Department dept;

	public Employee(long id, String name, Department dept) {
		super();
		this.id = id;
		Name = name;
		this.dept = dept;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
