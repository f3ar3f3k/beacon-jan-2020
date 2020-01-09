package sg.gov.cpf.javafoundation.day4.customexception;

public class MainClass {

	public static void main(String[] args) {
		try {
			throw new WrongLogicException("please correct the logic of the program");
		} catch (WrongLogicException ex) {
			ex.printStackTrace();
		}

	}

}
