package ker.api.apimvcrest.services;

import java.util.List;

import ker.api.apimvcrest.domain.Customer;

public interface CustomerService
{
	Customer findCustomerById(Long id);
	List<Customer> findAllCustomers();
}
