package sg.gov.cpf.javafoundation.day4.module17.anonymouswithparam;

public class AnonymousClassWithParams {

	public static void main(String[] args) {
		MoreFunctionWithParams functionParams=new MoreFunctionWithParams() {
			
			@Override
			public void add(int x, int y) {
				// TODO Auto-generated method stub
				System.out.println("sum is " + (x+y));
			}
		};
		functionParams.add(2, 3);

	}

}
