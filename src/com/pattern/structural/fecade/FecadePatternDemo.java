package com.pattern.structural.fecade;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.pattern.structural.fecade.employee.Employee;
import com.pattern.structural.fecade.project.EmployeeProject;

public class FecadePatternDemo {
	public static void main(String[] args) {
		IEmployeeManagementServiceFecade empMgmtFecade = new EmployeeManagementServiceFecade();

		Employee employee = getNewEmployee();
		EmployeeProject result = empMgmtFecade.addAndAssociateEmployeeToProject(employee, "Connect");
		if (result != null && result.getEmpId() > 0 && result.getProjId() > 0) {
			System.out.println("Added new employee " + employee.getName() + " and associated to project " + "Connect");
			return;
		}
		System.out.println("Unable to add new employee " + employee.getName() + " and associate to project " + "Connect");
	}

	private static Employee getNewEmployee() {
		String empCode = currentDateTime();
		String empName = "Employee-" + empCode;
		String email = "email-" + empCode + "@gmail.com";
		return new Employee(empName, email);
	}

	private static String currentDateTime() {
		return new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date());
	}

}
