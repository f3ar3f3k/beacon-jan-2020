package sg.gov.cpf.javafoundation.day2;

public class Bicycle {
	
	public int gear;
	public int speed;
	protected int wheels;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
		// speed = speed - decrement
	}
	
	public void speedUp(int increment) {
		speed += increment;
		// speed = speed + increment
	}
	
	public String display() {
		String details = "Gear: " + gear + " Speed: " + speed;
		return details;
	}

}
