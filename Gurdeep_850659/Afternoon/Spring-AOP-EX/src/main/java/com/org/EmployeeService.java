package com.org;


import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	public void store() {
		System.out.println("**** store() inside EmployeeService ****");
	}
	
	public void delete() {
		System.out.println("*** delete() inside EmployeeService ****");
	}
	public void getEmployee(int id) {
		System.out.println("***** getEmployee(int) inside Employee Service");
	}
	public void getName(int id) {
		System.out.println("***** getName(int) inside Employee Service");
	}
	public void updateEmployee(int id, String name) {
		System.out.println("***** updateEmployee(int,String) inside Employee Service");
	}
	public void getAllEmployees() {
		System.out.println("***** getAllEmployees inside Employee Service");
	}
	public String getString() {
		System.out.println("***** getSteing() inside Employee Service");
String s=null;
return s;
	}
	public void updateEmp(int id, String s, double amt) {
		System.out.println("******* updateEmp(id.par) inside Employee Service");
	}
}
