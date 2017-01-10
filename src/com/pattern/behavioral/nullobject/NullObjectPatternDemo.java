package com.pattern.behavioral.nullobject;

public class NullObjectPatternDemo {
	public static void main(String[] args) {
		final EmployeeService employeeService = new EmployeeService();

		System.out.println("Tricon Employees:");
		Employee employee = employeeService.getEmployee("Employee1");
		System.out.println(employee.getName());

		employee = employeeService.getEmployee("Employee2");
		System.out.println(employee.getName());

		employee = employeeService.getEmployee("Employee3");
		System.out.println(employee.getName());

		employee = employeeService.getEmployee("Employee4");
		System.out.println(employee.getName());
	}

}
