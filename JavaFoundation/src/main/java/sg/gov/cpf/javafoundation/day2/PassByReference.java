package sg.gov.cpf.javafoundation.day2;

public class PassByReference {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("Name before modification = " + employee.getName());
		
		modifyEmployee(employee);
		System.out.println("Name after modification = " + employee.getName());
	}

	private static void modifyEmployee(Employee employee) {
		employee.setName("Lej");
	}
}
