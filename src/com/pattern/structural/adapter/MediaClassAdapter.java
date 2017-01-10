package com.pattern.structural.adapter;

public class MediaClassAdapter implements MediaPlayer, MediaPlayerAdaptee {
	public MediaClassAdapter() {
	}

	@Override
	public void play(MediaType mediaType, String fileName) {
		if (MediaType.VLC.equals(mediaType)) {
			playVlc(fileName);

		} else if (MediaType.MP4.equals(mediaType)) {
			playMp4(fileName);
		}
	}

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

}
