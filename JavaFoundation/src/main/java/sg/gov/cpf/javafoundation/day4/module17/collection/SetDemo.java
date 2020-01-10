package sg.gov.cpf.javafoundation.day4.module17.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		CPFEmployee emp1 = new CPFEmployee("Prasanna", 18);
//		CPFEmployee emp2 = new CPFEmployee("Carolyn", 16);
//		CPFEmployee emp3 = new CPFEmployee("Sheila", 17);
//		CPFEmployee emp4 = new CPFEmployee("Maria", 18);
//		CPFEmployee emp5 = new CPFEmployee("Jon", 15);
//		CPFEmployee emp6 = emp5;
//
//		Set<CPFEmployee> empSet = new TreeSet<CPFEmployee>();
		
		String emp1 = "Prasanna";
		String emp2 = "Carolyn";
		String emp3 = "Sheila";
		String emp4 = "Maria";
		String emp5 = "Jon";
		
		Set<String> empSet = new TreeSet<String>();

		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp2);
		empSet.add(emp2);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
//		empSet.add(emp6);

		/*
		 * for(CPFEmployee e : empList) { System.out.println(e); }
		 */

		/*
		 * Iterator<CPFEmployee> iterator = empList.iterator();
		 * 
		 * while(iterator.hasNext()) { System.out.println(iterator.next()); }
		 */

		empSet.forEach(e -> System.out.println(e));
	}
}
