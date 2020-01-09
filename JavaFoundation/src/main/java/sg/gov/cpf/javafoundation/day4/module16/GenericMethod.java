package sg.gov.cpf.javafoundation.day4.module16;

public class GenericMethod {

	public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40};
		Character[] charArray = {'H','E','L','L','O'};
		System.out.println("Printing Integer Array");
		
		printArray(intArray);
		
		System.out.println("Printing Character Array");
		printArray(charArray);
	}
	
	public static <E> void printArray (E[]elements) {
		for (E element:elements) {
			System.out.println(element);
		}
		System.out.println();
	}

}
