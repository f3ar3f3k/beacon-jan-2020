package sg.gov.cpf.javafoundation.day4.module17.datetimeapi;

import java.time.LocalDate;
import java.time.MonthDay;

public class LocalDateExampleExtended {

	public static void main(String[] args) {
		LocalDate today =LocalDate.now();
		LocalDate annivDate =LocalDate.of(2013, 9, 1);
		
		MonthDay anniv=MonthDay.of(annivDate.getMonth(), annivDate.getDayOfMonth());
		
		MonthDay currentDay = MonthDay.from(today);
		
		if (currentDay.equals(anniv)) {
			System.out.println("Buy some gifts");
		}
		else {
			System.out.println("Relax");
		}
	}

}
