package com.pattern.structural.proxy;

import java.awt.image.BufferedImage;

public class VirtualProxyImage implements Image {
	private RealImage realImage;
	private String fileName;

	public VirtualProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public BufferedImage loadImage() {
		System.out.println("Inside VirtualProxyImage.loadImage(), loading " + fileName + "..");

		// Create RealImage lazily
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		return realImage.loadImage();
	}

}
