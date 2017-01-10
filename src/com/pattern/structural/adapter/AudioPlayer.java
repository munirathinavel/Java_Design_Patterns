package com.pattern.structural.adapter;

public class AudioPlayer implements MediaPlayer {
	enum AdapterType {
		CLASS, OBJECT
	};

	private AdapterType adapterType;

	public AudioPlayer() {
		this.adapterType = AdapterType.CLASS;
	}

	public AudioPlayer(AdapterType adapterType) {
		this.adapterType = adapterType;
	}

	@Override
	public void play(final MediaType mediaType, String fileName) {
		switch (mediaType) {
			case MP3:
				System.out.println("Playing " + mediaType.getName() + " file. Name: " + fileName);
				break;
			case MP4:
				playUsingAdapter(mediaType, fileName);
				break;
			case VLC:
				playUsingAdapter(mediaType, fileName);
				break;
			case AVI:
				System.out.println("Unsupported media type " + mediaType.getName());
				break;
		}
	}

	private void playUsingAdapter(final MediaType mediaType, String fileName) {
		MediaPlayer mediaPlayer = null;
		if (AdapterType.OBJECT.equals(this.adapterType)) {
			mediaPlayer = new MediaObjectAdapter(getMediaPlayerAdaptee(mediaType));
		}
		mediaPlayer = new MediaClassAdapter();
		mediaPlayer.play(mediaType, fileName);
	}

	private MediaPlayerAdaptee getMediaPlayerAdaptee(final MediaType mediaType) {
		if (MediaType.VLC.equals(mediaType)) {
			return new VlcPlayer();

		} else if (MediaType.MP4.equals(mediaType)) {
			return new Mp4Player();
		}
		throw new RuntimeException("Unsupported media type " + mediaType.getName());
	}

}