package sg.gov.cpf.javafoundation.day3.module11;

public class Employee extends Student {
	
	public void eat() {
		
		System.out.println("Employee is eating.");
		super.eat();
	}
	
	public void work() {
		System.out.println("Employee is working.");
	}

}
