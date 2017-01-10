package com.pattern.creational.prototype;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {
	private static final long serialVersionUID = 8874413654041006569L;

	private long id;
	private String name;
	private Department department;

	public Employee(long id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName() + "[")
				.append("hashcode=").append(this.hashCode())
				.append(", id=").append(id)
				.append(", name=").append(name)
				.append(", department=").append(department.toString())
				.append("]").toString();
	}

	public void print() {
		System.out.println(this.toString() + "\n");
	}

}
