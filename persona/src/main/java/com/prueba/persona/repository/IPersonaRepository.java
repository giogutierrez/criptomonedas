package com.prueba.persona.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.prueba.persona.entity.PersonaEntity;

public interface IPersonaRepository extends CrudRepository<PersonaEntity, Long>{
	
	
public PersonaEntity findBynumeroDocumento(String numeroDocumento);


@Query("SELECT p FROM PersonaEntity p WHERE p.edad >= ?1 order by p.edad ASC")
public List<PersonaEntity> findByEdad(Long edad);

}
