package sg.gov.cpf.javafoundation.module18.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import sg.gov.cpf.javafoundation.module18.model.Person;

public class SerializeObject {

	public static void main(String[] args) throws IOException {

		Person person = new Person();
		person.setName("Maria");
		person.setAge(18);

		System.out.println("Before Serialization");

		FileOutputStream fileOut = new FileOutputStream("Person.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(person);

		out.close();
		fileOut.close();
		System.out.println("End of Serialization");

	}

}
