package _04_Recharge.Model;

import _04_Recharge.Interface.Sleeper;

public class Employee extends Worker implements Sleeper{
	
	public Employee(String id) {
		super(id);
	}
	
	@Override
	public void sleep() {
		System.out.println("zzz..");
	}
	
}
