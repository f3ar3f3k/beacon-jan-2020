package sg.gov.cpf.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import sg.gov.cpf.model.Employee;

@RestController
public class EmployeeController {
	
	private List<Employee> listEmployee;
	
	public EmployeeController() {
		listEmployee = new ArrayList<Employee>();
	}
	
	@RequestMapping(value="/employee/dummy/one",produces= {"application/json"})
	public Employee getEmployee() {
		return new Employee("john.d.doe","John","Software Engineer");
	}
	
	@ResponseStatus(value=HttpStatus.CREATED)
	@PostMapping("/employee/create")
	public void addNewEmployee(@RequestBody Employee emp) {
		listEmployee.add(emp);
		
	}
	
	@GetMapping("/employee/list")
	public List<Employee> getEmployeeList(){
		return listEmployee;
	}
	
	
	@GetMapping("/dataformat")
	public String throwDataFormatException() throws DataFormatException {
		throw new DataFormatException();
	}
	
	
	@ExceptionHandler(DataFormatException.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR , reason="Data format exception thrown!!!")
	public void catchDataFormatException() {
		
	}
	
	
	
	

}
