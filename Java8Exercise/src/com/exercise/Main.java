package com.exercise;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Service s= new Service();
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the menu");
	while(true) {
		System.out.println("Enter 1 to add employee");
		System.out.println("Enter 2 to find employee by Id");
		System.out.println("Enter 3 to get all employee details");
		System.out.println("Enter 4 to sort list by Id");
		System.out.println("Enter 5 to sort list by Name");
		System.out.println("Enter 6 to sort list by Salary");
		System.out.println("Enter 7 to sort list by DOB");
		System.out.println("Enter 8 to exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			
			System.out.println("Enter id of the emplyee");
			int id=sc.nextInt();
			System.out.println("Enter name of the emplyee");
			String name=sc.next();
			System.out.println("Enter salary of the emplyee");
			double salary=sc.nextDouble();
			System.out.println("Enter dob of the emplyee");
			String dob=sc.next();
			Employee es = new Employee(id, name, salary, LocalDate.parse(dob));
			
			s.addEmployee(es);
			System.out.println("Employee Details Added");
			break;
			
		case 2:
			
			System.out.println("Enter id to be searched");
			int i=sc.nextInt();
			if(s.findEmployee(i)) {
		
				System.out.println("Employee Found");
			}
			else
			{
				System.out.println("Employee not found");
				
			}
			break;
			
		case 3:
			
			s.getEmployee();
			
			break;
			
		case 4:
			
		List<Employee> al=s.getSortedEmployeesById();
		al.forEach(e -> System.out.println(e));
			break;
			
		case 5:
			
			List<Employee> d= s.getSortedEmployeesByName();
			d.forEach(e -> System.out.println(e));
			break;
			
		case 6:
			
			List<Employee> a = s.getSortedEmployeesBySalary();
			a.forEach(e -> System.out.println(e));
			break;
			
		case 7:
			List<Employee> q = s.getSortedEmployeesByDOB();
		q.forEach(e -> System.out.println(e));
		break;
		
		case 8:
			System.out.println("Exiting the application");
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
		}
	}

	}

}
