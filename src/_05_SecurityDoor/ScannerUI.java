package _05_SecurityDoor;

import java.util.Scanner;

import _05_SecurityDoor.Interface.SecurityUI;

public class ScannerUI implements SecurityUI {
	Scanner in = new Scanner(System.in); 
	
	public String requestKeyCard() {
		System.out.println("Slide your key card");
		return in.nextLine();
	}

	public int requestPinCode() {
		System.out.println("Enter your pin code:");
		return Integer.parseInt(in.nextLine());
	}
	
}
