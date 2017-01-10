package com.pattern.structural.fecade.employee;

public class EmployeeService implements IEmployeeService {

	@Override
	public long addEmployee(Employee employee) {
		if (employee != null && employee.getName() != null
				&& employee.getEmail() != null) {
			return EmployeeIdGenerator.getNextEmpId();
		}
		throw new RuntimeException("Invalid employee details!");
	}

}
