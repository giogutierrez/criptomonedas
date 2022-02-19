package com.giovanny.clientemutante.entity;

import java.time.LocalDateTime;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Data
@Cacheable(false)
@Entity 
@Table(name = "log_adn", schema = "mutant")
public class LogAdnEntity {
	
	@Id
	@SequenceGenerator(name = "LOGADN_GENERATOR", sequenceName = "mutant.log_adn_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOGADN_GENERATOR")
    @Column(name = "id_log")
    private Long idLog;
	
	@Column(name = "adn")
	private String adn;
	
	@Column(name = "mutante")
	private Boolean mutante;
	
	@Column(name = "fecha")
	private LocalDateTime fecha;
	

}
