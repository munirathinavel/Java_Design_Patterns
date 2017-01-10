package com.pattern.structural.decorator;

import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollableWindow extends DecoratedWindow {
	public ScrollableWindow(Window window) {
		super(window);
	}

	@Override
	public Object renderWindow() {
		// render decorated window
		JFrame frame = (JFrame) super.renderWindow();

		// render scroll bar
		return renderScrollbar(frame);

	}

	private Object renderScrollbar(JFrame frame) {
		JRootPane rootPane = (JRootPane) frame.getComponent(0);
		JTextArea textArea = (JTextArea) rootPane.getContentPane().getComponent(0);
		textArea.setText("Text inside window");

		JScrollPane scrollPane = new JScrollPane(textArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		frame.add(scrollPane);

		return frame;
	}

}
