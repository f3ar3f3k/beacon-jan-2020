package sg.gov.cpf.javafoundation.day4.module17.anonymousclass;

public class LambdaAnonymousClass {

	public static void main(String[] args) {
		MoreFunction function =() -> 
		System.out.println("Say Hello");
		
		function.sayHello();
	}
}
