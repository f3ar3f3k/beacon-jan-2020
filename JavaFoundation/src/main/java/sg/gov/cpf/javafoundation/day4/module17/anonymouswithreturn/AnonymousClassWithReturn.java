package sg.gov.cpf.javafoundation.day4.module17.anonymouswithreturn;

public class AnonymousClassWithReturn {

	public static void main(String[] args) {
		INumbers addNumber = new INumbers() {
			
			@Override
			public int addTwoNumbers(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		System.out.println(addNumber.addTwoNumbers(3, 2));

	}

}
