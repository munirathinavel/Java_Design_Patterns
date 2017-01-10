package com.pattern.creational.prototype;

import java.io.Serializable;

public class Department implements Serializable, Cloneable {
	private static final long serialVersionUID = 8811970993558612152L;

	private long id;
	private String name;

	public Department(long id, String name) {
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
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName() + "[")
				.append("hashcode=").append(this.hashCode())
				.append(", id=").append(id)
				.append(", name=").append(name)
				.append("]").toString();
	}

}
