package com.codepreplabs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int employeeId;
	private String employeeName;

	@Autowired
	@Qualifier(value = "department1")
	private Department department1;

	@Autowired
	@Qualifier(value = "department2")
	private Department department2;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department getDepartment1() {
		return department1;
	}

	public void setDepartment1(Department department1) {
		this.department1 = department1;
	}

	public Department getDepartment2() {
		return department2;
	}

	public void setDepartment2(Department department2) {
		this.department2 = department2;
	}

}
