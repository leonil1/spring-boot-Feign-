package com.demofing.repository;

import com.demofing.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {

}
