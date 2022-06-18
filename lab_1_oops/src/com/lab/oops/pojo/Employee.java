package com.lab.oops.pojo;

// Employee POJO for storing details
public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	private int deptCode;
	private String email;
	public Employee() {
		super();
	}
	public Employee(String firstName, String lastName, int deptCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if(deptCode == 1) {
			this.department = "Technical";
		} else if(deptCode == 2) {
			this.department = "Admin";
		} else if(deptCode == 3) {
			this.department = "HumanResource";
		}else if(deptCode == 4) {
			this.department = "Legal";
		} else {
			this.department = "NA";
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + ", email="
				+ email + "]";
	}
	
	

}
