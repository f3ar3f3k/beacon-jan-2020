package sg.gov.cpf.javafoundation.day2;

public class Student {

	int id;
	String name;
	int age;
	int[] grades;
	
	public Student(int i, String n) {
		id = i;
		name = n;
	}
	
	public Student(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	public void display(Student student) {
		System.out.println("Id: " + student.id);
		System.out.println("Name: " + student.name);
		System.out.println("Age: " + student.age);
	}
	
	public static void main(String[] args) {
		CalculateGrades calcGrades = new CalculateGrades();
		
		Student student1 = new Student(111, "Aryan");
		student1.display(student1);
		student1.grades = new int[] {10, 9, 10};
		int student1Sum = CalculateGrades.calculateScores(student1.grades);
		calcGrades.displayScores(student1Sum);
		
		System.out.println("=====================");
		Student student2 = new Student(222, "Lej", 18);
		student2.display(student2);
		student2.grades = new int[] {9, 10, 9};
		int student2Sum = CalculateGrades.calculateScores(student2.grades);
		
		calcGrades.displayScores(student2Sum);
	}

}
