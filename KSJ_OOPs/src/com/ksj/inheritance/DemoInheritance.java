package com.ksj.inheritance;

public class DemoInheritance {



	public static void main(String[] args) {

		MountBike mountBike = new MountBike(20, 10, 1);
		System.out.println("Gear is: " + mountBike.gear);
		System.out.println("Seat Height is: " + mountBike.seatHeight);
		System.out.println("Bike speed is: " + mountBike.speed);
		
		mountBike.applyBrake(1);
		
		System.out.println("Bike speed after applying break is: " + mountBike.speed);
	}

}