package com.yoshallc.data.data.controllers;

import com.yoshallc.data.data.entities.Person;
import com.yoshallc.data.data.services.PersonService;
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

        ResponseEntity<List<Person>> responseEntity = new ResponseEntity <List<Person>>(personService.getPersons(), HttpStatus.OK);
       return responseEntity;
    }

}
