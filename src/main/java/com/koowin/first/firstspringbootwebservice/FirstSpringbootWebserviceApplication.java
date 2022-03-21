package com.koowin.first.firstspringbootwebservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringbootWebserviceApplication {
    private static final Logger log = LoggerFactory.getLogger(FirstSpringbootWebserviceApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(FirstSpringbootWebserviceApplication.class, args);
    }
}
