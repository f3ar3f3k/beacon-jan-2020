package sg.gov.cpf.javafoundation.day5.module20;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void calculateSumTest() {
		Calculator calculator = new Calculator();
		
		int actualResult = calculator.calculateSum(15, 10);
		
		assertEquals(25, actualResult);
	}
	
	@Test
	public void printSumGreaterThanTenTest() {
		Calculator calculator = new Calculator();
		
		String actualResult = calculator.printSum(25);
		
		String expectedResult = "Sum is greater than 10.";
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void printSumLesserThanTenTest() {
		Calculator calculator = new Calculator();
		
		String actualResult = calculator.printSum(5);
		
		String expectedResult = "Sum is less than 10.";
		
		assertEquals(expectedResult, actualResult);
	}

}
