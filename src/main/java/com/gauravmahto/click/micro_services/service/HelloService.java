package com.gauravmahto.click.micro_services.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getGreeting() {
        return "Hello, from the service!";
    }

}
