package com.example.Integrate.Service;

import com.example.Integrate.Entity.Person;
import com.example.Integrate.Repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.Page;


import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    @Mock
    PersonRepository personRepository;

    @InjectMocks
    PersonService personService;

    @Test
    public void getAllPersonsTest() {
        Person p1 = Person.builder().id(1).name("Deja").emailId("Deja@gmail.com").build();
        Person p2 = Person.builder().id(2).name("Loki").emailId("Loki@gmail.com").build();
        List<Person> persons = Arrays.asList(p1, p2);

        when(personRepository.findAll()).thenReturn(persons);
        Page<Person> personList = personService.getAllPersons();

        assertThat(personList.getContent().get(0).getId()).isEqualTo(persons.get(0).getId());
        assertThat(personList.getContent().size()).isEqualTo(persons.size());
    }
}
