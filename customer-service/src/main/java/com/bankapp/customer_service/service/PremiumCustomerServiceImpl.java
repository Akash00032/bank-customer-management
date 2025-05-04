package com.bankapp.customer_service.service;

import com.bankapp.customer_service.request.CustomerRequest;
import com.bankapp.customer_service.response.CustomerResponse;
import org.springframework.stereotype.Service;

@Service("premiumCustomerServiceImpl") // Important for @Qualifier
public class PremiumCustomerServiceImpl extends CustomerService {

    @Override
    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        return null;
    }

    @Override
    public CustomerResponse registerCustomer(CustomerRequest customerRequest) {
        return null;
    }

    @Override
    public CustomerResponse getAById(Long customerId) {
        return null;
    }

    @Override
    public CustomerResponse getById(Long customerId) {
        // Custom logic for premium customers
        return null;
    }

    @Override
    public CustomerResponse updateCustomer(Long customerId, CustomerRequest customerRequest) {
        return null;
    }

    @Override
    public void deleteCustomer(Long customerId) {
    }
}
