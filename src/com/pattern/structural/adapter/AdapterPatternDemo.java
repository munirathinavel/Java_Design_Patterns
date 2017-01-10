package com.pattern.structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		System.out.println("Using default class adapter ...");

		MediaPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play(MediaPlayer.MediaType.MP3, "beyond_the_horizon.mp3");
		audioPlayer.play(MediaPlayer.MediaType.MP4, "alone.mp4");
		audioPlayer.play(MediaPlayer.MediaType.VLC, "far_far_away.vlc");
		audioPlayer.play(MediaPlayer.MediaType.AVI, "mind_me.avi");

		System.out.println("\nUsing object adapter ...");
		audioPlayer = new AudioPlayer(AudioPlayer.AdapterType.OBJECT);
		audioPlayer.play(MediaPlayer.MediaType.MP3, "beyond_the_horizon.mp3");
		audioPlayer.play(MediaPlayer.MediaType.MP4, "alone.mp4");
		audioPlayer.play(MediaPlayer.MediaType.VLC, "far_far_away.vlc");
		audioPlayer.play(MediaPlayer.MediaType.AVI, "mind_me.avi");
	}

}
