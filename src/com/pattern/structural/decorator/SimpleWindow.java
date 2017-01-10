package com.pattern.structural.decorator;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SimpleWindow implements Window {
	@Override
	public Object renderWindow() {
		final JFrame frame = new JFrame("Simple Window");
		frame.setBounds(750, 100, 300, 300);
		JTextArea textArea = new JTextArea("Text inside window");
		frame.add(textArea, 0);
		// frame.setVisible(true);

		return frame;
	}

}
