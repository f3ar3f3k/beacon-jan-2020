package sg.gov.cpf.javafoundation.day1;

public class BreakContinueStatement {

	public static void main(String[] args) {
		System.out.println("Break Statement");

		for (int i = 1; i < 5; i++) {

			if (i == 3) {
				break;}
			System.out.println(i);
		}
		
		System.out.println("Continue Statement");

		for (int i = 1; i < 5; i++) {

			if (i == 3) {
				continue;}	
			System.out.println(i);
		}
	}

}
