package com.pattern.structural.fecade;

import com.pattern.structural.fecade.employee.Employee;
import com.pattern.structural.fecade.employee.EmployeeService;
import com.pattern.structural.fecade.employee.IEmployeeService;
import com.pattern.structural.fecade.project.EmployeeProject;
import com.pattern.structural.fecade.project.IProjectService;
import com.pattern.structural.fecade.project.ProjectService;

public class EmployeeManagementServiceFecade implements IEmployeeManagementServiceFecade {

	private IEmployeeService employeeService = new EmployeeService();
	private IProjectService projectService = new ProjectService();

	@Override
	public EmployeeProject addAndAssociateEmployeeToProject(Employee employee, String projName) {
		long empId = employeeService.addEmployee(employee);
		long projId = projectService.getProjectIdByName(projName);

		System.out.println("In addAndAssociateEmployeeToProject() - empId: " + empId + " projId: " + projId);

		boolean result = projectService.associateEmployeeToProject(empId, projId);
		System.out.println("In addAndAssociateEmployeeToProject() - result: " + result);
		if (result) {
			return new EmployeeProject(empId, projId);
		}
		return null;
	}

}
