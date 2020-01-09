package sg.gov.cpf.javafoundation.day4.erros;

import sg.gov.cpf.foundation.day4.model.SimpleCalculator;

public class NoClassDefFoundError {

	public static void main(String[] args) {

		try {
			SimpleCalculator calculator1 = new SimpleCalculator();
		}
		catch(Throwable t) {
			System.out.println(t);
		}
		
		SimpleCalculator calculator2=new SimpleCalculator();
	}

}
