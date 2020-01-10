package sg.gov.cpf.javafoundation.day4.module17.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CPFEmployee emp1 = new CPFEmployee("Prasanna", 18);
		CPFEmployee emp2 = new CPFEmployee("Carolyn", 16);
		CPFEmployee emp3 = new CPFEmployee("Sheila", 17);
		CPFEmployee emp4 = new CPFEmployee("Maria", 18);
		CPFEmployee emp5 = new CPFEmployee("Jon", 15);
		CPFEmployee emp6 = emp5;
		
		
		List<CPFEmployee> empList = new ArrayList<CPFEmployee>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp2);
		empList.add(emp2);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		
		int index = 0;
		
		/*
		 * while (index < empList.size()) { System.out.println(empList.get(index));
		 * index++; }
		 */
		
		/*
		 * index = 0;
		 * 
		 * do { System.out.println(empList.get(index)); index++; } while (index <
		 * empList.size());
		 */
		
		/*
		 * for (int i = 0; i < empList.size(); i++) {
		 * System.out.println(empList.get(i)); }
		 */
		
		
		/*
		 * for(CPFEmployee e : empList) { System.out.println(e); }
		 */
		
		/*
		 * Iterator<CPFEmployee> iterator = empList.iterator();
		 * 
		 * while(iterator.hasNext()) { System.out.println(iterator.next()); }
		 */
		
		empList.forEach(e -> System.out.println(e));

	}

}
