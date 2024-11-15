package in.shiva.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shiva.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	public Customer findByEmail(String email);

}
