package _01_StreamProgress.Model;

public class StreamProgressInfo {
	private File file;
	
	public StreamProgressInfo(File file) {
		this.file = file;
	}
	
	public int calculateCurrentPercent() {
		return (this.file.getBytesSent() * 100) / this.file.getLen();
	}
}
