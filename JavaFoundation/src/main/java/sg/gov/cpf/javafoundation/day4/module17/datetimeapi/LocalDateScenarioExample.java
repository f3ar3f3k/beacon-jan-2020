package sg.gov.cpf.javafoundation.day4.module17.datetimeapi;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateScenarioExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birth Month");
		int month= scan.nextInt();
		
		LocalDate dateNow = LocalDate.now();
		if (dateNow.getMonthValue()==month) {
			System.out.println("its your birth month");
		}
		else {
			System.out.println("not your birth month");			
		}
		scan.close();
	}

}
