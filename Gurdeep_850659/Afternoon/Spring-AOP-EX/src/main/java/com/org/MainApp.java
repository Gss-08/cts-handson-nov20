package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		service.delete();
		service.store();
		int id = 0;
		service.getEmployee(id);
		service.getName(id);
		String s= null;
		service.updateEmployee(id, s);
		service.getAllEmployees();
		s=service.getString();
		
		double amt = 0;
		service.updateEmp(id, s, amt);
	}
}
