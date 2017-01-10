package com.pattern.creational.prototype;

public class PrototypePatternDemo {
	enum CloneType {
		SHALLOW, DEEP_SERIALIZATION
	};

	private static CloneType cloneType = CloneType.SHALLOW;

	public static void main(String[] args) throws Exception {
		Employee employee = new Employee(1, "Employee1", new Department(2, "Department1"));

		System.out.println("Employee object before clone:");
		System.out.println(employee.toString());

		Employee clonedEmployee = null;
		if (CloneType.DEEP_SERIALIZATION.equals(cloneType)) {
			clonedEmployee = new DeepCopyWithSerializationStrategy().cloneObject(employee);
		} else {
			clonedEmployee = new ShallowCopyStrategy().cloneObject(employee);
		}

		System.out.println("\nCloned Employee object:");
		if (clonedEmployee != null) {
			System.out.println(clonedEmployee.toString());

			System.out.println("\nModifying original Employee object after cloning ..");
			employee.setId(11);
			employee.setName("Employee1-Modified");
			employee.getDepartment().setId(21);
			employee.getDepartment().setName("Department1-Modified");

			System.out.println("\nEmployee object after modification:");
			System.out.println(employee.toString());

			System.out.println("\nCloned Employee object:");
			System.out.println(clonedEmployee.toString());
			System.out.println("================================================================");
		}
	}

}
