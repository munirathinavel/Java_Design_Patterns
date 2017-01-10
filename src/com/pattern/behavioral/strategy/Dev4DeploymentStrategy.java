package com.pattern.behavioral.strategy;

public class Dev4DeploymentStrategy implements IDeploymentStrategy {

	@Override
	public void execute() {
		executeDev4Scripts();
		System.out.println("Deployment to Dev4 Cloud is done.");
	}
	
	private void executeDev4Scripts(){
		System.out.println("Executing Dev4 Cloud deployment scripts");
	}

}
