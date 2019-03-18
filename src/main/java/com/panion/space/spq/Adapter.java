package com.panion.space.spq;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月28日上午10:53:27
*/

//适配器模式：将一个类的接口转换成客户希望的另一个接口。适配器模式使得原本由于接口不兼容而不能一起工
//作的那些类可以一起工作
//：总结：衔接两个不兼容，独立的接口的功能，使得它们能够一起工作。适配器起中介作用。
public class Adapter {

	public static void main(String[] args) {
		//兼容了高级功能的普通播放器
		Player player = new Player();
		player.play();
	}
}

//普通的播放器
interface MediaPlayer {
	public void play();
}
//高级的播放器
interface AdvanceMediaPlayer{
	public void playVideo();
}

//视屏播放器（高级的播放器）
class VideoPlayer implements AdvanceMediaPlayer{

	public void playVideo() {
		System.out.println("play video!");
	}
}

//适配器（衔接了普通播放器与高级播放器这两个独立接口的功能）
class MediaAdapter implements MediaPlayer {

	AdvanceMediaPlayer advanceMediaPlayer;
	public MediaAdapter() {
		advanceMediaPlayer = new VideoPlayer();
	}
	public void play() {
		advanceMediaPlayer.playVideo();
	}
	
}

//普通播放器
class Player implements MediaPlayer {

	//兼容高级播放器的适配器
	MediaAdapter mediaAdapter = new MediaAdapter();
	
	public void play() {
		mediaAdapter.play();
	}
	
}
