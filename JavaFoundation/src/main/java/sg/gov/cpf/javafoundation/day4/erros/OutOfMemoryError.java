package sg.gov.cpf.javafoundation.day4.erros;

public class OutOfMemoryError {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		
		for (int i=0;i<999999999;i++) {
			str.append(i);
		}

	}

}
