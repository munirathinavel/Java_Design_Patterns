package com.pattern.structural.bridge;

public class MySqlEmployeePersistence implements IEmployeePersistenceProvider {

	@Override
	public long saveEmployee(Employee employee) {
		System.out.println("MySql - saving employee " + employee + " ..");
		return 0;
	}

	@Override
	public Employee getEmployeeById(long empId) {
		System.out.println("MySql - getting employee by id " + empId + " ..");
		return null;
	}

	@Override
	public boolean deleteEmployeeById(long empId) {
		System.out.println("MySql - deleting employee by id " + empId + " ..");
		return false;
	}

}
