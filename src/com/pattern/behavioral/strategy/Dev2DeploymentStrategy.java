package com.pattern.behavioral.strategy;

public class Dev2DeploymentStrategy implements IDeploymentStrategy {

	@Override
	public void execute() {
		executeDev2Scripts();
		System.out.println("Deployment to Dev2 Cloud is done.");
	}
	
	private void executeDev2Scripts(){
		System.out.println("Executing Dev2 Cloud deployment scripts");
	}

}
