package sg.gov.cpf.javafoundation.day3.module10;


public class Demo {

	
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("Bentoi");
		person.setAge(30);
		
		System.out.println(person);
		person.eat();
		person.eat("ramen");
		
		Student student = new Student();
		student.setName("niko");
		student.eat();
		student.eat("instant noodles");
		
		Employee emp = new Employee();
		emp.eat();
		
		System.out.println(Person.FINAL_VALUE);
		
		
	}

}
