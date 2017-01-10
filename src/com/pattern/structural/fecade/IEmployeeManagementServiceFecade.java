package com.pattern.structural.fecade;

import com.pattern.structural.fecade.employee.Employee;
import com.pattern.structural.fecade.project.EmployeeProject;

public interface IEmployeeManagementServiceFecade {

	EmployeeProject addAndAssociateEmployeeToProject(Employee employee, String projName);

}
