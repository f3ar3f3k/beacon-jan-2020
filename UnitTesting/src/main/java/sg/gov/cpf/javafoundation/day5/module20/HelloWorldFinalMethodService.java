package sg.gov.cpf.javafoundation.day5.module20;

public class HelloWorldFinalMethodService {
	
	public HelloWorldFinalMethod helloWorldFinal;
	
	public HelloWorldFinalMethodService(HelloWorldFinalMethod hwFinalMethod) {
		helloWorldFinal = hwFinalMethod;
	}
	
	public String greetings() {
		return helloWorldFinal.sayHelloMethod();
	}

}
