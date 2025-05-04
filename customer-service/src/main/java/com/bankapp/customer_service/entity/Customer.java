package com.bankapp.customer_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long customerId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String address;

    @Column(name = "password")
    private String password;

    // ✅ No-arg constructor required by JPA
    public Customer() {
    }

    public Customer(long customerId, String name, String email, String address, String password) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
    }

    // Getters & Setters
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
