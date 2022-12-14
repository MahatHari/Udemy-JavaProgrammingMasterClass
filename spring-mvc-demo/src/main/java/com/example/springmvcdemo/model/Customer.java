package com.example.springmvcdemo.model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    @NotNull
    @Size(min=2, max = 30, message = "is required ")
    private String firstName;
    @NotNull
    @Size(min=2, max = 30, message = "is required ")
    private String lastName;

    public  Customer(){};

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
