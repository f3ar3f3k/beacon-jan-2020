package sg.gov.cpf.javafoundation.day4.module17.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorDemo {

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
		
//		AgeComparator ac = new AgeComparator();
		
//		Collections.sort(empList, new AgeComparator());
		/*
		 * Collections.sort(empList, new Comparator<CPFEmployee>() {
		 * 
		 * @Override public int compare(CPFEmployee o1, CPFEmployee o2) { // TODO
		 * Auto-generated method stub return o1.getAge()- o2.getAge(); } });
		 */
		
		/*
		 * Collections.sort(empList, (e1, e2) -> e1.getAge() - e2.getAge());
		 * 
		 * System.out.println("\nAfter Sorting"); empList.forEach(e ->
		 * System.out.println(e));
		 */
		System.out.println();
		empList.stream().sorted((e1,e2)->e1.getAge() - e2.getAge()).forEach(e ->{
			System.out.println(e);
		});

	}

}
