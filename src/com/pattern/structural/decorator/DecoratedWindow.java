package com.pattern.structural.decorator;

public class DecoratedWindow implements Window {

	private Window privateWindow;

	public DecoratedWindow(Window window) {
		this.privateWindow = window;
	}

	@Override
	public Object renderWindow() {
		return privateWindow.renderWindow();
	}

}
