package sg.gov.cpf.javafoundation.day4.module17;

import java.util.HashSet;
import java.util.Set;

public class PersonHashSetImpl {
	
	public static void main(String[] args) {
		
		Set<Person> hashSet = new HashSet<>();
		Person person = new Person();
		Person person1 = new Person();
		person.setName("Ana");
		hashSet.add(person);
		person1.setName("Mark");
		hashSet.add(person1);
		hashSet.add(person1);
		
		for(Person p : hashSet) {
			System.out.println(p.getName());
		}
	}

}
