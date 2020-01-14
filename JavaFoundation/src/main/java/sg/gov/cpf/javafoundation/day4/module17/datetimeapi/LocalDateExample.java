package sg.gov.cpf.javafoundation.day4.module17.datetimeapi;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now(); // yyyy-MM-dd
		System.out.println("date today: " + localDate);
		System.out.println("year " + localDate.getYear());
		System.out.println("Day of the week " + localDate.getDayOfWeek());

		LocalDate customDate = LocalDate.of(2020, 7, 5);
		System.out.println("custom date " + customDate);
		
		LocalDate date1 =LocalDate.now();
		LocalDate date2 =LocalDate.of(2020,1,9);
		
		if (date1.equals(date2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
	}

}
