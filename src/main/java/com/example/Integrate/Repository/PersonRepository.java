package com.example.Integrate.Repository;

import com.example.Integrate.Entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}

