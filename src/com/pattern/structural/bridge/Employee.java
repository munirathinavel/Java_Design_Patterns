package com.pattern.structural.bridge;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 8874413654041006569L;

	private long id;
	private String name;

	public Employee(long id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName() + "[")
				.append("id=").append(id)
				.append(", name=").append(name)
				.append("]").toString();
	}

}
