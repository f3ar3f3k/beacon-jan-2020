package sg.gov.cpf.javafoundation.day4.module17.collection.comparable;

public class CPFEmployee implements Comparable<CPFEmployee>{
	
	private String name;
	private int age;
	
	public CPFEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CPFEmployee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
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
		return "CPFEmployee [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(CPFEmployee o) {
		return this.age - o.age;
	}
	
	
	

}
