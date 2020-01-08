package sg.gov.cpf.javafoundation.day3.module10;

public class Person {
	
//	public Person() {
//		System.out.println("constructor invoked");
//	}
	
	private String name;
	private int age;
	
	public static final String FINAL_VALUE = "Final Value";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void eat() {
		System.out.println("Person is eating.");
	}
	
	public void eat(String food) {
		System.out.println(name + " is eating " +food +".");
	}
	
	

}
