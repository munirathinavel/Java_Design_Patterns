package com.pattern.structural.bridge;

public class OracleEmployeePersistence implements IEmployeePersistenceProvider {

	@Override
	public long saveEmployee(Employee employee) {
		System.out.println("Oracle - saving employee " + employee + " ..");
		return 0;
	}

	@Override
	public Employee getEmployeeById(long empId) {
		System.out.println("Oracle - getting employee by id " + empId + " ..");
		return null;
	}

	@Override
	public boolean deleteEmployeeById(long empId) {
		System.out.println("Oracle - deleting employee by id " + empId + " ..");
		return false;
	}

}
