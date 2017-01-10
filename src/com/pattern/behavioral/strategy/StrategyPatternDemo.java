package com.pattern.behavioral.strategy;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		System.out.println("Executing Connect deployments ..");
		
		System.out.println("\nDeploying to Dev2 Cloud ..");
		ConnectDeployment connDeployment = new ConnectDeployment(new Dev2DeploymentStrategy());
		connDeployment.execute();

		System.out.println("\nDeploying to Dev4 Cloud ..");
		connDeployment = new ConnectDeployment(new Dev4DeploymentStrategy());
		connDeployment.execute();
	}

}
