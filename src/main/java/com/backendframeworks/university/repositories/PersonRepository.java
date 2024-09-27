package com.backendframeworks.university.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backendframeworks.university.models.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, UUID> {

}
