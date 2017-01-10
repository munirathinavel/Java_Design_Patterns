package com.pattern.structural.proxy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ProxyPatternDemo {
	private static final String IMG_PATH = "src/com/pattern/structural/proxy/penguins.jpg";

	public static void main(String[] args) throws Exception {
		prepareAndShowVirtualProxyImageDialog();
	}

	public static void prepareAndShowVirtualProxyImageDialog() throws Exception {
		final JFrame frame = new JFrame("Virtual Proxy Image Demo");
		frame.setBounds(200, 100, 550, 550);
		frame.setLayout(null);

		JButton loadImageButton = new JButton("Load Image");
		loadImageButton.setBounds(20, 20, 100, 40);
		loadImageButton.addActionListener(new LoadImageActionListener());
		frame.add(loadImageButton);

		JButton removeImageButton = new JButton("Remove Image");
		removeImageButton.setBounds(150, 20, 150, 40);
		removeImageButton.addActionListener(new RemoveImageActionListener());
		frame.add(removeImageButton);

		JPanel imagePanel = new JPanel();
		imagePanel.setBounds(20, 80, 500, 400);
		frame.add(imagePanel);

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static class LoadImageActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Loading image ..");
			JButton loadImageButton = (JButton) e.getSource();
			JFrame frame = (JFrame) loadImageButton.getRootPane().getParent();
			JPanel imagePanel = (JPanel) frame.getRootPane().getContentPane().getComponents()[2];
			// System.out.println(imagePanel);

			if (imagePanel.getComponentCount() < 1) {
				// load image using virtual proxy
				BufferedImage img = new VirtualProxyImage(IMG_PATH).loadImage();
				ImageIcon icon = new ImageIcon(img);

				JLabel iconLabel = new JLabel(icon, SwingConstants.LEFT);
				iconLabel.setBounds(20, 100, 500, 400);
				imagePanel.add(iconLabel);
				// System.out.println(imagePanel.getComponent(0));

				frame.validate();
				frame.repaint();
			}
		}
	}

	private static class RemoveImageActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Removing image ..");
			JButton removeImageButton = (JButton) e.getSource();
			JFrame frame = (JFrame) removeImageButton.getRootPane().getParent();
			JPanel imagePanel = (JPanel) frame.getRootPane().getContentPane().getComponents()[2];
			// System.out.println(imagePanel.getComponent(0));
			if (imagePanel.getComponentCount() > 0) {
				imagePanel.remove(0);
			}

			frame.validate();
			frame.repaint();
		}
	}

}
