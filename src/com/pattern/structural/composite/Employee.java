package com.pattern.structural.composite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Employee implements Serializable {
	private static final long serialVersionUID = 2096337604412626322L;

	private static final String TAB = "\t";

	private Long id;
	private String name;
	private int level;
	private final Map<Long, Employee> subordinates = new LinkedHashMap<Long, Employee>();

	public Employee(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(Long id, String name, int level) {
		this.id = id;
		this.name = name;
		this.level = level;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void addSubordinate(Employee employee) {
		if (employee != null && !subordinates.containsKey(employee.getId())) {
			subordinates.put(employee.getId(), employee);
		}
	}

	public void removeSubordinate(Long empId) {
		if (empId != null && subordinates.containsKey(empId)) {
			subordinates.remove(empId);
		}
	}

	public Employee getSubordinate(Long empId) {
		if (!subordinates.values().isEmpty()) {
			return subordinates.get(empId);
		}
		return null;
	}

	public List<Employee> getAllSubordinates() {
		if (!subordinates.values().isEmpty()) {
			return new ArrayList<Employee>(subordinates.values());
		}
		return null;
	}

	public boolean isHavingSubordinates() {
		if (!subordinates.values().isEmpty()) {
			return true;
		}
		return false;
	}

	public void print() {
		System.out.println(this.toString() + "\n");
		if (isHavingSubordinates()) {
			printSubordinates();
		}
	}

	public void printSubordinates() {
		if (!subordinates.values().isEmpty()) {
			for (Employee employee : subordinates.values()) {
				employee.print();
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return new StringBuilder(getLevelString())
				.append(this.getClass().getSimpleName() + "[")
				.append("id=").append(id)
				.append(", name=").append(name)
				.append("]").toString();
	}

	private String getLevelString() {
		StringBuilder sb = new StringBuilder();
		int count=(level * 8);
		while (count > 0) {
			sb.append(" ");
			count--;
		}
		//sb.append("-");
		return sb.toString();
	}

}
