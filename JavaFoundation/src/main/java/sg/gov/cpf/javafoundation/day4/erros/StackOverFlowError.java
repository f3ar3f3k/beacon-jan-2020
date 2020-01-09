package sg.gov.cpf.javafoundation.day4.erros;

public class StackOverFlowError {

	public static void main(String[] args) {
		StackOverFlowError.recursivePrint(999999999);

	}

	public static void recursivePrint(int num) {
		System.out.println("Number" + num);
		
		if (num==0) {
			return;
		}
		else {
			recursivePrint(++num);
		}
	}
}
