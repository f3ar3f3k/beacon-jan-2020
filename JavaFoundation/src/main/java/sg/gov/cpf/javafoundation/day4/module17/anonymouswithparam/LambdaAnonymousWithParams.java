package sg.gov.cpf.javafoundation.day4.module17.anonymouswithparam;

public class LambdaAnonymousWithParams {

	public static void main(String[] args) {
		MoreFunctionWithParams functionParams =(x,y) -> 
		System.out.println("sum is : "+ (x+y));
		
		functionParams.add(2, 3);

	}

}
