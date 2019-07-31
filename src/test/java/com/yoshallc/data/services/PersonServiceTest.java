package com.yoshallc.data.services;

import com.yoshallc.data.entities.Person;
import com.yoshallc.data.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class PersonServiceTest {

    @MockBean
    PersonRepository personRepository;

    PersonService personService;


    @BeforeEach
    public void setUp(){

        personService = new PersonService(personRepository);

    }

    /*@Test
    void getPersons() {


      *//*  Person person1 =new Person("Nilesh","Patel","Male", 38);
        Person person2 = new Person("Palak","Patel","Female", 39);
        Person person3 = new Person("Swina","Patel","Female", 13);
        Person person4 = new Person("Stuti","Patel","Female", 10);
*//*
        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        //setup
        when(personRepository.findAll()).thenReturn(personList);

        //execute & assert
        assertEquals(4, personService.getPersons().size());

    }

    @Test
    public void savePerson_SavesRecords_InDB(){

        Person person = new Person("Navinbhai","Patel","Male", 67);

        when(personRepository.save(any())).thenReturn(person);

        assertEquals(5,personService.getPersons().size());

        System.out.println(personService.getPersons().get(0).toString());
    }
*/

}