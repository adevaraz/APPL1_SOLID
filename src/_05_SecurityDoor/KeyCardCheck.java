package _05_SecurityDoor;

import _05_SecurityDoor.Interface.RequestKeyCard;
import _05_SecurityDoor.Interface.SecurityUI;

public class KeyCardCheck implements RequestKeyCard {
	private SecurityUI securityUI;
	
	public KeyCardCheck(SecurityUI securityUI) {
		this.securityUI = securityUI;
	}
	
	private boolean isValid(String code) {
		return true;
	}
	
	public boolean validateUser() {
		String code = securityUI.requestKeyCard();
		
		if(isValid(code)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String requestKeyCard() {
		ScannerUI scanner = new ScannerUI();
		
		return scanner.requestKeyCard();
	}
}
