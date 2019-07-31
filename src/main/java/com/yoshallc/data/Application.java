package com.yoshallc.data;

import com.yoshallc.data.repository.PersonRepository;
import com.yoshallc.data.entities.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class);
    }
/*
    @Bean
    public CommandLineRunner demo(PersonRepository repository) {
        return (args) -> {

            repository.save(new Person("Nilesh","Patel","Male", 38));
            repository.save(new Person("Palak","Patel","Female", 39));
            repository.save(new Person("Swina","Patel","Female", 13));
            repository.save(new Person("Stuti","Patel","Female", 10));

        };
    }*/
}