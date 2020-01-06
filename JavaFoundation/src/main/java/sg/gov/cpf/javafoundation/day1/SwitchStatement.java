package sg.gov.cpf.javafoundation.day1;

public class SwitchStatement {

	public static void main(String[] args) {
		char grade = 'D';
		int a=1;
		switch (a) {

		case 1:
			System.out.println("Outstanding");
			break;
		case 2:
			System.out.println("Very Satisfactory");
			break;
		case 3:
			System.out.println("Satisfactory");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
