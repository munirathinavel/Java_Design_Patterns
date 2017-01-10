package com.pattern.creational.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Organization {
	private final Map<Long, Employee> employees = new HashMap<Long, Employee>();

	public Long addEmployee(Employee employee) {
		if (!employees.containsKey(employee.getId())) {
			employees.put(employee.getId(), employee);
		}
		return employee.getId();
	}

	public void removeEmployee(Long empId) {
		if (employees.containsKey(empId)) {
			employees.remove(empId);
		}
	}

	public List<Employee> getAllEmployees() {
		if (employees.values() != null && !employees.values().isEmpty()) {
			return new ArrayList<Employee>(employees.values());
		}
		return null;
	}

}
