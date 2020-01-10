package sg.gov.cpf.javafoundation.day4.module17.anonymouswithreturn;

public class LambdaAnonymousWithReturn {

	public static void main(String[] args) {
		INumbers addOneLiner=(x,y) -> x+y;
		
		System.out.println(addOneLiner.addTwoNumbers(1, 3));
	
		INumbers addMoreThanOneLine=(x,y) ->{
			x=x+y;
			return x+y;
		};
		System.out.println(addMoreThanOneLine.addTwoNumbers(10, 1));
	
	}

}
