package sg.gov.cpf.javafoundation.day2;

public class MountainBike extends Bicycle {

	public int seatHeight; 
	
	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		seatHeight = startHeight;
	}

	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public void displayDetails() {
		System.out.println(super.display() + " Seat Height: " + seatHeight);
	}
	
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 100, 25);
		mb.displayDetails();
		
		mb.speedUp(20);
		mb.applyBrake(30);
		System.out.println("==================");
		mb.displayDetails();
		
		mb.wheels = 2;
	}
}
