package com.bankapp.customer_service.service;

import com.bankapp.customer_service.request.CustomerRequest;
import com.bankapp.customer_service.response.CustomerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CustomerService {

    protected final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    public abstract CustomerResponse createCustomer(CustomerRequest customerRequest);

    public abstract CustomerResponse registerCustomer(CustomerRequest customerRequest);

    public abstract CustomerResponse getAById(Long customerId);

    public abstract CustomerResponse getById(Long customerId);

    public abstract CustomerResponse updateCustomer(Long customerId, CustomerRequest customerRequest);

    public abstract void deleteCustomer(Long customerId);

    public CustomerResponse getAll(Long customerId) {
        logger.info("Super class");
        return null;
    }
}
