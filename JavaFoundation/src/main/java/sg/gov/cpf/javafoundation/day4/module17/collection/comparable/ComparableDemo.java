package sg.gov.cpf.javafoundation.day4.module17.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableDemo {

	public static void main(String[] args) {
		CPFEmployee emp1 = new CPFEmployee("Prasanna", 18);
		CPFEmployee emp2 = new CPFEmployee("Carolyn", 16);
		CPFEmployee emp3 = new CPFEmployee("Sheila", 17);
		CPFEmployee emp4 = new CPFEmployee("Maria", 18);
		CPFEmployee emp5 = new CPFEmployee("Jon", 15);
		
		List<CPFEmployee> empList = new ArrayList<CPFEmployee>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		System.out.println("Before Sorting");
		empList.forEach(e -> System.out.println(e));
		
		Collections.sort(empList);
		
		System.out.println("\nAfter Sorting");
		empList.forEach(e -> System.out.println(e));


	}

}
