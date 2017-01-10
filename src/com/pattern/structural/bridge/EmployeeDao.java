package com.pattern.structural.bridge;

public class EmployeeDao implements IEmployeeDao {
	private IEmployeePersistenceProvider employeePersistenceProvider = null;

	public EmployeeDao(IEmployeePersistenceProvider employeePersistenceProvider) {
		this.employeePersistenceProvider = employeePersistenceProvider;
	}

	@Override
	public long saveEmployee(Employee employee) {
		System.out.println("Saving employee: " + employee + " ..");
		return employeePersistenceProvider.saveEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(long empId) {
		System.out.println("Getting employee by id: " + empId + " ..");
		return employeePersistenceProvider.getEmployeeById(empId);
	}

	@Override
	public boolean deleteEmployeeById(long empId) {
		System.out.println("Deleting employee by id: " + empId + " ..");
		return employeePersistenceProvider.deleteEmployeeById(empId);
	}

}
