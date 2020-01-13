package sg.gov.cpf.javafoundation.day4.module17.datetimeapi;

import java.time.LocalDate;

public class LocalDateModificationExample {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();

		LocalDate tomorrow = now.plusDays(1);
		LocalDate nextYr = now.plusYears(1);
		LocalDate nextMo = now.plusMonths(1);
		LocalDate nextWk = now.plusWeeks(1);

		System.out.println(tomorrow);
		System.out.println(nextYr);
		System.out.println(nextMo);
		System.out.println(nextWk);

	}

}
