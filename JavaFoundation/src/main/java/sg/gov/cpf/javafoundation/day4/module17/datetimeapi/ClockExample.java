package sg.gov.cpf.javafoundation.day4.module17.datetimeapi;

import java.time.Clock;

public class ClockExample {

	public static void main(String[] args) {
		Clock clockUTC =Clock.systemUTC();
		
		Clock clockDefault = Clock.systemDefaultZone();
		
		System.out.println(clockUTC);
		System.out.println(clockDefault);

	}

}
