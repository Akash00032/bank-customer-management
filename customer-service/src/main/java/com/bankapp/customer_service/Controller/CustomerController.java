package com.bankapp.customer_service.Controller;

import com.bankapp.customer_service.request.CustomerRequest;
import com.bankapp.customer_service.response.CustomerResponse;
import com.bankapp.customer_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    @Qualifier("customerServiceImpl")
    private CustomerService customerService;

    // Create/Register
    @PostMapping("/register")
    public CustomerResponse registerCustomer(@RequestBody CustomerRequest request) {
        return customerService.registerCustomer(request);
    }

    // Read/Get by ID
    @GetMapping("/getbyid/{id}")
    public CustomerResponse getCustomerById(@PathVariable Long id) {
        return customerService.getById(id);
    }

    // ✅ Update Customer
    @PutMapping("/update/{id}")
    public CustomerResponse updateCustomer(@PathVariable Long id, @RequestBody CustomerRequest request) {
        return customerService.updateCustomer(id, request);
    }

    // ✅ Delete Customer
    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "Customer deleted successfully.";
    }
}

/*

POST
   http://localhost:8081/api/customer/register

GET
   http://localhost:8081/api/customer/getbyid/9

PUT
   http://localhost:8081/api/customer/update/1

DELETE
   http://localhost:8081/api/customer/delete/1

 */