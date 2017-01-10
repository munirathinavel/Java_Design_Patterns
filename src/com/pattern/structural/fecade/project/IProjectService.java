package com.pattern.structural.fecade.project;

public interface IProjectService {
	long getProjectIdByName(String projName);

	boolean associateEmployeeToProject(long empId, long projId);
}
