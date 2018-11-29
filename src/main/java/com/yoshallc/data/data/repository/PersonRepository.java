package com.yoshallc.data.data.repository;

import com.yoshallc.data.data.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
