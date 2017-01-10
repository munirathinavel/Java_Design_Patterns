package com.pattern.structural.composite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Organization implements Serializable {
	private static final long serialVersionUID = 7463129247138670425L;

	private String code;
	private String name;
	private String address;
	private List<Employee> employees = new ArrayList<Employee>();

	public Organization(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void print() {
		String orgInfo = new StringBuilder(this.getClass().getSimpleName() + "[")
				.append("code=").append(code).append(", name=").append(name)
				.append("]").toString();
		System.out.println(orgInfo + "\n");

		if (!employees.isEmpty()) {
			for (Employee employee : employees) {
				employee.print();
			}
		}
	}

}
