package ker.api.apimvcrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ker.api.apimvcrest.domain.Customer;
import ker.api.apimvcrest.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{
	private final CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		this.customerRepository = customerRepository;	
	}
	
	@Override
	public Customer findCustomerById(Long id)
	{
		return customerRepository.getOne(id);
	}

	@Override
	public List<Customer> findAllCustomers()
	{
		return customerRepository.findAll();
	}

}
