package com.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {

		List<Employee> list= new ArrayList<Employee>();

	public void addEmployee(Employee e) {
	
		list.add(e);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public  boolean findEmployee(int id) {
		if(list.contains(id))
			return true;
		else
			return false;
	}
	public void getEmployee() {
		for(Employee s : list) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getSalary()+" "+s.getDob());
		}
	}
		public List<Employee> getSortedEmployeesById(){
			Collections.sort(list, (e1,e2) -> e1.getId()-e2.getId());
	return list;
		}
		public List<Employee> getSortedEmployeesByName(){
			Collections.sort(list, (e1,e2) -> e1.getName().compareTo(e2.getName()));
	return list;
	}
		public List<Employee> getSortedEmployeesBySalary(){
			Collections.sort(list, (e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
	return list;
}
		public List<Employee> getSortedEmployeesByDOB(){
			Collections.sort(list, (e1,e2) -> e1.getDob().compareTo(e2.getDob()));
	return list;
}
}
