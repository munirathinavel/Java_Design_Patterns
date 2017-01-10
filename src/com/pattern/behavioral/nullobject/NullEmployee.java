package com.pattern.behavioral.nullobject;

public class NullEmployee extends Employee {
	public NullEmployee(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return this.name + " not available in employee database.";
	}

}
