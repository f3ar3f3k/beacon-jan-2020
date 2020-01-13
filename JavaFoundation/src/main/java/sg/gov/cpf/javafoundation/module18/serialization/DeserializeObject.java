package sg.gov.cpf.javafoundation.module18.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import sg.gov.cpf.javafoundation.module18.model.Person;
public class DeserializeObject {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		File fromFile = new File("Person.txt");
		FileInputStream fis = new FileInputStream(fromFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person person= (Person)ois.readObject();
		
		System.out.println("Deserialized data: \n" +"Name: "+ person.getName() +"\n age: " +person.getAge());
		
		fis.close();
		ois.close();
	}

}
