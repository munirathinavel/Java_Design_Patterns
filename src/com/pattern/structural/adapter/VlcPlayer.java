package com.pattern.structural.adapter;

public class VlcPlayer implements MediaPlayerAdaptee {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing " + MediaPlayer.MediaType.VLC.getName() + " file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	}
}