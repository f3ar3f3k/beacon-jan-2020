package com.beacon.java.module6;

import sg.gov.cpf.javafoundation.day2.Bicycle;

public class Motorcycle extends Bicycle {

	public Motorcycle(int gear, int speed) {
		super(gear, speed);
	}
	
	public static void main(String[] args) {
		Motorcycle mc = new Motorcycle(3, 100);
		
		mc.wheels = 2;
	}

}
