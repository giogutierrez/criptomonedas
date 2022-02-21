package com.giovanny.clientemutante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.giovanny.clientemutante.dto.ConsultaOutDTO;
import com.giovanny.clientemutante.entity.LogAdnEntity;

public interface ILogAdnRepository extends CrudRepository<LogAdnEntity, Long>{
	
	public LogAdnEntity findByAdn(String adn);
	
	@Query("SELECT new com.giovanny.clientemutante.dto.ConsultaOutDTO(count(mutante), mutante) " + 
	       "from  LogAdnEntity group by mutante")
	List<ConsultaOutDTO> countTotal();
}
