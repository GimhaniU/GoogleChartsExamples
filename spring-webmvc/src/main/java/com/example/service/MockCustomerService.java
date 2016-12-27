package com.example.service;

import com.example.model.Customer;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by roshane on 11/3/16.
 */
@Service
public class MockCustomerService {

    private static final Faker faker;

    static {
        faker = new Faker(Locale.ENGLISH, new Random(System.nanoTime()));
    }

    public List<Customer> getCustomers(int count) {
        return IntStream.range(0, count)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .map((i) -> {
                    return new Customer(
                            System.nanoTime(),
                            faker.name().firstName(),
                            faker.name().lastName(),
                            faker.internet().emailAddress()

                    );
                })
                .collect(Collectors.toList());
    }
}
