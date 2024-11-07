package com.example.ifto.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
    public String sayHello() {
        return "Hello World";
    }
}
