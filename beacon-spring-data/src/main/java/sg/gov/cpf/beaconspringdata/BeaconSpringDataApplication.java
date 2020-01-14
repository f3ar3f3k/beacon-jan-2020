package sg.gov.cpf.beaconspringdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.gov.cpf.beaconspringdata.entity.Customer;
import sg.gov.cpf.beaconspringdata.repository.CustomerRepository;

@SpringBootApplication
public class BeaconSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeaconSpringDataApplication.class, args);
	}

	@Bean
	public CommandLineRunner addObject(CustomerRepository custRepo) {
		return (args) ->{
			//save customer entity to db
			Customer cust = new Customer("melvin", "villamor");
			custRepo.save(cust);
			custRepo.save(new Customer("john","doe"));
			custRepo.save(new Customer("tim", "cook"));
			
			//fetch all customers
			for (Customer customer : custRepo.findAll()) {
				System.out.println(customer);
			}
			
		};
	}
}
