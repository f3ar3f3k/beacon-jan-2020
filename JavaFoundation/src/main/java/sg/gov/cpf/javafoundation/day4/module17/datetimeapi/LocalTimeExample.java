package sg.gov.cpf.javafoundation.day4.module17.datetimeapi;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime time =LocalTime.now();
		
		System.out.println(time);
		
		LocalTime addHour =time.plusHours(2);
		LocalTime minusHour = time.minusHours(3);
		
		System.out.println(addHour);
		System.out.println(minusHour);
	}

}

