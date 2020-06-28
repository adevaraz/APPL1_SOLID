package _04_Recharge.Model;

import _04_Recharge.Interface.Rechargeable;

public class Robot extends Worker implements Rechargeable {

	private int capacity;
	private int currentPower;
	
	public Robot(String id, int capacity) {
		super(id);
		
		this.capacity = capacity;
	}
	
	public void setCurrentPower(int val) {
		this.currentPower = val;
	}
	
	public int getCurrentPower() {
		return this.currentPower;
	}
	
	public void work(int hours) {
		if(hours > this.currentPower) {
			hours = currentPower;
		}
		
		super.work(hours);
		this.currentPower -= hours;
	}
	
	@Override
	public void recharge() {
		this.currentPower = this.capacity;
	}
	
}
