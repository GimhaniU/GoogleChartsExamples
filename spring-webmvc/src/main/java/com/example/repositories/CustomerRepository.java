package com.example.repositories;

import com.example.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by roshane on 11/3/16.
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer,Long>{

}
