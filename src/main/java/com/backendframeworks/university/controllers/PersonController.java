package com.backendframeworks.university.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendframeworks.university.dtos.PersonDto;
import com.backendframeworks.university.models.Person;
import com.backendframeworks.university.repositories.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@PostMapping("/person")
	public ResponseEntity<Person> createPerson(@RequestBody PersonDto personDto) {
		Person person = new Person();
		BeanUtils.copyProperties(personDto, person);

		Person savedPerson = personRepository.save(person);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedPerson);
	}
}
