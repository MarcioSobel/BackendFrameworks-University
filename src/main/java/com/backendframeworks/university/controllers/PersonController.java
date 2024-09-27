package com.backendframeworks.university.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.backendframeworks.university.repositories.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
}
