package com.pattern.behavioral.strategy;

public class ConnectDeployment {
	private IDeploymentStrategy deploymentStrategy;

	public ConnectDeployment(IDeploymentStrategy deploymentStrategy) {
		this.deploymentStrategy = deploymentStrategy;
	}

	public IDeploymentStrategy getDeploymentStrategy() {
		return deploymentStrategy;
	}

	public void setDeploymentStrategy(IDeploymentStrategy deploymentStrategy) {
		this.deploymentStrategy = deploymentStrategy;
	}

	public void execute() {
		this.deploymentStrategy.execute();
	}

}
