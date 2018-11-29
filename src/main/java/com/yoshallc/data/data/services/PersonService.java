package com.yoshallc.data.data.services;

import com.yoshallc.data.data.entities.Person;
import com.yoshallc.data.data.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){

        this.personRepository = personRepository;
    }

    public List<Person> getPersons(){

       return personRepository.findAll();
    }

}
