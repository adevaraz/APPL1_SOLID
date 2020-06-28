package _01_StreamProgress.Model;

import _01_StreamProgress.Interface.Streamable;

public class File implements Streamable {
	private String name;
	private int len;
	private int bytesSent;
	
	public File(String name, int len, int bytesSent) {
		this.name = name;
		this.len = len;
		this.bytesSent = bytesSent;
	}

	@Override
	public void setLen(int len) {
		this.len = len;
	}

	@Override
	public int getLen() {
		return this.len;
	}

	@Override
	public void setBytesSent(int bytesSent) {
		this.bytesSent = bytesSent;
	}

	@Override
	public int getBytesSent() {
		return this.bytesSent;
	}
}
