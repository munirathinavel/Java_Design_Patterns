package com.pattern.structural.bridge;

public interface IEmployeeDao {
	long saveEmployee(Employee employee);

	Employee getEmployeeById(long empId);

	boolean deleteEmployeeById(long empId);

}
