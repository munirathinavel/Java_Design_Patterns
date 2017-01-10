package com.pattern.structural.fecade.project;

import java.util.HashMap;
import java.util.Map;

public class ProjectService implements IProjectService {
	private Map<String, Long> projNameToIdMap = null;

	public ProjectService() {
		projNameToIdMap = new HashMap<String, Long>();
		projNameToIdMap.put("Connect", 1L);
		projNameToIdMap.put("OpenAPI", 2L);
		projNameToIdMap.put("PAAM", 3L);
	}

	@Override
	public long getProjectIdByName(String projName) {
		System.out.println("Getting project id for the name: " + projName);
		return projNameToIdMap.containsKey(projName) ? projNameToIdMap.get(projName) : 0l;
	}

	@Override
	public boolean associateEmployeeToProject(long empId, long projId) {
		System.out.println("Associating employee to project - empId: " + empId + " projId: " + projId);
		return (empId > 0 && projId > 0) ? true : false;
	}

}
