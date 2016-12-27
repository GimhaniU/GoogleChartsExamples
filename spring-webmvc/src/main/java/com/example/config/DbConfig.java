package com.example.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by roshane on 11/3/16.
 */
@Configuration
@EnableMongoRepositories(basePackages ="com.example.repositories")
public class DbConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "customer-db";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost");
    }
}
