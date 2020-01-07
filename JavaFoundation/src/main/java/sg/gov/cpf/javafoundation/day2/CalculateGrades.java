package sg.gov.cpf.javafoundation.day2;

public class CalculateGrades {
	
	public static int calculateScores(int[] grades) {
		int sum = 0;
		
		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];
		}
		
		return sum;
	}
	
	public void displayScores(int sum) {
		System.out.println("Sum is : " + sum);
	}
	
	

}
