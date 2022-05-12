package com.ksj.methodoverriding;

public class MethodOverridingDemo {


		public static void main(String[] args) {

			Bicycle bicycle = new Bicycle(10, 1);
			System.out.println("Bicycle gear is :"+bicycle.gear);
			System.out.println("Bicycle speed is :"+bicycle.speed);
			bicycle.applyBrake(1);
			System.out.println("Bicycle speed after applying breaks is : "+bicycle.speed);
			
			Bicycle mountainBike = new MountainBike(50, 50, 3);
			System.out.println("MountainBike gear is :"+bicycle.gear);
			System.out.println("MountainBike speed is :"+bicycle.speed);
			
			mountainBike.applyBrake(1);
			System.out.println("MountainBike speed after applying breaks is : "+mountainBike.speed);
			
			mountainBike.speedUp(10);
			System.out.println("Bike speed after speeding up is : "+mountainBike.speed);
			
		}

	}