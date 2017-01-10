package com.pattern.structural.adapter;

public interface MediaPlayer {
	enum MediaType {
		MP3(".mp3"), MP4(".mp4"), VLC(".vlc"), AVI(".avi");

		private String name;

		private MediaType(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	void play(MediaType mediaType, String fileName);
}
