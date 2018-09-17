package ker.api.apimvcrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ker.api.apimvcrest.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
