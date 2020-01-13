package sg.gov.cpf.javafoundation.day4.module17.datetimeapi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateCompareExample {

	public static void main(String[] args) {

		LocalDate now =LocalDate.now();
		LocalDate customDate = LocalDate.of(2020, 1, 9);
		
		if (customDate.isBefore(now)) {
			System.out.println("custom date is the date before today");
		}
		
		LocalDate anotherCustomDate =now.plus(1, ChronoUnit.DAYS);
		

		if (anotherCustomDate.isAfter(now)) {
			System.out.println(" date comes after today");
		}
		
	}

}
