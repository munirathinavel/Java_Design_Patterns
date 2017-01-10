package com.pattern.structural.decorator;

import javax.swing.JFrame;

public class DecoratorPatternDemo {
	private static boolean showScrollableWindow = true;

	public static void main(String[] args) {
		Window window = new SimpleWindow();
		JFrame frame = (JFrame) window.renderWindow();
		frame.setVisible(true);

		if (showScrollableWindow) {
			// hide old window
			frame.setVisible(false);

			// decorate old window to provide scrolling
			window = new ScrollableWindow(window);
			frame = (JFrame) window.renderWindow();
			frame.setTitle("Scrollable Window");
			frame.setVisible(true);
		}
	}

}
