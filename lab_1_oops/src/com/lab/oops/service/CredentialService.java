package com.lab.oops.service;

import java.security.SecureRandom;

import com.lab.oops.pojo.Employee;

public class CredentialService {
	
	private final static String COMPANY_NAME = "greatlearning";
	private final static String DOT = ".";
	private final static String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private final static String AT = "@";
	private final static String COM = "com";
	private static SecureRandom random = new SecureRandom();
	
	private static String generateEmailAddress(Employee emp) {
		StringBuilder sb = new StringBuilder();
		sb.append(emp.getFirstName().toLowerCase());
		sb.append(emp.getLastName().toLowerCase());
		sb.append(AT);
		sb.append(emp.getDepartment().toLowerCase());
		sb.append(DOT);
		sb.append(COMPANY_NAME);
		sb.append(DOT);
		sb.append(COM);
		return sb.toString();
	}
	
	//For generating password
	private static String generatePassword() {
		StringBuilder sbr = new StringBuilder();
		
		for(int i=0;i<10;i++) {
			int randomIndex = random.nextInt(CHARS.length());
			sbr.append(CHARS.charAt(randomIndex));
		}
		return sbr.toString();
	}
	
	public static void showCredentials(String firstName,String lastName, int deptCode) {
		Employee emp = new Employee(firstName,lastName,deptCode);
		System.out.println("Dear "+emp.getFirstName() + "! your generated credentials are as follows");
		System.out.println("Email ----> "+generateEmailAddress(emp));
		System.out.println("Password -> "+generatePassword());
	}

}
