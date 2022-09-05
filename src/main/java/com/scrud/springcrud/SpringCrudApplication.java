package com.scrud.springcrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}