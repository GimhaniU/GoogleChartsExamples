package com.example.controllers;

import com.example.model.Customer;
import com.example.repositories.CustomerRepository;
import com.example.service.MockCustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by roshane on 11/3/16.
 */
@Controller
public class HomeController {

    @Resource
    CustomerRepository customerRepository;

    @RequestMapping("/")
    public String redirectHomePage() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String getHomePage() {
        return "piechart";
    }

    @RequestMapping("/customers")
    public String getCustomerPage(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "customer";
    }

    @RequestMapping("/customers/edit/{id}")
    public String editCustomer(@PathVariable("id") Long id, Model model) {
        model.addAttribute("customer", customerRepository.findOne(id));
        return "editCustomer";
    }

    @RequestMapping(value = "/customers/add", method = RequestMethod.POST)
    public String saveCustomer(Customer customer) {
        System.out.println("\n customer > " + customer + "\n");
        customerRepository.save(customer);
        return "redirect:/customers";
    }

}
