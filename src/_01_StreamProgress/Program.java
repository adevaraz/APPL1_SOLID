package _01_StreamProgress;

import _01_StreamProgress.Model.*;

public class Program {
	public static void main(String[] args) {
		File file = new File("File", 10, 5);
		Music music = new Music("EXO", "Universe", 10, 6);
		
		StreamProgressInfo streamFileInfo = new StreamProgressInfo(file);
		StreamProgressInfo streamMusicInfo = new StreamProgressInfo(music);
		
		System.out.println(streamFileInfo.calculateCurrentPercent());
		System.out.println(streamFileInfo.calculateCurrentPercent());
	}
}
