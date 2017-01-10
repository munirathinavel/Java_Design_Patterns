package com.pattern.structural.proxy;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RealImage implements Image {
	private String fileName;
	private BufferedImage image;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public BufferedImage loadImage() {
		System.out.println("Inside RealImage.loadImage(), loading " + fileName + "..");
		return image;
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName + " from disk ..");
		try {
			image = ImageIO.read(new File(fileName));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}