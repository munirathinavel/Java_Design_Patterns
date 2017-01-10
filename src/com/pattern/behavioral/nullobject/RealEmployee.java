package com.pattern.behavioral.nullobject;

public class RealEmployee extends Employee {

	public RealEmployee(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
