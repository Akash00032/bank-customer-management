package com.bankapp.customer_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Autowired
    @Qualifier("premiumCustomerServiceImpl")
    private CustomerService customerService;

}
