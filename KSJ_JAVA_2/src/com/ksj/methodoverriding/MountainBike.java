package com.ksj.methodoverriding;

	public class MountainBike extends Bicycle {

			public int seatHeight;
			
			public MountainBike (int startHeight, int startSpeed, int startGear) {
				super(startSpeed, startGear);
				seatHeight=startHeight;
			}

		
			public void setSeatHeight(int newValue) {
				seatHeight = newValue;
			}


			@Override
			public void setGear(int newValue) {
				gear=newValue+2;
			}


			@Override
			public void applyBrake(int decrement) {
				speed=speed-decrement-10;
			}


			@Override
			public void speedUp(int increment) {
				speed=speed+increment+10;
			}

	}