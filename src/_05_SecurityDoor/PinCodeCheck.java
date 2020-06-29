package _05_SecurityDoor;

import _05_SecurityDoor.Interface.RequestPinCode;
import _05_SecurityDoor.Interface.SecurityUI;

public class PinCodeCheck implements RequestPinCode {
	private SecurityUI securityUI;
	
	public PinCodeCheck(SecurityUI securityUI) {
		this.securityUI = securityUI;
	}
	
	public boolean isValid(int pin) {
		return true;
	}
	
	public boolean validateUser() {
		int pin = requestPinCode();
		
		if(isValid(pin)) {
			return true;
		}
		
		return false;
	}

	@Override
	public int requestPinCode() {
		ScannerUI scanner = new ScannerUI();
		
		return scanner.requestPinCode();
	}
}
