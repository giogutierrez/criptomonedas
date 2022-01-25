package com.giovanny.clientemutante.repository;

import org.springframework.data.repository.CrudRepository;

import com.giovanny.clientemutante.entity.LogAdnEntity;

public interface ILogAdnRepository extends CrudRepository<LogAdnEntity, Long>{
	
	
	public LogAdnEntity findByAdn(String adn);

}
