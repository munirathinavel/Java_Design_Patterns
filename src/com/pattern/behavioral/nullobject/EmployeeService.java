package com.pattern.behavioral.nullobject;

public class EmployeeService {
	public static final String[] employeeNamesInDatabase = { "Employee1", "Employee2", "Employee3" };

	public Employee getEmployee(String name) {
		for (String nameInDatabase : employeeNamesInDatabase) {
			if (nameInDatabase.equalsIgnoreCase(name)) {
				return new RealEmployee(name);
			}
		}
		return new NullEmployee(name);
	}

}
