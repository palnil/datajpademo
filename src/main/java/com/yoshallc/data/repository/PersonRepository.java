package com.yoshallc.data.repository;

import com.yoshallc.data.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
