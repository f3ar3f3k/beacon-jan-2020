package sg.gov.cpf.beaconspringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import sg.gov.cpf.beaconspringdata.entity.Customer;

@RestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
