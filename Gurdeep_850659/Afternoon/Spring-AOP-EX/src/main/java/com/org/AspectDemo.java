package com.org;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AspectDemo {
	@After("execution(public * com.org.EmployeeService.s*(..))")
	public void log() {
		System.out.println("----- log method is called ------");
	}
	@Before("execution(public * com.org.EmployeeService.*(int))")
	public void logger() {
		System.out.println("-------- Method with Int Parameter--------");
	}
	@Before("execution(public * com.org.EmployeeService.*(int,String))")
	public void logg() {
		System.out.println("-------- Method with Int String Parameter--------");
	}
	@After("execution(public * com.org.EmployeeService.g*(..))")
	public void get() {
		System.out.println("-------- Method starts with get--------");

	}
	@Before("execution(public String EmployeeService.*(..))")
	public void string() {
		System.out.println("-------- Method returns string--------");

	}
	@After("execution(public * com.org.EmployeeService.*(int,..))")
	public void anyParam() {
		System.out.println("-------- Method with int and any other parameters--------");

	}
}
