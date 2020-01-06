package sg.gov.cpf.javafoundation.day1;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your name");
		String name =input.next();
		System.out.println("Name is: "+name);
		
		System.out.println("Enter your age");
		int age = input.nextInt();
		System.out.println("Age is: "+age);
		
		System.out.println("Enter your bill");
		double bill = input.nextDouble();
		System.out.println("bill is: " + bill);
		
	}
}
