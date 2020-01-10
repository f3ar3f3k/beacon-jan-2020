package sg.gov.cpf.javafoundation.day4.module17.anonymousclass;

public class AnonymousClass {

	public static void main(String[] args) {
		
		MoreFunction function = new MoreFunction() {
			
			@Override
			public void sayHello() {
				System.out.println("Say Hello");				
			}

		};
		function.sayHello();
	}
}
