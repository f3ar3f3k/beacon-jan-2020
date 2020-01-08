package sg.gov.cpf.javafoundation.day3.module12;

public class Demo {

	public static void main(String[] args) {
		
		
		Person p = new Student();
		
		p.getHobby();
		p.getHobby("guitar");
		
		Student p2 = new Employee();
		
		p2.getHobby();
		p2.getHobby("hobby");

	}

}
