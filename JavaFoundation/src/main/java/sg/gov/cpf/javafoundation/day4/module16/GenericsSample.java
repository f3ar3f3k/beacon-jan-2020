package sg.gov.cpf.javafoundation.day4.module16;

import java.util.ArrayList;
import java.util.List;

public class GenericsSample {

	public static void main(String[] args) {
		List<String> list1 =new ArrayList<String>();
		list1.add("Hello");
		list1.add("Hi");
		//list1.add(5);
		
		for (String str:list1) {
			System.out.println(str);
		}	

	}

}
