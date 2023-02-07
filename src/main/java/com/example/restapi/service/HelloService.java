package com.example.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello() {
        return "Hello word";
    }
}
