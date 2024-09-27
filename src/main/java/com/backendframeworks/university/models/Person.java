package com.backendframeworks.university.models;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "persons")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	private String name;
	private String cpf;
	private int age;
}
