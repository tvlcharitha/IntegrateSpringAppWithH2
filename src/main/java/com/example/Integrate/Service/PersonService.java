package com.example.Integrate.Service;

import com.example.Integrate.Entity.Person;
import com.example.Integrate.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Page<Person> getAllPersons() {
        List<Person> persons = new ArrayList<Person>();
        personRepository.findAll().forEach(person -> persons.add(person));
        return new PageImpl<>(persons);
    }

    public Person getPersonById(int id) {
        return personRepository.findById(id).get();
    }

    public void saveOrUpdate(Person person) {
        personRepository.save(person);
    }

    public void update(Person person){
        Person p1 = new Person();
        p1.setName(person.getName());
        p1.setAge(person.getAge());
        p1.setEmailId(person.getEmailId());
        personRepository.save(p1);
    }
    public void delete(int id) {
        personRepository.deleteById(id);
    }
}
