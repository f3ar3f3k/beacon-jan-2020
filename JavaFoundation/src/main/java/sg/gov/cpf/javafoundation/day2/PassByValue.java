package sg.gov.cpf.javafoundation.day2;

public class PassByValue {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		System.out.println("Values before modification:");
		System.out.println("x = " + x + " ; y " + y);
		
		modifyPrimitiveTypes(x, y);
		System.out.println("Values after modification:");
		System.out.println("x = " + x + " ; y " + y);
	}

	private static void modifyPrimitiveTypes(int x, int y) {
		x = 5;
		y = 10;
	}

}
