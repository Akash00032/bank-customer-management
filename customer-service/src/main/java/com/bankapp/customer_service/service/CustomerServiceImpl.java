package com.bankapp.customer_service.service;

import com.bankapp.customer_service.entity.Customer;
import com.bankapp.customer_service.repository.CustomerRepository;
import com.bankapp.customer_service.request.CustomerRequest;
import com.bankapp.customer_service.response.CustomerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Primary
public class CustomerServiceImpl extends CustomerService {

    Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        logger.info("Creating a new customer...");
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setAddress(customerRequest.getAddress());
        customer.setEmail(customerRequest.getEmail());
        customer.setPassword(customerRequest.getPassword());

        return new CustomerResponse(customerRepository.save(customer));
    }

    @Override
    public CustomerResponse registerCustomer(CustomerRequest customerRequest) {
        logger.info("Registering customer...");
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setAddress(customerRequest.getAddress());
        customer.setEmail(customerRequest.getEmail());
        customer.setPassword(customerRequest.getPassword());

        return new CustomerResponse(customerRepository.save(customer));
    }

    @Override
    public CustomerResponse getById(Long customerId) {
        logger.info("Fetching customer by ID: {}", customerId);
        return new CustomerResponse(customerRepository.findById(customerId).orElse(null));
    }

    @Override
    public CustomerResponse getAById(Long customerId) {
        logger.info("Fetching customer (getAById) with ID: {}", customerId);
        return new CustomerResponse(customerRepository.findById(customerId).orElse(null));
    }

    // ✅ Update Customer
    @Override
    public CustomerResponse updateCustomer(Long customerId, CustomerRequest request) {
        logger.info("Updating customer with ID: {}", customerId);
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.setName(request.getName());
            customer.setEmail(request.getEmail());
            customer.setAddress(request.getAddress());
            customer.setPassword(request.getPassword());
            return new CustomerResponse(customerRepository.save(customer));
        } else {
            logger.warn("Customer with ID {} not found", customerId);
            return null;
        }
    }

    // ✅ Delete Customer
    @Override
    public void deleteCustomer(Long customerId) {
        logger.info("Deleting customer with ID: {}", customerId);
        if (customerRepository.existsById(customerId)) {
            customerRepository.deleteById(customerId);
        } else {
            logger.warn("Attempted to delete non-existing customer with ID {}", customerId);
        }
    }
}
