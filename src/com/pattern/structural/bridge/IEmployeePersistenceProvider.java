package com.pattern.structural.bridge;

public interface IEmployeePersistenceProvider {
	long saveEmployee(Employee employee);

	Employee getEmployeeById(long empId);

	boolean deleteEmployeeById(long empId);
}
