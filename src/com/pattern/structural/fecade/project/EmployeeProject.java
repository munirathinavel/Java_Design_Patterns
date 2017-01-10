package com.pattern.structural.fecade.project;

public class EmployeeProject {
	private long empId;
	private long projId;

	public EmployeeProject(long empId, long projId) {
		this.empId = empId;
		this.projId = projId;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public long getProjId() {
		return projId;
	}

	public void setProjId(long projId) {
		this.projId = projId;
	}

}
