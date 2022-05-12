package com.ksj.interfacedemo;

public class MountainBike implements Bicycle {

	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBike(int startHeight, int startSpeed, int startGear) {
		this.seatHeight = startHeight;
		this.gear = startSpeed;
		this.speed = startGear;
	}
	
	@Override
	public void applyBrake(int decrement) {
		speed=speed-decrement;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void speedUp(int increment) {
		speed=speed+increment;
		// TODO Auto-generated method stub
		
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
}