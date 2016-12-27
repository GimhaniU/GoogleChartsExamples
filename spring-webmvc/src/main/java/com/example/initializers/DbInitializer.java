//package com.example.initializers;
//
//import com.example.repositories.CustomerRepository;
//import com.example.service.MockCustomerService;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
///**
// * Created by roshane on 11/3/16.
// */
//
//@Order(2)
//@Component
//public class DbInitializer implements ApplicationRunner{
//
//    @Resource
//    CustomerRepository customerRepository;
//    @Resource
//    MockCustomerService customerService;
//
//    @Override
//    public void run(ApplicationArguments applicationArguments) throws Exception {
//        System.out.println("\n>Initializing the database\n");
//        customerService.getCustomers(10)
//                .forEach(customerRepository::save);
//    }
//}
