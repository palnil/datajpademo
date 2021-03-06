package com.yoshallc.data.services;

import com.yoshallc.data.entities.Person;
import com.yoshallc.data.repository.PersonRepository;
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

    public List<Person> getAdults(){

        return personRepository.findAdults();
    }

   /* public void savePerson(String fname, String lname, String sex, int age){

        personRepository.save(new Person(fname,lname,sex, age));

    }*/
/*
    public void updatePerson(Person person){

        personRepository.

    }*/

}
