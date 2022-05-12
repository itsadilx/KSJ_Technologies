package com.ksj.inheritance;



class Motorcycle {
	
	protected int gear;
	protected int speed;
	
	public Motorcycle (int startSpeed, int startGear) {
		
		gear = startGear;
		speed = startSpeed;
		
	}
	
	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	
}




