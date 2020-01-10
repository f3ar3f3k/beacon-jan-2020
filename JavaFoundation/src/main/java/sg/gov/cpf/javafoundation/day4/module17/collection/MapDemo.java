package sg.gov.cpf.javafoundation.day4.module17.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CPFEmployee emp1 = new CPFEmployee("Prasanna", 18);
		CPFEmployee emp2 = new CPFEmployee("Carolyn", 16);
		CPFEmployee emp3 = new CPFEmployee("Sheila", 17);
		CPFEmployee emp4 = new CPFEmployee("Maria", 18);
		CPFEmployee emp5 = new CPFEmployee("Jon", 15);

		Map<String, CPFEmployee> empMap = new HashMap<String, CPFEmployee>();

		empMap.put("a3", emp1);
		empMap.put("cw", emp2);
		empMap.put("smt", emp3);
		empMap.put("mlw", emp4);
		empMap.put("big boss", emp5);
		empMap.put("big boss", emp1);

//		  System.out.println(empMap.get("big boss"));

		Set<String> keys = empMap.keySet();

		// print keys System.out.println("Map Keys"); keys.forEach(k -> {
//		  System.out.println(k); });
//		  
//		  System.out.println();
//		 

		// print values
		System.out.println("Map Keys and Values");
		
		keys.forEach(k -> {
			System.out.println(k + ", " + empMap.get(k));
		});

//		  empMap.values().forEach(v-> { System.out.println(v); });

//				System.out.println(empMap.get("big boss"));

	}

}
