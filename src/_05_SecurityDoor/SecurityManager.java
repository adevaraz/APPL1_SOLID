package _05_SecurityDoor;

import java.util.Scanner;

public class SecurityManager {
	private KeyCardCheck keyCardCheck;
	private PinCodeCheck pinCodeCheck;
	
	public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck) {
		this.keyCardCheck = keyCardCheck;
		this.pinCodeCheck = pinCodeCheck;
	}
	
	public void check() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose option:");
		System.out.println("1 - KeyCard");
		System.out.println("2 - PinCode");
		int opt = Integer.parseInt(in.nextLine());
		
		switch(opt) {
			case 1:
				System.out.println(this.keyCardCheck.validateUser());
				break;
			case 2:
				System.out.println(this.pinCodeCheck.validateUser());
				break;
		}
	}
}
