package sg.gov.cpf.javafoundation.day5.module20;

public class Calculator {
	
	// use default constructor
	
	public int calculateSum(int num1, int num2) {
		int sum = 0;
		
		sum = num1 + num2;
		
		return sum;
	}
	
	public String printSum(int sum) {
		String returnMsg = "";
		
		if (sum > 10) {
			returnMsg = "Sum is greater than 10.";
		} else {
			returnMsg = "Sum is less than 10.";
		}
		
		return returnMsg;
	}
	
}
