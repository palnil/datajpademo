package com.yoshallc.data.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="`PERSON`", schema = "HR")
@NoArgsConstructor
@Getter
@Setter
public class Person {


   /* public Person(String firstName,String lastName,String sex,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String sex;
    private int age;*/


   public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;


}
