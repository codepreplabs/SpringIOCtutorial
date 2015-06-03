package com.codepreplabs.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int employeeId;
	private String employeeName;
	private Department department;

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

	public Department getDepartment() {
		return department;
	}
	
	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}

}
