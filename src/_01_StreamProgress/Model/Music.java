package _01_StreamProgress.Model;

import _01_StreamProgress.Interface.Streamable;

public class Music implements Streamable{
	private String artist;
	private String album;
	private int len;
	private int bytesSent;
	
	public Music(String artist, String album, int length, int bytesSent) {
		this.artist = artist;
		this.album = album;
		this.len = len;
		this.bytesSent = bytesSent;
	}
	
	public void setLen(int len) {
		this.len = len;
	}
	
	@Override
	public int getLen() {
		return this.len;
	}
	
	public void setBytesSent(int bytesSent) {
		this.bytesSent = bytesSent;
	}
	
	@Override
	public int getBytesSent() {
		return this.bytesSent;
	}
}
