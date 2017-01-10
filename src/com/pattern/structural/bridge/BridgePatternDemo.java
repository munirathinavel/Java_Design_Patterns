package com.pattern.structural.bridge;

public class BridgePatternDemo {

	enum PersistenceProvider {
		ORACLE, MYSQL
	};

	private static PersistenceProvider persistenceProvider = PersistenceProvider.ORACLE;

	public static void main(String[] args) {
		IEmployeePersistenceProvider empPersistenceProvider = null;
		if (PersistenceProvider.MYSQL.equals(persistenceProvider)) {
			empPersistenceProvider = new MySqlEmployeePersistence();
		} else {
			empPersistenceProvider = new OracleEmployeePersistence();
		}

		IEmployeeDao employeeDao = new EmployeeDao(empPersistenceProvider);

		employeeDao.saveEmployee(new Employee(1, "Employee-1"));

		employeeDao.getEmployeeById(1);

		employeeDao.deleteEmployeeById(1);
	}

}
