package sg.gov.cpf.javafoundation.day4.module17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();

		// add
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		
		String letter = "A";
		hashSet.add(letter);
		hashSet.add("A");
		System.out.println(hashSet);
		/*
		 * System.out.println(hashSet.size());
		 * 
		 * hashSet.remove("C"); System.out.println(hashSet);
		 * System.out.println(hashSet.size());
		 * System.out.println(hashSet.contains("A"));
		 * 
		 * // iterator Iterator<String> i = hashSet.iterator();
		 * 
		 * while (i.hasNext()) { System.out.println(i.next()); } // enhanced for loop
		 * for (String x : hashSet) { System.out.println(x); }
		 * 
		 * // foreach hashSet.forEach((e) -> System.out.println(e));
		 * 
		 * hashSet.clear(); System.out.println(hashSet.size());
		 */
	}

}
