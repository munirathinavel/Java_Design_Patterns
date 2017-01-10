package com.pattern.structural.adapter;

public class Mp4Player implements MediaPlayerAdaptee {

	@Override
	public void playVlc(String fileName) {
		// do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing " + MediaPlayer.MediaType.MP4.getName() + " file. Name: " + fileName);
	}
}