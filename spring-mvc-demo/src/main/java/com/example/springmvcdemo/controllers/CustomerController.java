package com.example.springmvcdemo.controllers;


import com.example.springmvcdemo.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping(value = "/showForm")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customerForm";
    }

    @RequestMapping("/processCustomerForm")
    public String processCustomerForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println("Error");
            return "customerForm";
        }else{
            System.out.println("No Error");
        return  "customer-confirmation";
        }
    }
}
