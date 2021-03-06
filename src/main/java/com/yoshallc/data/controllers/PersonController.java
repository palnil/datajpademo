package com.yoshallc.data.controllers;

import com.yoshallc.data.entities.Person;
import com.yoshallc.data.services.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService){

        this.personService = personService;
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getPersons(){

        return new ResponseEntity <List<Person>>(personService.getPersons(), HttpStatus.OK);
    }

    @GetMapping("/adults")
    public ResponseEntity<List<Person>> getAdults(){

       return new ResponseEntity <List<Person>>(personService.getAdults(), HttpStatus.OK);
    }

}
