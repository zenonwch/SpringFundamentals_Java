package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {

//	@Autowired                                                                                                  // member injection
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(final CustomerRepository customerRepository) {
		System.out.println("constructor injection");
		this.customerRepository = customerRepository;
	}

	@Autowired                                                                                                  // setter injection
	public void setCustomerRepository(final CustomerRepository customerRepository) {
		System.out.println("setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
