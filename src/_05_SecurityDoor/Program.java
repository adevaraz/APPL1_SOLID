package _05_SecurityDoor;

public class Program {
	public static void main(String[] args) {
		ScannerUI scannerUI = new ScannerUI();
		KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUI);
		PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUI);
		
		SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
		manager.check();
	}
}
