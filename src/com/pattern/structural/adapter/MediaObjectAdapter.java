package com.pattern.structural.adapter;

public class MediaObjectAdapter implements MediaPlayer {
	private MediaPlayerAdaptee mediaPlayerAdaptee;

	public MediaObjectAdapter(MediaPlayerAdaptee mediaPlayerAdaptee) {
		this.mediaPlayerAdaptee = mediaPlayerAdaptee;
	}

	@Override
	public void play(MediaType mediaType, String fileName) {
		if (MediaType.VLC.equals(mediaType)) {
			mediaPlayerAdaptee.playVlc(fileName);

		} else if (MediaType.MP4.equals(mediaType)) {
			mediaPlayerAdaptee.playMp4(fileName);
		}
	}

}